package com.simplon.voyageaplusieurs.Service;

import com.simplon.voyageaplusieurs.Model.Country;
import com.simplon.voyageaplusieurs.Model.Destination;
import com.simplon.voyageaplusieurs.Repository.DestinationRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@Service
public class DestinationServiceImpl implements DestinationService {

    private DestinationRepository destinationRepository;


    //constructor
    public DestinationServiceImpl(DestinationRepository destinationRepository) {
        this.destinationRepository = destinationRepository;

    }

    @Override
    public Page<Destination> getDestinations(Integer pageNumber, Integer pageSize, String criteria, String direction) {
        // If page number is not null then use it for paging, otherwise provide page 0
        int pNumber = (pageNumber != null) ? pageNumber : 0;
        // If page size is not null then use it for paging, otherwise use default 50 page size
        int pSize = (pageSize != null) ? pageSize : 4;

        // By default sort on destination country
        String sortingCriteria = "country";

        // If sorting criteria matches an destination field country, then use it for sorting
        Field[] fields = Destination.class.getDeclaredFields();
        List<String> possibleCriteria = new ArrayList<>();
        for (Field field : fields) {
            possibleCriteria.add(field.getName().toLowerCase());
        }
        if (criteria != null && possibleCriteria.contains(criteria)) {
            sortingCriteria = criteria;
        }

        // By default sorting ascending, but if user explicitely choose desc, then sort descending
        Sort.Direction sortingDirection = Sort.Direction.ASC;
        if (direction != null) {
            sortingDirection = direction.equalsIgnoreCase("desc") ? Sort.Direction.DESC : Sort.Direction.ASC;
        }

        return destinationRepository.findAll(PageRequest.of(pNumber, pSize, Sort.by(sortingDirection, sortingCriteria)));

    }

    @Override
    public List<Destination> getDestinationsSelect(String country) {
        return destinationRepository.findAllByCountry(country);


    }
    @Override
    public List<String> getCountrys() {
        return destinationRepository.findAllCountry();

    }


}
