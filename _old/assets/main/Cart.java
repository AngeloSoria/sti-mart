package main;

import java.util.ArrayList;

public class Cart extends Product {
    private ArrayList<Object[]> MyCart; // Null

    // Constructor
    public Cart() {
        MyCart = new ArrayList<>(); // {} Size: 0
    }

    public double totalPrice() {
        double total = 0;
        for (int index = 0; index < MyCart.size(); index++) {
            total = total + (double) MyCart.get(index)[2]; // Object to double
        }
        return total;
    }

    public void showCart(String request) {
        if (request.equalsIgnoreCase("default")) {
            for (int index = 0; index < MyCart.size(); index++) {
                int dashLength = 25;
                if (MyCart.get(index)[1].toString().length() <= 8) {
                    dashLength = dashLength + (9 - MyCart.get(index)[1].toString().length());
                } else if (MyCart.get(index)[1].toString().length() > 9) {
                    dashLength = dashLength - (dashLength - MyCart.get(index)[1].toString().length());
                    // System.out.println("Dash length: " + dashLength);
                }
                System.out.println(MyCart.get(index)[1] + " " + "-".repeat(dashLength) + " " + MyCart.get(index)[2]);
            }
            System.out.println("Total Price: PHP" + totalPrice());
        } else if (request.equalsIgnoreCase("all-clean")) {
            for (int index = 0; index < MyCart.size(); index++) {
                System.out.println("[" + (index + 1) + "] " + MyCart.get(index)[1]);
            }
        } else {
            System.out.println("Invalid request.");
            System.exit(0);
        }
    }

    public void addProduct(Object[] product) {
        System.out.println("Added: " + product[1] + " to cart.");
        MyCart.add(product);
    }

    public ArrayList<Object[]> getMyCart() {
        return MyCart;
    }

    public boolean removeProduct(int product_position, String request) {
        // request:
        // [1] Only one
        // [2] All similar product
        // [3] All product
        if (request.equalsIgnoreCase("one-product")) {
            MyCart.remove(product_position - 1);
            return true;
        } else if (request.equalsIgnoreCase("all-similar")) {
            Object selectedProductId = MyCart.get(product_position - 1)[0];
            for (int index = 0; index < MyCart.size(); index++) {
                if (MyCart.get(index)[0].toString().equals(selectedProductId)) {
                    MyCart.remove(index);
                }
            }
            return true;
        } else if (request.equalsIgnoreCase("all-product")) {
            clearAllProduct();
            return true;
        } else {
            System.out.println(request + " is invalid for request.");
        }
        return false;
    }

    // Clear cart
    private void clearAllProduct() {
        MyCart.clear();
    }
}
