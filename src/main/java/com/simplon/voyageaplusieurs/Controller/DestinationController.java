package com.simplon.voyageaplusieurs.Controller;

import com.simplon.voyageaplusieurs.Model.Country;
import com.simplon.voyageaplusieurs.Model.Destination;
import com.simplon.voyageaplusieurs.Service.DestinationService;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class DestinationController {

    private DestinationService destinationService;
    public DestinationController(DestinationService destinationService){
        this.destinationService = destinationService;
    }
    /**
     * Controller method enabling Destination list retrieval with pagination and sorting.
     *
     * @param pageNumber the page number we want to get (default is 0)
     * @param pageSize   the page size we want to define (default is 50)
     * @param criteria   the sorting criteria (default is aliment name)
     * @param direction  the sorting direction (default is ascending)
     * @return a Page object containing Aliments.
     */
    @GetMapping
    public Page<Destination> getDestinations(
        @ApiParam(value = "Query param for 'pageNumber'") @Valid @RequestParam(value = "pageNumber", required = false) Integer pageNumber,
        @ApiParam(value = "Query param for 'pageSize'") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,
        @ApiParam(value = "Query param for 'sort' criteria") @Valid @RequestParam(value = "sort", required = false) String criteria,
        @ApiParam(value = "Query param for 'sort' direction") @Valid @RequestParam(value = "direction", required = false) String direction) {
        return (this.destinationService.getDestinations(pageNumber, pageSize, criteria, direction));

    }
    @GetMapping("/filter")
    public List<Destination> getDestinationsSelect(@RequestParam String country){
        return (this.destinationService.getDestinationsSelect(country));

    }

    @GetMapping("/country")
    public List<Country> getCountrys () {
        return (this.destinationService.getCountrys());

    }

}
