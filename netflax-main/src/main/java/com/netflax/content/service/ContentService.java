package com.netflax.content.service;

import com.netflax.content.db.model.EContent;
import com.netflax.content.db.repository.ContentRepository;
import com.netflax.content.model.ContentCategory;
import com.netflax.content.model.ContentResponse;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContentService {

    private final ContentRepository contentRepository;

    public ContentService(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public List<ContentResponse> getContentByCategory(ContentCategory category) {
        List<EContent> eContents = contentRepository.findByTypeIdAndStatus(category.getCode(),"A");
        List<ContentResponse> responseList = new ArrayList<>();
        getContentResponses(eContents, responseList);
        return responseList;
    }


    private static void getContentResponses(List<EContent> eContents, List<ContentResponse> responseList) {
        for (EContent eContent : eContents) {
            ContentResponse contentResponse = new ContentResponse(
                    eContent.getContentId(),
                    eContent.getTitle(),
                    eContent.getTypeId(),
                    eContent.getCategoryId(),
                    eContent.getSummary(),
                    eContent.getLogoUrl(),
                    eContent.getBannerUrl(),
                    eContent.getThumbnailUrl());
            responseList.add(contentResponse);
        }
    }

    public List<ContentResponse> getContentByFreeText(String freeText) {
        List<EContent> eContents = contentRepository.findByTitleContainsAndStatus(freeText,"A");
        List<ContentResponse> responseList = new ArrayList<>();
        getContentResponses(eContents, responseList);
        eContents = contentRepository.findBySummaryContains(freeText);
        getContentResponses(eContents, responseList);
        return responseList;
    }

    @Transactional()
    public List<ContentResponse> getAllContent() {
        List<EContent> eContents = contentRepository.findByStatus("A");
        List<ContentResponse> responseList = new ArrayList<>();
        getContentResponses(eContents, responseList);
        return responseList;
    }
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void deleteByContentId(long id) {
        Optional<EContent> byContentId = contentRepository.findByContentId(id);
        byContentId.ifPresent(eContent -> {
            eContent.setStatus("I");
            contentRepository.save(eContent);
        });
    }

    public List<ContentResponse> getContentByTitle(String title) {
        List<EContent> eContents = contentRepository.findByTitleContainsAndStatus(title,"A");
        List<ContentResponse> responseList = new ArrayList<>();
        getContentResponses(eContents, responseList);
        return responseList;
    }






}
