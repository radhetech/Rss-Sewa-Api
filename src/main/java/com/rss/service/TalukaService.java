package com.rss.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rss.domain.Taluka;
import com.rss.repository.TalukaRepository;

/**
 * Service class for managing Taluka.
 */
@Service
public class TalukaService {

    private static final Logger log = LoggerFactory.getLogger(TalukaService.class);

    private final TalukaRepository talukaRepository;

    public TalukaService(TalukaRepository talukaRepository) {
        this.talukaRepository = talukaRepository;

    }

    public List<Taluka> getTalukaListByJillaId(String jillaId) {
        return talukaRepository.findByJillaId(jillaId);
    }

}
