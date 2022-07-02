package middle;

public interface Bloomable {
    default String hasBloom(){
        return "умеет цвести";
    }
}
