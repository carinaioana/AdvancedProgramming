package Lab9.homework.abstractRepository;

import Lab9.homework.entities.Artists;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistsRepository extends AbstractRepository<Artists, Integer> {

}
