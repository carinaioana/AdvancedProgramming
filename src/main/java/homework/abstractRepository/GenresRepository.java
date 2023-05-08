package homework.abstractRepository;

import homework.entities.Genres;
import org.springframework.stereotype.Repository;

@Repository
public interface GenresRepository extends AbstractRepository<Genres, Integer> {
    // Add any custom methods specific to Albums entity here
}