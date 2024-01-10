package ie.atu.project_microservice_2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "confirmation-service", url = "http://localhost:8081")
public interface MovieServiceClient {

    @PostMapping("/movies/add")
    String addMovie(@RequestBody MovieDetails movieDetails);

    @GetMapping("/movies/search")
    MovieDetails searchMovie(@RequestParam String title);

    @GetMapping("/movies/view-all-movies")
    List<MovieDetails> viewAllMovies();
}
