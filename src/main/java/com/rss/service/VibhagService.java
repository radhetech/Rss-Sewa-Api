package com.rss.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rss.domain.Vibhag;
import com.rss.repository.VibhagRepository;

/**
 * Service class for managing Vibhag.
 */
@Service
public class VibhagService {

    private static final Logger log = LoggerFactory.getLogger(VibhagService.class);

    private final VibhagRepository vibhagRepository;

    public VibhagService(VibhagRepository vibhagRepository) {
        this.vibhagRepository = vibhagRepository;

    }

    public List<Vibhag> getVibhagList() {
        return vibhagRepository.findAll();
    }

}
