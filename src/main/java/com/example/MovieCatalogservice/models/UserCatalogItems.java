package com.example.MovieCatalogservice.models;

import lombok.Data;

import java.util.List;

public @Data class UserCatalogItems {

    private List<CatalogItem> catalogItems;
}
