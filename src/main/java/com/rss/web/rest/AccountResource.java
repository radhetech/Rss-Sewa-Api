package com.rss.web.rest;

import com.rss.domain.Jilla;
import com.rss.domain.JillaVrut;
import com.rss.domain.SevaKarya;
import com.rss.domain.SevaUpkram;
import com.rss.domain.SevaVasti;
import com.rss.domain.Shakha;
import com.rss.domain.ShakhaVrut;
import com.rss.domain.Taluka;
import com.rss.domain.User;
import com.rss.domain.Vibhag;
import com.rss.repository.JillaRepository;
import com.rss.repository.SevaKaryaRepository;
import com.rss.repository.SevaVastiRepository;
import com.rss.repository.ShakhaRepository;
import com.rss.repository.ShakhaVrutRepository;
import com.rss.repository.TalukaRepository;
import com.rss.repository.UserRepository;
import com.rss.repository.VibhagRepository;
import com.rss.security.SecurityUtils;
import com.rss.service.MailService;
import com.rss.service.SevaKaryaService;
import com.rss.service.SevaUpkramService;
import com.rss.service.SevaVastiService;
import com.rss.service.ShakhaService;
import com.rss.service.ShakhaVrutService;
import com.rss.service.TalukaService;
import com.rss.service.JillaService;
import com.rss.service.JillaVrutService;
import com.rss.service.UserService;
import com.rss.service.VibhagService;
import com.rss.service.dto.AdminUserDTO;
import com.rss.service.dto.JillaVrutDTO;
import com.rss.service.dto.PasswordChangeDTO;
import com.rss.service.dto.SevaKaryaDTO;
import com.rss.service.dto.SevaUpkramDTO;
import com.rss.service.dto.SevaVastiDTO;
import com.rss.service.dto.ShakhaDTO;
import com.rss.service.dto.ShakhaVrutDTO;
import com.rss.service.dto.SummaryReportDTO;
import com.rss.web.rest.errors.*;
import com.rss.web.rest.vm.KeyAndPasswordVM;
import com.rss.web.rest.vm.ManagedUserVM;
import jakarta.validation.Valid;

import java.time.Year;
import java.util.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for managing the current user's account.
 */
@RestController
@RequestMapping("/api")
public class AccountResource {

    private static class AccountResourceException extends RuntimeException {

        private AccountResourceException(String message) {
            super(message);
        }
    }

    private static final Logger log = LoggerFactory.getLogger(AccountResource.class);

    private final UserRepository userRepository;

    private final UserService userService;

    private final MailService mailService;

    private final VibhagService vibhagService;

    private final JillaService jillaService;

    private final TalukaService talukaService;

    private final SevaVastiService sevaVastiService;

    private final ShakhaService shakhaService;

    private final ShakhaVrutService shakhaVrutService;

    private final JillaVrutService jillaVrutService;

    private final SevaUpkramService sevaUpkramService;

    private final SevaKaryaService sevaKaryaService;

    private final SevaVastiRepository sevaVastiRepository;

    private final ShakhaRepository shakhaRepository;

    private final JillaRepository jillaRepository;

    private final TalukaRepository talukaRepository;

    private final SevaKaryaRepository sevaKaryaRepository;

    private final VibhagRepository vibhagRepository;
    
    private final ShakhaVrutRepository shakhaVrutRepository;

     


    public AccountResource(UserRepository userRepository, UserService userService, MailService mailService,VibhagService vibhagService,JillaService jillaService,TalukaService talukaService,SevaVastiService sevaVastiService,ShakhaService shakhaService,ShakhaVrutService shakhaVrutService,JillaVrutService jillaVrutService,
                            SevaUpkramService sevaUpkramService,SevaKaryaService sevaKaryaService,SevaVastiRepository sevaVastiRepository,ShakhaRepository shakhaRepository,JillaRepository jillaRepository, TalukaRepository talukaRepository,SevaKaryaRepository sevaKaryaRepository,VibhagRepository vibhagRepository,
                            ShakhaVrutRepository shakhaVrutRepository) {
        this.userRepository = userRepository;
        this.userService = userService;
        this.mailService = mailService;
        this.vibhagService = vibhagService;
        this.jillaService = jillaService;
        this.talukaService = talukaService;
        this.sevaVastiService = sevaVastiService;
        this.shakhaService = shakhaService;
        this.shakhaVrutService = shakhaVrutService;
        this.jillaVrutService = jillaVrutService;
        this.sevaUpkramService = sevaUpkramService;
        this.sevaKaryaService =  sevaKaryaService;
        this.sevaVastiRepository = sevaVastiRepository;
        this.shakhaRepository = shakhaRepository;
        this.jillaRepository  = jillaRepository;
        this.talukaRepository = talukaRepository;
        this.sevaKaryaRepository = sevaKaryaRepository;
        this.vibhagRepository = vibhagRepository;
        this.shakhaVrutRepository = shakhaVrutRepository;
    }

    /**
     * {@code POST  /register} : register the user.
     *
     * @param managedUserVM the managed user View Model.
     * @throws InvalidPasswordException {@code 400 (Bad Request)} if the password is incorrect.
     * @throws EmailAlreadyUsedException {@code 400 (Bad Request)} if the email is already used.
     * @throws LoginAlreadyUsedException {@code 400 (Bad Request)} if the login is already used.
     */
    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerAccount(@Valid @RequestBody ManagedUserVM managedUserVM) {
        if (isPasswordLengthInvalid(managedUserVM.getPassword())) {
            throw new InvalidPasswordException();
        }
        User user = userService.registerUser(managedUserVM, managedUserVM.getPassword());
        //mailService.sendActivationEmail(user);
    }

    /**
     * {@code GET  /activate} : activate the registered user.
     *
     * @param key the activation key.
     * @throws RuntimeException {@code 500 (Internal Server Error)} if the user couldn't be activated.
     */
    @GetMapping("/activate")
    public void activateAccount(@RequestParam(value = "key") String key) {
        Optional<User> user = userService.activateRegistration(key);
        if (!user.isPresent()) {
            throw new AccountResourceException("No user was found for this activation key");
        }
    }

    /**
     * {@code GET  /account} : get the current user.
     *
     * @return the current user.
     * @throws RuntimeException {@code 500 (Internal Server Error)} if the user couldn't be returned.
     */
    @GetMapping("/account")
    public AdminUserDTO getAccount() {
        return userService
            .getUserWithAuthorities()
            .map(AdminUserDTO::new)
            .orElseThrow(() -> new AccountResourceException("User could not be found"));
    }

    /**
     * {@code POST  /account} : update the current user information.
     *
     * @param userDTO the current user information.
     * @throws EmailAlreadyUsedException {@code 400 (Bad Request)} if the email is already used.
     * @throws RuntimeException {@code 500 (Internal Server Error)} if the user login wasn't found.
     */
    @PostMapping("/account")
    public void saveAccount(@Valid @RequestBody AdminUserDTO userDTO) {
        String userLogin = SecurityUtils.getCurrentUserLogin()
            .orElseThrow(() -> new AccountResourceException("Current user login not found"));
        Optional<User> existingUser = userRepository.findOneByEmailIgnoreCase(userDTO.getEmail());
        if (existingUser.isPresent() && (!existingUser.orElseThrow().getLogin().equalsIgnoreCase(userLogin))) {
            throw new EmailAlreadyUsedException();
        }
        Optional<User> user = userRepository.findOneByLogin(userLogin);
        if (!user.isPresent()) {
            throw new AccountResourceException("User could not be found");
        }
        userService.updateUser(
            userDTO.getFirstName(),
            userDTO.getLastName(),
            userDTO.getEmail(),
            userDTO.getLangKey(),
            userDTO.getImageUrl()
        );
    }

    /**
     * {@code POST  /account/change-password} : changes the current user's password.
     *
     * @param passwordChangeDto current and new password.
     * @throws InvalidPasswordException {@code 400 (Bad Request)} if the new password is incorrect.
     */
    @PostMapping(path = "/account/change-password")
    public void changePassword(@RequestBody PasswordChangeDTO passwordChangeDto) {
        if (isPasswordLengthInvalid(passwordChangeDto.getNewPassword())) {
            throw new InvalidPasswordException();
        }
        userService.changePassword(passwordChangeDto.getCurrentPassword(), passwordChangeDto.getNewPassword());
    }

    /**
     * {@code POST   /account/reset-password/init} : Send an email to reset the password of the user.
     *
     * @param mail the mail of the user.
     */
    @PostMapping(path = "/account/reset-password/init")
    public void requestPasswordReset(@RequestBody String mail) {
        Optional<User> user = userService.requestPasswordReset(mail);
        if (user.isPresent()) {
            mailService.sendPasswordResetMail(user.orElseThrow());
        } else {
            // Pretend the request has been successful to prevent checking which emails really exist
            // but log that an invalid attempt has been made
            log.warn("Password reset requested for non existing mail");
        }
    }

    /**
     * {@code POST   /account/reset-password/finish} : Finish to reset the password of the user.
     *
     * @param keyAndPassword the generated key and the new password.
     * @throws InvalidPasswordException {@code 400 (Bad Request)} if the password is incorrect.
     * @throws RuntimeException {@code 500 (Internal Server Error)} if the password could not be reset.
     */
    @PostMapping(path = "/account/reset-password/finish")
    public void finishPasswordReset(@RequestBody KeyAndPasswordVM keyAndPassword) {
        if (isPasswordLengthInvalid(keyAndPassword.getNewPassword())) {
            throw new InvalidPasswordException();
        }
        Optional<User> user = userService.completePasswordReset(keyAndPassword.getNewPassword(), keyAndPassword.getKey());

        if (!user.isPresent()) {
            throw new AccountResourceException("No user was found for this reset key");
        }
    }

    private static boolean isPasswordLengthInvalid(String password) {
        return (
            StringUtils.isEmpty(password) ||
            password.length() < ManagedUserVM.PASSWORD_MIN_LENGTH ||
            password.length() > ManagedUserVM.PASSWORD_MAX_LENGTH
        );
    }

    @GetMapping("/getVibhag")
    public List<Vibhag> getVibhag() {
        return vibhagService
            .getVibhagList()
            .stream().toList();
    }
    @GetMapping("/getJilla/{vibhagId}")
    public List<Jilla> getJilla(@PathVariable("vibhagId") String vibhagId) {
        return jillaService
            .getJillaListByVibhagId(vibhagId)
            .stream().toList();
    }
    @GetMapping("/getTaluka/{jillaId}")
    public List<Taluka> getTaluka(@PathVariable("jillaId") String jillaId) {
        return talukaService
            .getTalukaListByJillaId(jillaId)
            .stream().toList();
    }

    @PostMapping("/sevaVasti/save")
    public ResponseEntity<SevaVasti> saveSevaVasti(@Valid @RequestBody SevaVastiDTO sevaVastiDTO) throws Exception {
        String message = "";
        String userLogin = SecurityUtils.getCurrentUserLogin()
                .orElseThrow(() -> new AccountResourceException("Current user login not found"));
        if (null == sevaVastiDTO.getSevaVastiId() || sevaVastiDTO.getSevaVastiId().isBlank() || sevaVastiDTO.getSevaVastiId().isEmpty()) {
            Optional<SevaVasti> existingSevaVastiName = sevaVastiRepository
                    .findOneBySevaVastiNameIgnoreCase(sevaVastiDTO.getSevaVastiName());
            if (existingSevaVastiName.isPresent()) {
                throw new Exception("Seva Vasti is already present");
            }
        }  
        SevaVasti sevaVasti  =  sevaVastiService.saveUpdateSevaVasti(sevaVastiDTO);
        return new ResponseEntity<>(sevaVasti, HttpStatus.OK);
    }

    @GetMapping("/getSevaVasti/{talukaId}")
    public List<SevaVasti> getSevaVasti(@PathVariable("talukaId") String talukaId) {
        return sevaVastiService
            .getSevaVastiListByTalukaId(talukaId)
            .stream().toList();
    }

    @PostMapping("/shakha/save")
    public ResponseEntity<Shakha> saveShakha(@Valid @RequestBody ShakhaDTO shakhaDTO) throws Exception {
        String message = "";
        String userLogin = SecurityUtils.getCurrentUserLogin()
                .orElseThrow(() -> new AccountResourceException("Current user login not found"));
        if (null == shakhaDTO.getShakhaId() || shakhaDTO.getShakhaId().isBlank() || shakhaDTO.getShakhaId().isEmpty()) {
            Optional<Shakha> existingShakhaName = shakhaRepository
                    .findOneByShakhaNameIgnoreCase(shakhaDTO.getShakhaName());
            if (existingShakhaName.isPresent()) {
                throw new Exception("Shakha is already present");
            }
        }  
        Shakha newdata = shakhaService.saveUpdateShakha(shakhaDTO);
        return new ResponseEntity<>(newdata, HttpStatus.OK);
    }

    @GetMapping("/getShakha/{vastiId}")
    public List<Shakha> getShakha(@PathVariable("vastiId") String vastiId) {
        return shakhaService
            .getShakhaListByVastiId(vastiId)
            .stream().toList();
    }
    @PostMapping("/shakhaVrut")
    public ResponseEntity saveShakhaVrut(@Valid @RequestBody ShakhaVrutDTO shakhaVrutDTO) {
        String userLogin = SecurityUtils.getCurrentUserLogin()
            .orElseThrow(() -> new AccountResourceException("Current user login not found"));
        
            shakhaVrutService.saveUpdateShakhaVrut(shakhaVrutDTO);
        
        return new ResponseEntity<>("Shakha Vrut Created", HttpStatus.OK);

    }

    @PostMapping("/jillaVrut")
    public ResponseEntity<String> saveJillaVrut(@Valid @RequestBody JillaVrutDTO jillaVrutDTO) {
        String userLogin = SecurityUtils.getCurrentUserLogin()
                .orElseThrow(() -> new AccountResourceException("Current user login not found"));
        jillaVrutService.saveUpdateJillaVrut(jillaVrutDTO);
        return new ResponseEntity<>("Jilla Vrut Created", HttpStatus.OK);
    }
    @PostMapping("/sevaUpkram")
    public ResponseEntity<String> saveSevaUpkram(@Valid @RequestBody SevaUpkramDTO sevaUpkramDTO) {
        String userLogin = SecurityUtils.getCurrentUserLogin()
                .orElseThrow(() -> new AccountResourceException("Current user login not found"));
        sevaUpkramService.saveUpdateSevaUpkram(sevaUpkramDTO);
        return new ResponseEntity<>("Seva Upkram Created", HttpStatus.OK);
    }

    @PostMapping("/sevaKarya")
    public ResponseEntity<String> saveSevaKarya(@Valid @RequestBody SevaKaryaDTO sevaKaryaDTO) {
        String userLogin = SecurityUtils.getCurrentUserLogin()
                .orElseThrow(() -> new AccountResourceException("Current user login not found"));
            sevaKaryaService.saveUpdateSevaKarya(sevaKaryaDTO);
        return new ResponseEntity<>("Seva Karya Created", HttpStatus.OK);
    }
    @GetMapping("/getShakhaVrut")
    public List<ShakhaVrut> getShakhaVrutByVastiIdAndSelectedDate(@RequestParam("vastiId") String vastiId,@RequestParam("shakhaId") String shakhaId,@RequestParam("selectedDate") String selectedDate) {
        return shakhaVrutService.findByVastiIdAndShakhaIdAndSelectedDate(vastiId,shakhaId,selectedDate).stream().toList();
    }

    @GetMapping("/getJillaVrut/{jillaId}/{month}/{year}")
    public List<JillaVrut> getJillaVrutByJillaIdAndMonth(@PathVariable("jillaId") String jillaId,@PathVariable("month") String month,@PathVariable("year") String year) {
        return jillaVrutService.findByJillaIdAndMonthAndYear(jillaId,month,Integer.parseInt(year))
            .stream().toList();
    }
    @GetMapping("/getSevaUpkram/{vastiId}/{month}/{year}")
    public List<SevaUpkram> getSevaUpkramByVastiIdAndMonth(@PathVariable("vastiId") String vastiId,@PathVariable("month") String month,@PathVariable("year") String year) {
        return sevaUpkramService.findBySevaUpkramByVastiIdAndMonthAndYear(vastiId,month,Integer.parseInt(year))
            .stream().toList();
    }
    @GetMapping("/getSevaKarya/{vastiId}/{year}")
    public List<SevaKarya> getSevaKaryaByVastiIdAndYear(@PathVariable("vastiId") String vastiId,@PathVariable("year") String year,
    @RequestParam("shakhaId") Optional<String> shakhaId) {
        System.out.println("shakhaId"+shakhaId);
        return sevaKaryaService.findBySevaKaryaByVastiIdAndYear(vastiId,shakhaId,Integer.parseInt(year))
            .stream().toList();
    }

    @GetMapping("/getSummaryReportbyVibhag/{vibhagId}")
    public List<SummaryReportDTO> getSevaKaryaByVastiIdAndYear(@PathVariable("vibhagId") String vibhagId) {
        List<SummaryReportDTO> summaryReportList = new ArrayList<SummaryReportDTO>();

        Optional<Vibhag> vibhag = vibhagRepository.findByVibhagId(vibhagId);

        List<Jilla> jillaList = jillaRepository.findByVibhagID(vibhagId);

        for (Jilla jilla : jillaList) {
            SummaryReportDTO srD = new SummaryReportDTO();
            if(vibhag.get().getIsMahanagar()){
               srD.setMahaNagarCount(1); 
            }else{
                srD.setMahaNagarCount(0); 
            }
            srD.setJillaName(jilla.getJillaName());
            List<Taluka> talukas = talukaRepository.findByJillaId(jilla.getJillaId());
            int totalSevaVasti = 0;
            int totalSevaVastiWithSevaKarya = 0;
            int monthlySevaVastiConnect = 0;
            for (Taluka taluka : talukas) {
                List<SevaVasti> sevaVastiList  = this.sevaVastiRepository.findByTalukaId(taluka.getTalukaId());
                totalSevaVasti = totalSevaVasti + sevaVastiList.size();
                for (SevaVasti sevaVasti : sevaVastiList) {
                    totalSevaVastiWithSevaKarya = totalSevaVastiWithSevaKarya + this.sevaKaryaRepository.findBySevaVastiIdAndYear(sevaVasti.getSevaVastiId(), Year.now().getValue()).size();
                   List<ShakhaVrut> shakhaVrutlst =  this.shakhaVrutRepository.findByVastiId(sevaVasti.getSevaVastiId());
                   for (ShakhaVrut ShakhaVrut : shakhaVrutlst) {
                    if(ShakhaVrut.getSelectedCategory().equalsIgnoreCase("M")){
                        monthlySevaVastiConnect = monthlySevaVastiConnect+1; 
                    }
                   }
                }
                
            }
            srD.setMonthlyvastiContactBranchandMeetingNumber(monthlySevaVastiConnect);
            srD.setTotalVastiWithSevaKarya(totalSevaVastiWithSevaKarya);
            srD.setSevaVastiCount(totalSevaVasti);
            summaryReportList.add(srD);
        }
        //System.out.println("jillaList" + jillaList.size());
        return summaryReportList;
    }
}
