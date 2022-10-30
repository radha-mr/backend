package com.netflax.details.service;

import com.netflax.content.db.model.EContent;
import com.netflax.content.model.ContentResponse;
import com.netflax.details.db.model.EDetailsContent;
import com.netflax.details.db.model.EDetailsSeries;
import com.netflax.details.db.repository.DetailsContentRepository;
import com.netflax.details.db.repository.DetailsSeriesRepository;
import com.netflax.details.model.ContentDetails;
import com.netflax.details.model.SeriesDetails;
import com.netflax.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DetailsService {

    private final DetailsSeriesRepository detailsSeriesRepository;
    private final DetailsContentRepository detailsContentRepository;

    public DetailsService(DetailsSeriesRepository detailsSeriesRepository,
                          DetailsContentRepository detailsContentRepository) {
        this.detailsSeriesRepository = detailsSeriesRepository;
        this.detailsContentRepository = detailsContentRepository;
    }

    public List<SeriesDetails> getSeriesDetails(long id) {
        List<EDetailsSeries> eDetailsSeriesList = detailsSeriesRepository.findByContentId(id);
        List<SeriesDetails> seriesDetailsList = new ArrayList<>();
        for (EDetailsSeries e : eDetailsSeriesList) {
            SeriesDetails details = new SeriesDetails(
                    e.getId(),
                    e.getContentId(),
                    e.getSeasonNumber(),
                    e.getEpisodeNumber(),
                    e.getSeriesTitle(),
                    e.getSummary(),
                    e.getThumbnailUrl(),
                    e.getVideoCode());
            seriesDetailsList.add(details);
        }
        return seriesDetailsList;
    }

    public ContentDetails getContentDetails(long id) {
        Optional<EDetailsContent> e = detailsContentRepository.findByContentId(id);
        return e.map(eDetailsContent -> new ContentDetails(
                eDetailsContent.getId(),
                eDetailsContent.getContentId(),
                eDetailsContent.getVideoCode())).orElseThrow(ResourceNotFoundException::new);
    }
    /*
    public void createSeriesDetails(SeriesDetails seriesDetails)
    {
       EDetailsSeries  eDetailsSeries = new EDetailsSeries();
        eDetailsSeries.setSeasonNumber((int) seriesDetails.getSeasonNumber());
        eDetailsSeries.setEpisodeNumber((int) seriesDetails.getEpisodeNumber());
        eDetailsSeries.setSeriesTitle(seriesDetails.getTitle());
        eDetailsSeries.setSummary(seriesDetails.getSummary());
        eDetailsSeries.setThumbnailUrl(seriesDetails.getThumbnailUrl());
        eDetailsSeries.setVideoCode(seriesDetails.getVideoCode());
        SeriesDetails seriesDetails1 = detailsSeriesRepository.saveAndFlush(eDetailsSeries);

    }

    public void createContentDetails(ContentDetails contentDetails) {
        EDetailsContent eDetailsContent = new EDetailsContent();
        eDetailsContent.setVideoCode(contentDetails.getVideoCode());
        ContentDetails contentDetails1 = detailsContentRepository.saveAndFlush(eDetailsContent);
    }

     */
}
