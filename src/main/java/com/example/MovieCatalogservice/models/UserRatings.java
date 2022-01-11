package com.example.MovieCatalogservice.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public @Data class UserRatings {

    private List<Rating> ratings;
}
