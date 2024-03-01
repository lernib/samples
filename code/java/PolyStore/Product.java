package code.java.PolyStore;

public class Product {
  public String name;

  public Product(String name) {
    this.name = name;
  }

  public void buy(int count) {
    System.out.println("I bought " + count + " " + name + "!");
  }

  public void buy(double price) {
    System.out.println("I bought $" + price + " worth of " + name + "!");
  }
}
