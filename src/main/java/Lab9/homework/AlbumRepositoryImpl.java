
package Lab9.homework;

import Lab8.compulsory.Albums;
import Lab9.compulsory.entity.AlbumsEntity;
import Lab9.homework.abstractRepository.AlbumsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Service
@Repository
public class AlbumRepositoryImpl implements AlbumsRepository{

    private  EntityManagerFactory managerFactory;
    private AlbumsRepository albumsRepository;
    private EntityManager entityManager;

    public AlbumRepositoryImpl(AlbumsRepository albumsRepository, EntityManager entityManager) {
        this.managerFactory = Persistence.createEntityManagerFactory("default");
        this.entityManager = managerFactory.createEntityManager();
    }

    public AlbumRepositoryImpl() {

    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Albums> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Albums> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Albums> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Albums getOne(Integer integer) {
        return null;
    }

    @Override
    public Albums getById(Integer integer) {
        return entityManager.find(Albums.class, integer);
    }

    @Override
    public Albums getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Albums> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Albums> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Albums> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Albums> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Albums> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Albums> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Albums, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Albums> S save(S entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        return entity;
    }

    @Override
    public <S extends Albums> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Albums> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Albums> findAll() {
        return null;
    }

    @Override
    public List<Albums> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Albums entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Albums> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Albums> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Albums> findAll(Pageable pageable) {
        return null;
    }
}

