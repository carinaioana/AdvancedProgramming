package Lab9.homework;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryManager {

    private static EntityManagerFactoryManager instance;
    private EntityManagerFactory entityManagerFactory;

    private EntityManagerFactoryManager() {
        // Private constructor to prevent instantiation outside of this class
    }

    public static synchronized EntityManagerFactoryManager getInstance() {
        if (instance == null) {
            instance = new EntityManagerFactoryManager();
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
