package com.rss.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rss.domain.ShakhaVrut;

/**
 * Spring Data MongoDB repository for the {@link ShakhaVrut} entity.
 */
@Repository
public interface ShakhaVrutRepository extends MongoRepository<ShakhaVrut, String>  {

    List<ShakhaVrut> findByVastiIdAndShakhaIdAndSelectedDate(String vastiId,String shakhaId, String selectedDate);

    List<ShakhaVrut> findByVastiId(String vastiId);


    
}
