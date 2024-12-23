package com.rss.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rss.domain.Shakha;

/**
 * Spring Data MongoDB repository for the {@link Shakha} entity.
 */
@Repository
public interface ShakhaRepository extends MongoRepository<Shakha, String> {
    List<Shakha> findBySevaVastiId(String sevaVastiId);

    Optional<Shakha> findOneByShakhaNameIgnoreCase(String shakhaName);
}
