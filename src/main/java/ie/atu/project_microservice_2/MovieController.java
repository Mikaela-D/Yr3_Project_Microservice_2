package ie.atu.project_microservice_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addMovie(@RequestBody MovieDetails movieDetails) {
        return ResponseEntity.ok(movieService.addMovie(movieDetails));
    }

    @GetMapping("/search")
    public ResponseEntity<MovieDetails> searchMovie(@RequestParam String title) {
        MovieDetails foundMovie = movieService.searchMovie(title);
        return foundMovie != null ? ResponseEntity.ok(foundMovie) : ResponseEntity.notFound().build();
    }

    @GetMapping("/view-all-movies")
    public ResponseEntity<List<MovieDetails>> viewAllMovies() {
        List<MovieDetails> movies = movieService.viewAllMovies();
        return ResponseEntity.ok(movies);
    }
}
