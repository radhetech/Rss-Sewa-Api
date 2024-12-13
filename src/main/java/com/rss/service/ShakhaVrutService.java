package com.rss.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rss.domain.ShakhaVrut;
import com.rss.repository.ShakhaVrutRepository;
import com.rss.service.dto.ShakhaVrutDTO;

/**
 * Service class for managing SevaVasti.
 */
@Service
public class ShakhaVrutService {

    private static final Logger log = LoggerFactory.getLogger(ShakhaVrutService.class);

    private final ShakhaVrutRepository shakhaVrutRepository;

    public ShakhaVrutService(ShakhaVrutRepository shakhaVrutRepository) {
        this.shakhaVrutRepository = shakhaVrutRepository;
    }

    public void saveUpdateShakhaVrut(ShakhaVrutDTO shakhaVrutDTO){
        ShakhaVrut shakhaVrut = new ShakhaVrut();
        shakhaVrut.setSelectedCategory(shakhaVrutDTO.getSelectedCategory());
        shakhaVrut.setSelectedDate(shakhaVrutDTO.getSelectedDate());
        shakhaVrut.setPrantId(shakhaVrutDTO.getPrantId());
        shakhaVrut.setVibhagId(shakhaVrutDTO.getVibhagId());
        shakhaVrut.setJillaId(shakhaVrutDTO.getJillaId());
        shakhaVrut.setTalukaId(shakhaVrutDTO.getTalukaId());
        shakhaVrut.setVastiId(shakhaVrutDTO.getVastiId());
        shakhaVrut.setShakhaId(shakhaVrutDTO.getShakhaId());
        shakhaVrut.setMonthlyForm(shakhaVrutDTO.getMonthlyForm());
        shakhaVrut.setWeeklyForm(shakhaVrutDTO.getWeeklyForm());
        shakhaVrutRepository.save(shakhaVrut);

    }

    public List<ShakhaVrut> findAllByVastiIdAndSelectedDate(String vastiId, String selectedDate) {
        return shakhaVrutRepository.findByVastiIdAndSelectedDate(vastiId, selectedDate);
    }
    

    

    
}
