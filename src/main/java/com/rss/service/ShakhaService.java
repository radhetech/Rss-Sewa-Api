package com.rss.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rss.domain.Shakha;
import com.rss.repository.ShakhaRepository;

/**
 * Service class for managing SevaVasti.
 */
@Service
public class ShakhaService {

    private static final Logger log = LoggerFactory.getLogger(ShakhaService.class);

    private final ShakhaRepository shakhaRepository;

    public ShakhaService(ShakhaRepository shakhaRepository) {
        this.shakhaRepository = shakhaRepository;

    }

    public List<Shakha> getShakhaListByVastiId(String vastiId) {
        return shakhaRepository.findBySevaVastiId(vastiId);
    }

}
