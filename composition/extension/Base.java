package composition.extension;

public abstract class Base {
    private final BaseDependency baseDependency;

    public Base(BaseDependency baseDependency) {
        this.baseDependency = baseDependency;
    }

    public abstract void otherBehaviour();
    public void behaviour() {
        System.out.println("behaviour");
        otherBehaviour();
        System.out.println("behaviour");
    }
}
