package ie.atu.project_microservice_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class MovieDetails {
    private int movieID;
    private String movieTitle;
}
