package Lab9.homework.abstractRepository;

import Lab8.compulsory.Albums;
import Lab9.homework.entities.Genres;
import org.springframework.stereotype.Repository;

@Repository
public interface GenresRepository extends AbstractRepository<Genres, Integer> {
    // Add any custom methods specific to Albums entity here
}