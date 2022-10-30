package com.netflax.content.model;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ContentResponse {

    private final long id;
    private final String title;
    @JsonProperty("type_id")
    private final int typeId;
    @JsonProperty("category_id")
    private final int categoryId;
    private final String summary;
    @JsonProperty("logo_url")
    private final String logoUrl;
    @JsonProperty("banner_url")
    private final String bannerUrl;
    @JsonProperty("thumbnail_url")
    private final String thumbnailUrl;


    public ContentResponse(long id, String title,
                           int typeId, int categoryId,
                           String summary, String logoUrl,
                           String bannerUrl, String thumbnailUrl) {
        this.id = id;
        this.title = title;
        this.typeId = typeId;
        this.categoryId = categoryId;
        this.summary = summary;
        this.logoUrl = logoUrl;
        this.bannerUrl = bannerUrl;
        this.thumbnailUrl = thumbnailUrl;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getTypeId() {
        return typeId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public String getSummary() {
        return summary;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public String getBannerUrl() {
        return bannerUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }
}
