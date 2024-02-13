package composition.extension;

public class Derived extends Base {
    private final DerivedDependency derivedDependency;

    public Derived(BaseDependency baseDependency, DerivedDependency derivedDependency) {
        super(baseDependency);
        this.derivedDependency = derivedDependency;
    }

    @Override
    public void otherBehaviour() {
        System.out.println("otherBehaviour");
    }
}
