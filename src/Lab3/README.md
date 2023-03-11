## Classes and Interfaces
A social network contains persons and companies, each of them identifiable by unique names.
In this network there are relationships of the following types: person-to-person (if they know each other, how?), and person-to-company (if the person works for that company, on what position?).
There may be various types of "specialized" persons in the network, such as programmers or designers.

The main specifications of the application are:

## Compulsory 

-------

- [x] Create an object-oriented model of the problem. You should have at least the following classes Person, Company.
- [x] Both classes should implement the interface java.util.Comparable. The natural order of the objects will be given by their names.
- [x] Create the interface Node that defines the method used to obtain the name of a person or company. The classes above must implement this interface.
- [x] Create a java.util.List containing node objects and print it on the screen.

## Homework 

--------

- [ ] Create the complete model: Person, Programmer, Designer, Company. All persons have a birth date. Each class must have at least one specific property, that others don't have (be creative).
- [ ] Each person will contain a Map defining the relathionships to other persons or companies.
- [ ] Create the Network class containing a List of identifiable nodes.
- [ ] Create a method that computes the importance of a node in the network, as the number of its connections to other nodes.
- [ ] Create a network object containing persons, companies and relationships and print it on the screen. When printing the network, the nodes must be ordered according to their importance.