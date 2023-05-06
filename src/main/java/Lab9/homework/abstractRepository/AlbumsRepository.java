package Lab9.homework.abstractRepository;

import Lab8.compulsory.Albums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumsRepository extends AbstractRepository<Albums, Integer> {

    // Add any custom methods specific to Albums entity here
}