package Lab5.homework;

abstract class CatalogCommand {
    public abstract void execute(Catalog catalog) throws InvalidCommandException;
}
