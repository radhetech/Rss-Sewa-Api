package com.rss.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.rss.domain.SevaDarshan;

/**
 * Spring Data MongoDB repository for the {@link SevaDarshan} entity.
 */
@Repository
public interface SevaDarshanRepository extends MongoRepository<SevaDarshan, String>  {

      @Query("{'vibhag.vibhagId' : ?0,'year' : ?1}")
      List<SevaDarshan> findByVibhagIdAndYear(String vibhagId, int year);

      @Query("{'vibhag.vibhagId' : ?0,'sevaVasti.sevaVastiId' : ?1,'year' : ?2}")
      List<SevaDarshan> findByVibhagIdAndSevaVastiIdAndYear(String vibhagId,Optional<String> sevaVastiId, int year);

      @Query("{'vibhag.vibhagId' : ?0,'jilla.jillaId' : ?1,'year' : ?2}")
      List<SevaDarshan> findByVibhagIdAndJillaIdAndYear(String vibhagId,Optional<String> jillaId, int year);

      @Query("{'vibhag.vibhagId' : ?0,'jilla.jillaId' : ?1,'sevaVasti.sevaVastiId' : ?2,'year' : ?3}")
      List<SevaDarshan> findByVibhagIdAndJillaIdAndSevaVastiIdAndYear(String vibhagId,Optional<String> jillaId,Optional<String> sevaVastiId, int year);
 
}
