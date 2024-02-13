package composition.extension;

public class Usage {
    public static void main(String[] args) {
        // the other Behaviour is also available !
        // but it is unnecessary
        (new Derived()).behaviour();
    }
}
