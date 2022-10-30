package com.netflax.details.db.repository;

import com.netflax.details.db.model.EDetailsSeries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetailsSeriesRepository extends JpaRepository<EDetailsSeries, Long> {
    List<EDetailsSeries> findByContentId(long id);

}
