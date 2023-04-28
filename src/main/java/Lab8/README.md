JDBC

Write an application that allows to connect to a relational database by using JDBC, submit SQL statements and display the results.

The main specifications of the application are:

## Compulsory

---------

-[x] Create a relational database using any RDBMS (Oracle, Postgres, MySql, Java DB, etc.).
-[x] Write an SQL script that will create the following tables:
albums: id, release year, title, artist, genre(s)
artists: id, name (for example: Beatles)
genres: id, name (for example: Rock)
an associative (junction) table in order to store each album genres
-[x] Update pom.xml, in order to add the database driver to the project libraries.
-[x] Create a singleton class in order to manage a connection to the database.
-[x] Create DAO classes that offer methods for managing artists, genres and albums (at least one).
-[x] Implement a simple test using your classes.

## Optional

-----

- [x] Create an object-oriented model of the data managed by the Java application.
- [x] Implement all the DAO classes.
-[x] Use a connection pool in order to manage database connections, such as C3PO, HikariCP or Apache Commons DBCP.
- [x] Create a tool to import data from a real dataset, such as Rolling Stone's 500 Greatest Albums of All Time (or other)
