package com.netflax.details.db.model;

import javax.persistence.*;

@Entity
@Table(name = "details_series")
public class EDetailsSeries {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "content_id")
    private long contentId;

    @Column(name = "season_number")
    private int seasonNumber;

    @Column(name = "episode_number")
    private int episodeNumber;

    @Column(name = "series_title")
    private String seriesTitle;
@Column(name = "summary")
    private String summary;

    @Column(name = "thumbnail_url")
    private String thumbnailUrl;

    @Column(name = "video_code")
    private String videoCode;

    public EDetailsSeries() {
    }

    public EDetailsSeries(long contentId, int seasonNumber, int episodeNumber, String seriesTitle, String summary, String thumbnailUrl, String videoCode) {
        this.contentId = contentId;
        this.seasonNumber = seasonNumber;
        this.episodeNumber = episodeNumber;
        this.seriesTitle = seriesTitle;
        this.summary = summary;
        this.thumbnailUrl = thumbnailUrl;
        this.videoCode = videoCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getContentId() {
        return contentId;
    }

    public void setContentId(long contentId) {
        this.contentId = contentId;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getSeriesTitle() {
        return seriesTitle;
    }

    public void setSeriesTitle(String seriesTitle) {
        this.seriesTitle = seriesTitle;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getVideoCode() {
        return videoCode;
    }

    public void setVideoCode(String videoCode) {
        this.videoCode = videoCode;
    }
}
