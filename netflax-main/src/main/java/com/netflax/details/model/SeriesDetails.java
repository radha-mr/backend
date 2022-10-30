package com.netflax.details.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SeriesDetails {

    private final long id;

    @JsonProperty("content_id")
    private final long contentId;

    @JsonProperty("season_number")
    private final int seasonNumber;

    @JsonProperty("episode_number")
    private final int episodeNumber;

    private final String title;

    private final String summary;

    @JsonProperty("thumbnail_url")
    private final String thumbnailUrl;

    @JsonProperty("video_code")
    private final String videoCode;

    public SeriesDetails(long id, long contentId, int seasonNumber, int episodeNumber, String title, String summary, String thumbnailUrl, String videoCode) {
        this.id = id;
        this.contentId = contentId;
        this.seasonNumber = seasonNumber;
        this.episodeNumber = episodeNumber;
        this.title = title;
        this.summary = summary;
        this.thumbnailUrl = thumbnailUrl;
        this.videoCode = videoCode;
    }

    public long getId() {
        return id;
    }

    public long getContentId() {
        return contentId;
    }

    public long getSeasonNumber() {
        return seasonNumber;
    }

    public long getEpisodeNumber() {
        return episodeNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getVideoCode() {
        return videoCode;
    }
}
