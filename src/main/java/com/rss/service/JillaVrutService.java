package com.rss.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rss.domain.JillaVrut;
import com.rss.repository.JillaVrutRepository;
import com.rss.service.dto.JillaVrutDTO;

/**
 * Service class for managing SevaVasti.
 */
@Service
public class JillaVrutService {

    private static final Logger log = LoggerFactory.getLogger(JillaVrutService.class);

    private final JillaVrutRepository jillaVrutRepository;

    public JillaVrutService(JillaVrutRepository jillaVrutRepository) {
        this.jillaVrutRepository = jillaVrutRepository;
    }

    public void saveUpdateJillaVrut(JillaVrutDTO jillaVrutDTO){
        JillaVrut jillaVrut = new JillaVrut();
        jillaVrut.setId(jillaVrutDTO.getId());
        jillaVrut.setShiksha(jillaVrutDTO.getShiksha());
        jillaVrut.setAarogya(jillaVrutDTO.getAarogya());
        jillaVrut.setSwavalamban(jillaVrutDTO.getSwavalamban());
        jillaVrut.setSamajik(jillaVrutDTO.getSamajik());
        jillaVrut.setjBethak(jillaVrutDTO.getjBethak());
        jillaVrut.setShakhaPravasNum(jillaVrutDTO.getShakhaPravasNum());
        jillaVrut.setSevaVastiPravasNum(jillaVrutDTO.getSevaVastiPravasNum());
        jillaVrut.setSevaKaryaPravasNum(jillaVrutDTO.getSevaKaryaPravasNum());
        jillaVrut.setPrant(jillaVrutDTO.getPrant());
        jillaVrut.setVibhagId(jillaVrutDTO.getVibhagId());
        jillaVrut.setJillaId(jillaVrutDTO.getJillaId());
        jillaVrut.setMonth(jillaVrutDTO.getMonth());
        jillaVrut.setYear(jillaVrutDTO.getYear());
        jillaVrutRepository.save(jillaVrut);

    }

    public List<JillaVrut> findByJillaIdAndMonthAndYear(String jillaId, String month,int year) {
        return jillaVrutRepository.findByJillaIdAndMonthAndYear(jillaId, month,year);
    }
    

    

    
}
