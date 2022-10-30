package com.netflax.details.db.model;

import javax.persistence.*;

@Entity
@Table(name = "details_content")
public class EDetailsContent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "content_id")
    private long contentId;

    @Column(name = "video_code")
    private String videoCode;

    public EDetailsContent() {
    }

    public EDetailsContent(long contentId, String videoCode) {
        this.contentId = contentId;
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

    public String getVideoCode() {
        return videoCode;
    }

    public void setVideoCode(String videoCode) {
        this.videoCode = videoCode;
    }
}
