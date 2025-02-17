package com.rss.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rss.domain.Vibhag;

/**
 * Spring Data MongoDB repository for the {@link Vibhag} entity.
 */
@Repository
public interface VibhagRepository extends MongoRepository<Vibhag, String>  {
    List<Vibhag> findAll();

    Optional<Vibhag> findByVibhagId(String vibhagId);
}
