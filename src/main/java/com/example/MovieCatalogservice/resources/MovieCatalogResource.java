package com.example.MovieCatalogservice.resources;

import com.example.MovieCatalogservice.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;


    @RequestMapping("/{userId}")
    public UserCatalogItems getCatalog(@PathVariable("userId") String userId){

        UserRatings userRatings = webClientBuilder.build()
                .get()
                .uri("http://ratings-data-service/ratingsdata/user/" + userId)
                .retrieve()
                .bodyToMono(UserRatings.class)
                .block();

        List<CatalogItem> catalogItems = userRatings.getRatings().stream().map(rating -> {

//                Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);

                Movie movie = webClientBuilder.build()
                    .get()
                    .uri("http://movie-info-service/movies/" + rating.getMovieId())
                    .retrieve()
                    .bodyToMono(Movie.class)
                    .block();

          return new CatalogItem(movie.getName(),"Desc", rating.getRating());
        })
                .collect(Collectors.toList());

        UserCatalogItems userCatalogItems = new UserCatalogItems();
        userCatalogItems.setCatalogItems(catalogItems);
        return userCatalogItems;


//        return Collections.singletonList(
//                new CatalogItem("Transformer","Test",4)
//        );

    }
}
