package com.rss.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rss.domain.SevaKarya;

/**
 * Spring Data MongoDB repository for the {@link SevaKarya} entity.
 */
@Repository
public interface SevaKaryaRepository extends MongoRepository<SevaKarya, String>  {
 
}
