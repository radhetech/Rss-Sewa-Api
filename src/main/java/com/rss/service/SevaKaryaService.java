package com.rss.service;


import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rss.domain.SevaKarya;
import com.rss.repository.SevaKaryaRepository;
import com.rss.service.dto.SevaKaryaDTO;

/**
 * Service class for managing SevaKarya.
 */
@Service
public class SevaKaryaService {

    private static final Logger log = LoggerFactory.getLogger(SevaKaryaService.class);

    private final SevaKaryaRepository sevaKaryaRepository;

    public SevaKaryaService(SevaKaryaRepository sevaKaryaRepository) {
        this.sevaKaryaRepository = sevaKaryaRepository;
    }

    public void saveUpdateSevaKarya(SevaKaryaDTO sevaKaryaDTO){
        SevaKarya sevaKarya = new SevaKarya();
        sevaKarya.setShiksha(sevaKaryaDTO.getShiksha());
        sevaKarya.setAayogya(sevaKaryaDTO.getAayogya());
        sevaKarya.setSwavalamban(sevaKaryaDTO.getSwavalamban());
        sevaKarya.setSamajik(sevaKaryaDTO.getSamajik());
        sevaKarya.setPrant(sevaKaryaDTO.getPrant());
        sevaKarya.setVibhagId(sevaKaryaDTO.getVibhagId());
        sevaKarya.setJillaId(sevaKaryaDTO.getJillaId());
        sevaKarya.setTalukaId(sevaKaryaDTO.getTalukaId());
        sevaKarya.setSevaVastiId(sevaKaryaDTO.getSevaVastiId());
        sevaKarya.setShakhaId(sevaKaryaDTO.getShakhaId());
        sevaKarya.setYear(sevaKaryaDTO.getYear());
        sevaKaryaRepository.save(sevaKarya);

    }
    public List<SevaKarya> findBySevaKaryaByVastiIdAndYear(String vastiId, Optional<String> shakhaId, int year) {
        if(shakhaId.isPresent()){
            return sevaKaryaRepository.findBySevaVastiIdAndShakhaIdAndYear(vastiId,shakhaId, year);
        }else{
            return sevaKaryaRepository.findBySevaVastiIdAndYear(vastiId, year);
        }
        
    }
}
