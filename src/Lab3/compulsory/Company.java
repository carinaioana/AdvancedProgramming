package Lab3.compulsory;

public class Company implements Node, Comparable<Company>{
    private String name;
    private int Id;

    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return Id;
    }

    public Company(String name, int Id) {
        this.name = name;
        this.Id = Id;
    }
    /*
    verifica daca doua nume de companii sunt la fel
    */
    @Override
    public int compareTo(Company c) {
        return this.name.compareTo(c.getName());
    }
}