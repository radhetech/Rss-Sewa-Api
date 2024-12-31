package com.rss.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rss.domain.SevaDarshan;

/**
 * Spring Data MongoDB repository for the {@link SevaDarshan} entity.
 */
@Repository
public interface SevaDarshanRepository extends MongoRepository<SevaDarshan, String>  {

      List<SevaDarshan> findByVibhagIdAndYear(String vibhagId, int year);

      List<SevaDarshan> findByVibhagIdAndSevaVastiIdAndYear(String vibhagId,Optional<String> sevaVastiId, int year);

      List<SevaDarshan> findByVibhagIdAndJillaIdAndYear(String vibhagId,Optional<String> jillaId, int year);

      List<SevaDarshan> findByVibhagIdAndJillaIdAndSevaVastiIdAndYear(String vibhagId,Optional<String> jillaId,Optional<String> sevaVastiId, int year);
 
}
