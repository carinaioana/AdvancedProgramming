package Lab9.homework;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManager {

    private static EntityManager instance;
    private EntityManagerFactory entityManagerFactory;

    private EntityManager() {
        // Private constructor to prevent instantiation outside of this class
    }

    public static synchronized EntityManager getInstance() {
        if (instance == null) {
            instance = new EntityManager();
        }
        return instance;
    }

    public synchronized EntityManagerFactory getEntityManagerFactory() {
        if (entityManagerFactory == null) {
            // Load the persistence unit from persistence.xml
            entityManagerFactory = Persistence.createEntityManagerFactory("default");
        }
        return entityManagerFactory;
    }

    public synchronized void closeEntityManagerFactory() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }

}
