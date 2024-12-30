package com.rss.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rss.domain.SevaDarshan;

/**
 * Spring Data MongoDB repository for the {@link SevaDarshan} entity.
 */
@Repository
public interface SevaDarshanRepository extends MongoRepository<SevaDarshan, String>  {

      List<SevaDarshan> findBySevaVastiIdAndYear(String sevaVastiId, int year);
 
}
