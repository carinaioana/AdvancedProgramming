package Lab5.homework;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CatalogManager {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter command (add, list, view, report, exit): ");
            String commandStr = scanner.nextLine();
            if (commandStr.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                CatalogCommand command = createCommand(commandStr);
                command.execute(catalog);
            } catch (InvalidCommandException e) {
                System.err.println("Invalid command: " + e.getMessage());
            }
        }
    }

    private static CatalogCommand createCommand(String commandStr) throws InvalidCommandException {
        String[] tokens = commandStr.split("\\s+");
        String commandName = tokens[0].toLowerCase();
        switch (commandName) {
            case "add":
                if (tokens.length < 4) {
                    throw new InvalidCommandException("Usage: add <id> <name> <path> [<tag1name> <tag1value> ...]");
                }
                String id = tokens[1];
                String name = tokens[2];
                String path = tokens[3];
                Map<String, String> tags = new HashMap<>();
                for (int i = 4; i < tokens.length; i += 2) {
                    if (i + 1 >= tokens.length) {
                        throw new InvalidCommandException("Invalid tags format");
                    }
                    String tagName = tokens[i];
                    String tagValue = tokens[i + 1];
                    tags.put(tagName, tagValue);
                }
                return new AddCommand(id, name, path, tags);
            case "list":
                if (tokens.length != 1) {
                    throw new InvalidCommandException("Usage: list");
                }
                return new ListCommand();
            case "view":
                if (tokens.length != 2) {
                    throw new InvalidCommandException("Usage: view <id>");
                }
                return new ViewCommand(tokens[1]);
            case "report":
                if (tokens.length != 2) {
                    throw new InvalidCommandException("Usage: report <output-path>");
                }
                return new ReportCommand(tokens[1]);
            default:
                throw new InvalidCommandException("Unknown command: " + commandName);
        }
    }
}

