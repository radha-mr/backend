package com.netflax.content.db.model;

import javax.persistence.*;

@Entity
@Table(name = "content")
public class EContent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long contentId;

    private String title;

    @Column(name = "type_id")
    private int typeId;

    @Column(name = "category_id")
    private int categoryId;
    private String summary;

    private String logoUrl;

    private String bannerUrl;

    private String thumbnailUrl;
    private String status;

    public EContent() {
    }

    public EContent(String title, int typeId, int categoryId, String summary, String logoUrl, String bannerUrl, String thumbnailUrl, String status) {
        this.title = title;
        this.typeId = typeId;
        this.categoryId = categoryId;
        this.summary = summary;
        this.logoUrl = logoUrl;
        this.bannerUrl = bannerUrl;
        this.thumbnailUrl = thumbnailUrl;
        this.status = status;
    }

    public long getContentId() {
        return contentId;
    }

    public void setContentId(long contentId) {
        this.contentId = contentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(String bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
