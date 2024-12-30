package com.rss.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rss.domain.SevaDarshan;
import com.rss.repository.SevaDarshanRepository;
import com.rss.service.dto.SevaDarshanDTO;

/**
 * Service class for managing SevaDarshan.
 */
@Service
public class SevaDarshanService {

    private static final Logger log = LoggerFactory.getLogger(SevaDarshanService.class);

    private final SevaDarshanRepository sevaDarshanRepository;

    public SevaDarshanService(SevaDarshanRepository sevaDarshanRepository) {
        this.sevaDarshanRepository = sevaDarshanRepository;
    }

    public void saveUpdateSevaDarshan(SevaDarshanDTO sevaDarshanDTO) {
        SevaDarshan sevaDarshan = new SevaDarshan();
        sevaDarshan.setId(sevaDarshanDTO.getId());
        sevaDarshan.setShiksha(sevaDarshanDTO.getShiksha());
        sevaDarshan.setAayogya(sevaDarshanDTO.getAayogya());
        sevaDarshan.setSwavalamban(sevaDarshanDTO.getSwavalamban());
        sevaDarshan.setSamajik(sevaDarshanDTO.getSamajik());
        sevaDarshan.setPrant(sevaDarshanDTO.getPrant());
        sevaDarshan.setVibhagId(sevaDarshanDTO.getVibhagId());
        sevaDarshan.setJillaId(sevaDarshanDTO.getJillaId());
        sevaDarshan.setTalukaId(sevaDarshanDTO.getTalukaId());
        sevaDarshan.setSevaVastiId(sevaDarshanDTO.getSevaVastiId());
        sevaDarshan.setReportingPerson(sevaDarshanDTO.getReportingPerson());
        sevaDarshan.setYear(sevaDarshanDTO.getYear());
        sevaDarshanRepository.save(sevaDarshan);

    }

    public List<SevaDarshan> findBySevaDarshanByVastiIdAndYear(String vastiId, int year) {

        return sevaDarshanRepository.findBySevaVastiIdAndYear(vastiId, year);
    }

}
