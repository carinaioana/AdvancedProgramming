package Lab9.homework.absRepoImpl;

import Lab9.homework.abstractRepository.ArtistsRepository;
import Lab9.homework.entities.Artists;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class ArtistRepoImpl implements ArtistsRepository {
    private EntityManagerFactory managerFactory;
    private ArtistsRepository artistsRepo;
    private EntityManager entityManager;

    public ArtistRepoImpl() {
        this.managerFactory = Persistence.createEntityManagerFactory("default");
        this.entityManager = managerFactory.createEntityManager();

    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Artists> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Artists> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Artists> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Artists getOne(Integer integer) {
        return null;
    }

    @Override
    public Artists getById(Integer integer) {
        return null;
    }

    @Override
    public Artists getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Artists> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Artists> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Artists> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Artists> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Artists> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Artists> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Artists, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Artists> S save(S entity) {
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        return entity;
    }

    @Override
    public <S extends Artists> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Artists> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Artists> findAll() {
        return null;
    }

    @Override
    public List<Artists> findAllById(Iterable<Integer> integers) {
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
    public void delete(Artists entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Artists> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Artists> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Artists> findAll(Pageable pageable) {
        return null;
    }
}
