package middle;

public interface Smellable {
    default String hasSmell(){
        return "умеет пахнуть";
    }
}
