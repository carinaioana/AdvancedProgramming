package Lab9.homework;

import Lab9.homework.absRepoImpl.ArtistRepoImpl;
import Lab9.homework.abstractRepository.AlbumsRepository;
import Lab9.homework.abstractRepository.ArtistsRepository;
import Lab9.homework.entities.Artists;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.io.FileReader;
import java.io.IOException;

public class ImportData {
    private  EntityManagerFactory managerFactory;
    private AlbumsRepository albumsRepository;
    private EntityManager entityManager;

    public ImportData() {
        this.managerFactory = Persistence.createEntityManagerFactory("default");
        this.entityManager = managerFactory.createEntityManager();

    }
    public void addData() throws IOException {
        String file = "C:\\Users\\Carina\\Documents\\albumlist.csv";
        CSVReader reader = null;
        String[] line;

        try {
            reader = new CSVReader(new FileReader(file));
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            ArtistsRepository artistsRepository = new ArtistRepoImpl();

            while ((line = reader.readNext()) != null) {
                // extract the data from the CSV row
                Integer id = Integer.parseInt(line[0]);
                String name = line[3];

                // create and persist the artist entity
                Artists artist = new Artists(id, name);
                artistsRepository.save(artist);
            }
            // commit the transaction
            transaction.commit();
        } catch (CsvValidationException | IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null) {
                reader.close();
            }
            entityManager.close();
            managerFactory.close();
        }
    }
}
