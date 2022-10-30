package com.netflax.content.db.repository;

import com.netflax.content.db.model.EContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ContentRepository extends JpaRepository<EContent, Long> {

    List<EContent> findBySummaryContains(String summary);

    List<EContent> findAll();

    List<EContent> findByStatus(String status);

    Optional<EContent> findByContentId(long id);

    List<EContent> findByTypeIdAndStatus(int typeId, String status);

    List<EContent> findByTitleContainsAndStatus(String freeText, String status);

    List<EContent> findByCategoryIdAndStatus(int categoryId, String status);
}
