package com.netflax.details;

import com.netflax.content.model.ContentResponse;
import com.netflax.details.model.ContentDetails;
import com.netflax.details.model.SeriesDetails;
import com.netflax.details.service.DetailsService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/")
@RestController
public class DetailsController {

    private final DetailsService detailsService;

    public DetailsController(DetailsService detailsService) {
        this.detailsService = detailsService;
    }

    @GetMapping(value = "/details-series/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SeriesDetails>> getSeriesDetails(@PathVariable("id") long id) {
        return ResponseEntity.ok(detailsService.getSeriesDetails(id));
    }

    @GetMapping(value = "/details-other/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ContentDetails> getContentDetails(@PathVariable("id") long id) {
        return ResponseEntity.ok(detailsService.getContentDetails(id));
    }

    /*
    @PostMapping("/details-series/create")
    public void createSeriesDetails(@RequestBody final SeriesDetails seriesDetails){
        detailsService.createSeriesDetails(seriesDetails);
    }
    @PostMapping("/details-other/create")
    public void createContentDetails(@RequestBody final ContentDetails contentDetails{
        detailsService.createContentDetails(contentDetails);
    }
    */

}
