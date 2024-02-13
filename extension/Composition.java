package extension;

public class Composition {
    private final Dependency dependency;

    public Composition(Dependency dependency) {
        this.dependency = dependency;
    }

    public void behaviour() {
        System.out.println("behaviour");
        dependency.otherBehaviour();
        System.out.println("behaviour");
    }
}
