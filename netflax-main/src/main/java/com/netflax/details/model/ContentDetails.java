package com.netflax.details.model;

import com.fasterxml.jackson.annotation.*;


public class ContentDetails {

    private final long Id;

    @JsonProperty("content_id")
    private final long contentId;

    @JsonProperty("video_code")
    private final String videoCode;

    public ContentDetails(long id, long contentId, String videoCode) {
        Id = id;
        this.contentId = contentId;
        this.videoCode = videoCode;
    }

    public long getId() {
        return Id;
    }

    public long getContentId() {
        return contentId;
    }

    public String getVideoCode() {
        return videoCode;
    }
}
