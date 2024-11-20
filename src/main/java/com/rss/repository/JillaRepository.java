package com.rss.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rss.domain.Jilla;

/**
 * Spring Data MongoDB repository for the {@link Jilla} entity.
 */
@Repository
public interface JillaRepository extends MongoRepository<Jilla, String>  {
    List<Jilla> findByVibhagID(String vibhagID);
}
