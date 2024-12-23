package com.rss.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rss.domain.SevaVasti;

/**
 * Spring Data MongoDB repository for the {@link SevaVasti} entity.
 */
@Repository
public interface SevaVastiRepository extends MongoRepository<SevaVasti, String>  {
    List<SevaVasti> findByTalukaId(String talukaId);

    Optional<SevaVasti> findOneBySevaVastiNameIgnoreCase(String sevaVastiName);


}
