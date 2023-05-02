package Lab9.compulsory;

import javax.persistence.*;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        EntityManagerFactory entityManagerFactory = EntityManagerFactoryManager.getInstance().getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
          /*  AlbumsEntity album = new AlbumsEntity();
            album.setId(2);
            album.setArtist("Matei");
            album.setReleaseYear(2002);
            album.setTitle("Mi-am inselat iubita");
            album.setGenres("classic");
            entityManager.persist(album);
*/
           /* TypedQuery<AlbumsEntity> albumsEntityTypedQuery = entityManager.createNamedQuery("Albums.findByName",AlbumsEntity.class);
            albumsEntityTypedQuery.setParameter(1,"Java");
            for (AlbumsEntity album:albumsEntityTypedQuery.getResultList()) {
                System.out.println(album);
            }*/

            transaction.commit();
        }finally {
            if(transaction.isActive()){
                transaction.rollback();;
            }
            EntityManagerFactoryManager.getInstance().closeEntityManagerFactory();
        }
      /*  Albums album1 = new Albums(20, 1999, "Roses", "John", "rock");
        Albums album2 = new Albums(21, 2003, "Guns", "Wick", "jazz");
        //System.out.println(album1);
        Connection conn = Database.getConnection();
        if(conn!= null){
            System.out.println("Database connection successful");
        }
        List<Albums> albumsList;
        AlbumsDAO albumsDAO = new AlbumsDAOImpl();
*/
        //DELETE
     /*   int result1 = albumsDAO.insert(album1);

        //UPDATE
        albumsDAO.update(album1);*/

        //DELETE
    /*    Albums albums20 = albumsDAO.get(20);
        albumsDAO.delete(albums20)*/;

        //System.out.println(result1);

        //READ
       /* albumsList = albumsDAO.getAll();
        for (Albums album: albumsList) {
            System.out.println(album);
        }*/
    }
}