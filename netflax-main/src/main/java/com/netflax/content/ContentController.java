package com.netflax.content;


import com.netflax.content.model.ContentCategory;
import com.netflax.content.model.ContentResponse;
import com.netflax.content.service.ContentService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/content")
@RestController
public class ContentController {

    private final ContentService contentService;


    public ContentController(ContentService contentService) {
        this.contentService = contentService;

    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ContentResponse>> getAllContent() {
        return ResponseEntity.ok(contentService.getAllContent());
    }


    @GetMapping(value = "/{category}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ContentResponse>> getContentByCategory(@PathVariable("category") ContentCategory category) {
        return ResponseEntity.ok(contentService.getContentByCategory(category));
    }

    @PutMapping("/{id}")
    public void deleteByContentId(@PathVariable("id") long id){
        contentService.deleteByContentId(id);
    }
}
