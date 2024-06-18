package Generic.boundedTypeParameters;

public class NumberBox<T extends Number> {
    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public void doubleValue() {
        System.out.println(value.doubleValue());
    }
}
