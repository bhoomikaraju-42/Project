package day3;

// Parent Class
class Product {

    String productName;
    double price;

    // Static block
    static {
        System.out.println("Product class loaded");
    }

    // Instance Initialization Block (IIB)
    {
        System.out.println("Product object created");
    }

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // No discount
    double calculateDiscount() {
        return price;
    }
}

// Child Class
class Electronics extends Product {

    int warrantyYears;

    // Constructor
    Electronics(String productName, double price, int warrantyYears) {
        super(productName, price);   // Call parent constructor
        this.warrantyYears = warrantyYears;
    }

    // Override method → Apply 10% discount
    @Override
    double calculateDiscount() {
        return price * 0.10;
    }
}

// Main class
public class onlineshoppingsystem{
    public static void main(String[] args) {

        Product p = new Product("Lipstick", 1000);
        System.out.println("Product Price: " + p.calculateDiscount());

        Product e = new Electronics("Laptop", 50000, 2);
        System.out.println("Electronics Price after 10% discount: " + e.calculateDiscount());
    }
}