Networking
------
Create an implementation of Gomoku (Five in a row) that allows remote players to start or join games. The application will contain two parts (create a project for each one):

The server is responsible with the game management and mediating the players.
The client will communicate with the server, sending it commands such as:
create or join a game,
submit a move, etc.
The main specifications of the application are:

## Compulsory

------

- [x] Create the project ServerApplication. This will contain (at least) the classes: GameServer and ClientThread.
- [x] Create the class GameServer. An instance of this class will create a ServerSocket running at a specified port. The server will receive requests (commands) from clients and it will execute them.
- [x] Create the class ClientThread. An instance of this class will be responsible with communicating with a client Socket. If the server receives the command stop it will stop and will return to the client the respons "Server stopped", otherwise it return: "Server received the request ... ".
- [x] Create the project ClientApplication. This will contain (at least) the class: GameClient.
- [x] Create the class GameClient. An instance of this class will read commands from the keyboard and it will send them to the server. The client stops when it reads from the keyboard the string "exit".