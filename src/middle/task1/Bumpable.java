package middle;

public interface Bumpable {
    default String hasBumps() {
        return "имеет шишки";
    };
}
