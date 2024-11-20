package com.rss.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rss.domain.Taluka;

/**
 * Spring Data MongoDB repository for the {@link Taluka} entity.
 */
@Repository
public interface TalukaRepository extends MongoRepository<Taluka, String>  {
    List<Taluka> findByJillaId(String jillaId);
}
