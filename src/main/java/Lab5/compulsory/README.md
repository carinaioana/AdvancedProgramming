Document Management System
Write an application that can manage a catalog of documents. An entry in this catalog might be an article, a book, etc.
A document may be located using a path in the local file system or a link to an external URL. Each document has a unique ID, a name and may have additional tags, which are pairs name-value. Example of tags may be title, author, year, publishingDate, etc.

The main specifications of the application are:


 ## Compulsory

 --------


- [x] Create an object-oriented model of the problem. You should have at least the following classes: Catalog, Document. Create a class responsible with external operations regarding a catalog.
- [x] Implement the following methods representing commands that will manage the content of the catalog:
- [x] add: adds a new entry into the catalog;
- [x] toString: a textual representation of the catalog;
- [x] save: saves the catalog to an external file using JSON format; you may use Jackson or other library;
- [x] load: loads the catalog from an external file.


## Homework

-----

Represent the commands using classes instead of methods. Use an interface or an abstract class in order to desribe a generic command.
Implement the commands load, list, view, report (create the classes AddCommand, ListCommand, etc.).
list: prints the list of documents on the screen;
view: opens a document using the native operating system application (see the Desktop class);
report: creates (and opens) an HTML report representing the content of the catalog.
Use a template engine such as FreeMarker or Velocity, in order to create the HTML report.
The application will signal invalid data or the commands that are not valid using custom exceptions.
The final form of the application will be an executable JAR archive. Identify the generated archive and launch the application from the console, using the JAR.