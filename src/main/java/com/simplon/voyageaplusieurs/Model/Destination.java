package com.simplon.voyageaplusieurs.Model;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private Long id;
    private String continent;
    private String Country;
    private String descriptive;
    private String situation;
    private List<Trip> trips = new ArrayList<>();
}
