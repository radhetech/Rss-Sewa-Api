package com.rss.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rss.domain.JillaVrut;

/**
 * Spring Data MongoDB repository for the {@link JillaVrut} entity.
 */
@Repository
public interface JillaVrutRepository extends MongoRepository<JillaVrut, String>  {

    List<JillaVrut> findByJillaIdAndMonth(String jillaId, String month);
    
}
