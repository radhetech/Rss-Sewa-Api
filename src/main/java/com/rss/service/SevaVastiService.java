package com.rss.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rss.domain.SevaVasti;
import com.rss.repository.SevaVastiRepository;
import com.rss.service.dto.SevaVastiDTO;

/**
 * Service class for managing SevaVasti.
 */
@Service
public class SevaVastiService {

    private static final Logger log = LoggerFactory.getLogger(SevaVastiService.class);

    private final SevaVastiRepository sevaVastiRepository;

    public SevaVastiService(SevaVastiRepository sevaVastiRepository) {
        this.sevaVastiRepository = sevaVastiRepository;
    }

    public List<SevaVasti> getSevaVastiListByTalukaId(String talukaId) {
        return sevaVastiRepository.findByTalukaId(talukaId);
    }

    public void saveUpdateSevaVasti(SevaVastiDTO sevaVastiDTO) {
        SevaVasti sevaVasti = new SevaVasti();
        sevaVasti.setSevaVastiName(sevaVastiDTO.getSevaVastiName());
        sevaVasti.setTalukaId(sevaVastiDTO.getTalukaId());
        sevaVasti.setSevaVastiId(sevaVastiDTO.getSevaVastiId());
        sevaVastiRepository.save(sevaVasti);

    }

}
