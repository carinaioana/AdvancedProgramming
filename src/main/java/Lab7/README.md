Concurrency
Consider a map represented as a n x n square matrix, each cell being an individual location of the map.
A number of robots (agents) must explore all the cells of the matrix. They are initially located at random positions and are allowed to move in any direction inside the map. Two robots cannot be in the same cell at once.
The robots can access a shared memory containing tokens (for example, numbers from 1 to n3, shuffled). Once a robot reaches an unvisited cell it must extract n tokens and store them in the matrix cell.
A supervisor can start/pause the robots (all of them or only a specific one).

The main specifications of the application are:

## Compulsory

-------

- [x] Create an object oriented model of the problem.
- [] Each robot will have a name and they must perform in a concurrent manner, moving randomly around the map and extracting tokens from the shared memory when reaching an unvisited cell.
- [] A message will be displayed on the screen every time a robot visits a new cell.
- [x] Simulate the exploration using a thread for each robot.
- [x] Pay attention to the synchronization of the threads when extracting tokens and when visiting cells.

## Homework 

-------

Implement the commands that start/pause the robots (all of them or only a specific one). A robot can be paused for a specific time or indefinitely, requiring a start command.
The commands must be given using the keyboard.
Design an algorithm such that each robots will try to explore the map in a systematic fashion, ensuring the termination of the exploration process.
Implement a timekeeper thread that runs concurrently with the player threads, as a daemon. This thread will display the running time of the exploration and it will stop it exceeds a certain time limit.
At the end of the exploration, determine how many tokens each robot has placed in the matrix.
