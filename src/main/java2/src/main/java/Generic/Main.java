package Generic;

import Generic.boundedTypeParameters.NumberBox;
import Generic.genericBoxClass.Box;
import Generic.genericMethod.ArrayUtils;
import Generic.genericPairClass.Pair;
import Generic.genericStackClass.Stack;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
    }

    public static void task1() {
        Box<String> box1 = new Box<>("small");
        System.out.println(box1.toString());

        Box<Integer> box2 = new Box<>(1);
        System.out.println(box2.toString());
    }

    public static void task2() {
        Pair<Integer, String> emp1 = new Pair<>(1, "Anh Quan");
        System.out.println(emp1.toString());

        Pair<String, Double> emp2 = new Pair<>("TH2109", 12.673);
        System.out.println(emp2.toString());

    }

    public static void task3() {
        Integer[] intArr = {1, 2, 3};
        String[] strArr = {"Spring", "Winter"};

        ArrayUtils.max(intArr);
        ArrayUtils.max(strArr);
    }

    public static void task4() {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);

        System.out.println(stack1.pop());
        System.out.println(stack1.peek());
    }

    public static void task5() {
        NumberBox<Integer> numberBox1 = new NumberBox<>(1234567);
        numberBox1.doubleValue();

        NumberBox<Float> numberBox2= new NumberBox<>(24554567f);
        numberBox2.doubleValue();
    }
}
