package middle;

public abstract class Plant implements Bloomable {
    private String name;

    public Plant(String name) {
        this.name = name;
    }

    @Override
    public String hasBloom() {
        return String.join(":", name, Bloomable.super.hasBloom());
    }
}
