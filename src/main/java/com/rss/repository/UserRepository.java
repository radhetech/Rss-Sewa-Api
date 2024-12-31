package com.rss.repository;

import com.rss.domain.User;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the {@link User} entity.
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findOneByActivationKey(String activationKey);
    List<User> findAllByActivatedIsFalseAndActivationKeyIsNotNullAndCreatedDateBefore(Instant dateTime);
    Optional<User> findOneByResetKey(String resetKey);
    Optional<User> findOneByEmailIgnoreCase(String email);
    Optional<User> findOneByLogin(String login);

    Page<User> findAllByIdNotNullAndActivatedIsTrue(Pageable pageable);

    List<User> findAllByIdNotNullAndActivatedIsTrue();

    @Query("{'vibhag.vibhagId' : ?0}")
    List<User> findAllByIdNotNullAndActivatedIsTrueAndVibhagId(Optional<String> vibhagId);
    @Query("{'jilla.jillaId' : ?0}")
    List<User> findAllByIdNotNullAndActivatedIsTrueAndJillaId(Optional<String>  jillaId);
    @Query("{'taluka.talukaId' : ?0}")
    List<User> findAllByIdNotNullAndActivatedIsTrueAndTalukaId(Optional<String>  talukaId);

    @Query("{'vibhag.vibhagId' : ?0,'jilla.jillaId' : ?1,'taluka.talukaId' : ?2}")
    List<User> findAllByIdNotNullAndActivatedIsTrueAndVibhagIdAndJillaIdAndTalukaId(Optional<String> vibhagId,Optional<String>  jillaId,Optional<String>  talukaId);

    @Query("{'vibhag.vibhagId' : ?0,'jilla.jillaId' : ?1")
    List<User> findAllByIdNotNullAndActivatedIsTrueAndVibhagIdAndJillaId(Optional<String> vibhagId,Optional<String>  jillaId);

    @Query("{'jilla.jillaId' : ?0,'taluka.talukaId' : ?1}")
    List<User> findAllByIdNotNullAndActivatedIsTrueAndJillaIdAndTalukaId(Optional<String>  jillaId,Optional<String>  talukaId);

    @Query("{'vibhag.vibhagId' : ?0, ,'taluka.talukaId' : ?1}")
    List<User> findAllByIdNotNullAndActivatedIsTrueAndVibhagIdAndTalukaId(Optional<String>  vibhagId,Optional<String>  talukaId);
}
