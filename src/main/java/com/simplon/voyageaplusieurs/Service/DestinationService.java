package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.Destination;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DestinationService {

    /**
     * destination list retrieval.
     *
     * @param pageNumber the page number to get
     * @param pageSize   the page size to choose
     * @param criteria   the sorting criteria
     * @param direction  the sorting direction
     * @return a page object with aliments
     */
    Page<Destination> getDestinations(Integer pageNumber, Integer pageSize, String criteria, String direction);

    /**
     * Get the list of Destinations filtered on country and duration
     * @return the  list filtered from persistence layer.
*/
    List<Destination> getDestinationsSelect(String country);


    /**
     * Get the list of country
     * @return the  list filtered from persistence layer.
     **/

    List<String> getCountrys();


}
