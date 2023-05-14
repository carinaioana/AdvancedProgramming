package Lab9.compulsory;

import Lab9.compulsory.entity.AlbumsEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class AlbumsRepository {
    private EntityManager entityManager;
    private EntityManagerFactory managerFactory;
    public AlbumsRepository(){
        this.managerFactory = Persistence.createEntityManagerFactory("default");
        this.entityManager = managerFactory.createEntityManager();
    }
    public AlbumsEntity createAlbum(AlbumsEntity album){
        entityManager.getTransaction().begin();
        entityManager.persist(album);
        entityManager.getTransaction().commit();
        return album;
    }

    /**
     * Find by primary key. Search for an entity of the specified class and primary key.
     */
    public AlbumsEntity findById(Integer id){
        return entityManager.find(AlbumsEntity.class, id);
    }
    public AlbumsEntity findByTitle(String title){
        Query query = entityManager.createNamedQuery("Albums_findByTitle");
        query.setParameter("title", title);
        return (AlbumsEntity) query.getSingleResult();
    }
    public void delete(AlbumsEntity album){
        entityManager.getTransaction().begin();
        entityManager.remove(album);
        entityManager.getTransaction().commit();
    }
    public void close(){
        this.entityManager.close();
        this.managerFactory.close();
    }
}
