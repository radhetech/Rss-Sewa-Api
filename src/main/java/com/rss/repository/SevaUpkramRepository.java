package com.rss.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rss.domain.SevaUpkram;

/**
 * Spring Data MongoDB repository for the {@link SevaUpkram} entity.
 */
@Repository
public interface SevaUpkramRepository extends MongoRepository<SevaUpkram, String>  {

    List<SevaUpkram> findBySevaVastiIdAndMonth(String sevaVastiId, String month);
 
}
