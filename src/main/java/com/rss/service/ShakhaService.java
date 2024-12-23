package com.rss.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.rss.domain.Shakha;
import com.rss.repository.ShakhaRepository;
import com.rss.service.dto.ShakhaDTO;

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

    public Shakha saveUpdateShakha(ShakhaDTO shakhaDTO) {
        Shakha shakha = new Shakha();
        shakha.setShakhaName(shakhaDTO.getShakhaName());
        shakha.setSevaVastiId(shakhaDTO.getSevaVastiId());
        shakha.setShakhaId(shakhaDTO.getShakhaId());
        return shakhaRepository.save(shakha);

    }

}
