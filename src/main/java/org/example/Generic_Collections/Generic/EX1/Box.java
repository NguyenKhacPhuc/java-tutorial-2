package org.example.Generic_Collections.Generic.EX1;

public class Box<T> {
  private T type;

  public Box(T type) {
    this.type = type;
  }

  public T getType() {
    return type;
  }

  public void setType(T type) {
    this.type = type;
  }

  public static void main(String[] args)

  {
    Box<String> newBox = new Box<String>("Hello");
    Box<Integer> newBox2 = new Box<Integer>(30);
    System.out.println(newBox.getType());
    System.out.println(newBox2.getType());
  }
}
