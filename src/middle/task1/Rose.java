package middle;

public class Rose extends Plant implements Smellable{
    private String name;
    public Rose(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String hasSmell() {
        return String.join(":", name, Smellable.super.hasSmell());
    }
}
