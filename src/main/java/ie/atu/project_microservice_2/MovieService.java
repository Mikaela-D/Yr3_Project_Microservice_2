package ie.atu.project_microservice_2;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    private List<MovieDetails> movieList = new ArrayList<>();

    public String addMovie(MovieDetails movieDetails) {
        movieList.add(movieDetails);
        return "Movie added successfully";
    }

    public MovieDetails searchMovie(String movieTitle) {
        // Search for a movie by Title
        for (MovieDetails movie : movieList) {
            if (movie.getMovieTitle().equalsIgnoreCase(movieTitle)) {
                return movie;
            }
        }
        return null;
    }

    public List<MovieDetails> viewAllMovies() {
        // Return the list of all movies (by ID and Title)
        return movieList.stream()
                .map(movie -> new MovieDetails(movie.getMovieID(), movie.getMovieTitle()))
                .collect(Collectors.toList());
    }
}
