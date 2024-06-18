package org.example.Generic_Collections.Generic.EX5;

public class NumberBox<T extends Number> {
    private T type;

    public NumberBox(T type) {
        this.type = type;
    }

    public double caculateValue() {
        return type.doubleValue();
    }

    public static void main(String[] args) {
        NumberBox<Integer> epl = new NumberBox<Integer>(20);
        System.out.println(epl.caculateValue());
        NumberBox<Double> epl2 = new NumberBox<Double>(30.2);
        System.out.println(epl2.caculateValue());
    }
}
