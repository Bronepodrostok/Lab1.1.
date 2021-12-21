package model;

public abstract class AbstractPerson implements HumanInterface{
    private final String name;

    AbstractPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public abstract String think();
}
