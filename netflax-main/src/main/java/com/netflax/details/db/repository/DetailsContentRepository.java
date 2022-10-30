package com.netflax.details.db.repository;

import com.netflax.details.db.model.EDetailsContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DetailsContentRepository extends JpaRepository<EDetailsContent, Long> {

    Optional<EDetailsContent> findByContentId(long id);
}
