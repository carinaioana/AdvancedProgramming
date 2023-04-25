package Lab8.compulsory;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {
    T get(int id) throws SQLException;
    List<T> getAll() throws SQLException;
    int save(T albums) throws SQLException;
    int insert(T albums) throws SQLException;
    int update(T albums) throws SQLException;
    int delete(T albums) throws SQLException;
}
