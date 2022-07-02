package middle;

public abstract class Tree implements Bumpable, Smellable {
    private String name;

    public Tree(String name) {
        this.name = name;
    }

    @Override
    public String hasBumps() {
        return String.join(":", name, Bumpable.super.hasBumps());
    }

    @Override
    public String hasSmell() {
        return String.join(":", name, Smellable.super.hasSmell());
    }
}
