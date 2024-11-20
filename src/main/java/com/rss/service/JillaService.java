package com.rss.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rss.domain.Jilla;
import com.rss.repository.JillaRepository;

/**
 * Service class for managing Jilla.
 */
@Service
public class JillaService {

    private static final Logger log = LoggerFactory.getLogger(JillaService.class);

    private final JillaRepository jillaRepository;

    public JillaService(JillaRepository jillaRepository) {
        this.jillaRepository = jillaRepository;

    }

    public List<Jilla> getJillaListByVibhagId(String vibhagID) {
        return jillaRepository.findByVibhagID(vibhagID);
    }

}
