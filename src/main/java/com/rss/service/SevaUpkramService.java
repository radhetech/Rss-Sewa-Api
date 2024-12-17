package com.rss.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rss.domain.SevaUpkram;
import com.rss.repository.SevaUpkramRepository;
import com.rss.service.dto.SevaUpkramDTO;

/**
 * Service class for managing SevaUpkram.
 */
@Service
public class SevaUpkramService {

    private static final Logger log = LoggerFactory.getLogger(SevaUpkramService.class);

    private final SevaUpkramRepository sevaUpkramRepository;

    public SevaUpkramService(SevaUpkramRepository sevaUpkramRepository) {
        this.sevaUpkramRepository = sevaUpkramRepository;
    }

    public void saveUpdateSevaUpkram(SevaUpkramDTO sevaUpkramDTO){
        SevaUpkram sevaUpkram = new SevaUpkram();
        sevaUpkram.setShiksha(sevaUpkramDTO.getShiksha());
        sevaUpkram.setAayogya(sevaUpkramDTO.getAayogya());
        sevaUpkram.setSwavalamban(sevaUpkramDTO.getSwavalamban());
        sevaUpkram.setSamajik(sevaUpkramDTO.getSamajik());
        sevaUpkram.setPrant(sevaUpkramDTO.getPrant());
        sevaUpkram.setVibhagId(sevaUpkramDTO.getVibhagId());
        sevaUpkram.setJillaId(sevaUpkramDTO.getJillaId());
        sevaUpkram.setTalukaId(sevaUpkramDTO.getTalukaId());
        sevaUpkram.setSevaVastiId(sevaUpkramDTO.getSevaVastiId());
        sevaUpkram.setMonth(sevaUpkramDTO.getMonth());
        sevaUpkram.setYear(sevaUpkramDTO.getYear());
        sevaUpkramRepository.save(sevaUpkram);

    }
    
}
