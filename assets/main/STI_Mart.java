package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

// Main Class
public class STI_Mart {
    private static TextDesigns SpecialText = new TextDesigns();
    public Cart myCart = new Cart(); // Create myCart object from Cart class

    public void MainProgram() {
        try (Scanner USER_INPUT = new Scanner(System.in)) {
            Product product = new Product();

            PANEL_StartUp();

            while (true) {
                System.out.print(">> ");
                try {
                    int get_input = USER_INPUT.nextInt();
                    product.loadAllProducts();
                    if (get_input == 1) {
                        // Shop
                        PANEL_Shop();
                        while (true) {
                            try {
                                System.out.print(">> ");
                                int selectDepartment = USER_INPUT.nextInt();
                                if (selectDepartment == 0) {
                                    // Exit to menu
                                    MainProgram();
                                    break;
                                } else if (selectDepartment == 1) {
                                    // beverages
                                    Beverages department = new Beverages();
                                    department.showAllProductInformation();
                                    ArrayList<Object[]> departmentItems = department.getDepartmentProducts();

                                    while (true) {
                                        try {
                                            System.out.print(">> ");
                                            int selectProduct = USER_INPUT.nextInt();
                                            if (selectProduct == 0) {
                                                MainProgram();
                                                break;
                                            } else if (selectProduct > 0 && selectProduct <= departmentItems.size()) {
                                                myCart.addProduct(departmentItems.get(selectProduct - 1)); // add to
                                                                                                           // cart
                                                System.out.println("Would you like to choose product again?");
                                                System.out.println("[1] Yes");
                                                System.out.println("[2] No, Exit to menu");
                                                while (true) {
                                                    try {
                                                        System.out.print(">> ");
                                                        int chooseAgain = USER_INPUT.nextInt();
                                                        if (chooseAgain == 1) {
                                                            department.showAllProductInformation();
                                                            break;
                                                        } else if (chooseAgain == 2) {
                                                            MainProgram();
                                                            break;
                                                        } else {
                                                            System.out.println("Invalid input, Try again.");
                                                        }
                                                    } catch (InputMismatchException e) {
                                                        System.out.println("Invalid input type, Try again.");
                                                        USER_INPUT.next();
                                                    }
                                                }
                                            } else {
                                                System.out.println("Invalid input not found, try again.");
                                            }
                                        } catch (InputMismatchException msg) {
                                            System.out.println("Invalid input type, Try again.");
                                            USER_INPUT.next();
                                        }
                                    }
                                } else if (selectDepartment == 2) {
                                    // alcohol
                                    Alcohol department = new Alcohol();
                                    department.showAllProductInformation();
                                    ArrayList<Object[]> departmentItems = department.getDepartmentProducts();

                                    while (true) {
                                        try {
                                            System.out.print(">> ");
                                            int selectProduct = USER_INPUT.nextInt();
                                            if (selectProduct == 0) {
                                                MainProgram();
                                                break;
                                            } else if (selectProduct > 0 && selectProduct <= departmentItems.size()) {
                                                myCart.addProduct(departmentItems.get(selectProduct - 1)); // add to
                                                                                                           // cart
                                                System.out.println("Would you like to choose product again?");
                                                System.out.println("[1] Yes");
                                                System.out.println("[2] No, Exit to menu");
                                                while (true) {
                                                    try {
                                                        System.out.print(">> ");
                                                        int chooseAgain = USER_INPUT.nextInt();
                                                        if (chooseAgain == 1) {
                                                            department.showAllProductInformation();
                                                            break;
                                                        } else if (chooseAgain == 2) {
                                                            MainProgram();
                                                            break;
                                                        } else {
                                                            System.out.println("Invalid input, Try again.");
                                                        }
                                                    } catch (InputMismatchException e) {
                                                        System.out.println("Invalid input type, Try again.");
                                                        USER_INPUT.next();
                                                    }
                                                }
                                            } else {
                                                System.out.println("Invalid input not found, try again.");
                                            }
                                        } catch (InputMismatchException msg) {
                                            System.out.println("Invalid input type, Try again.");
                                            USER_INPUT.next();
                                        }
                                    }
                                } else if (selectDepartment == 3) {
                                    // Snacks
                                    Snacks department = new Snacks();
                                    department.showAllProductInformation();
                                    ArrayList<Object[]> departmentItems = department.getDepartmentProducts();

                                    while (true) {
                                        try {
                                            System.out.print(">> ");
                                            int selectProduct = USER_INPUT.nextInt();
                                            if (selectProduct == 0) {
                                                MainProgram();
                                                break;
                                            } else if (selectProduct > 0 && selectProduct <= departmentItems.size()) {
                                                myCart.addProduct(departmentItems.get(selectProduct - 1)); // add to
                                                                                                           // cart
                                                System.out.println("Would you like to choose product again?");
                                                System.out.println("[1] Yes");
                                                System.out.println("[2] No, Exit to menu");
                                                while (true) {
                                                    try {
                                                        System.out.print(">> ");
                                                        int chooseAgain = USER_INPUT.nextInt();
                                                        if (chooseAgain == 1) {
                                                            department.showAllProductInformation();
                                                            break;
                                                        } else if (chooseAgain == 2) {
                                                            MainProgram();
                                                            break;
                                                        } else {
                                                            System.out.println("Invalid input, Try again.");
                                                        }
                                                    } catch (InputMismatchException e) {
                                                        System.out.println("Invalid input type, Try again.");
                                                        USER_INPUT.next();
                                                    }
                                                }
                                            } else {
                                                System.out.println("Invalid input not found, try again.");
                                            }
                                        } catch (InputMismatchException msg) {
                                            System.out.println("Invalid input type, Try again.");
                                            USER_INPUT.next();
                                        }
                                    }
                                } else if (selectDepartment == 4) {
                                    // Cleaning Products
                                    CleaningProducts department = new CleaningProducts();
                                    department.showAllProductInformation();
                                    ArrayList<Object[]> departmentItems = department.getDepartmentProducts();

                                    while (true) {
                                        try {
                                            System.out.print(">> ");
                                            int selectProduct = USER_INPUT.nextInt();
                                            if (selectProduct == 0) {
                                                MainProgram();
                                                break;
                                            } else if (selectProduct > 0 && selectProduct <= departmentItems.size()) {
                                                myCart.addProduct(departmentItems.get(selectProduct - 1)); // add to
                                                                                                           // cart
                                                System.out.println("Would you like to choose product again?");
                                                System.out.println("[1] Yes");
                                                System.out.println("[2] No, Exit to menu");
                                                while (true) {
                                                    try {
                                                        System.out.print(">> ");
                                                        int chooseAgain = USER_INPUT.nextInt();
                                                        if (chooseAgain == 1) {
                                                            department.showAllProductInformation();
                                                            break;
                                                        } else if (chooseAgain == 2) {
                                                            MainProgram();
                                                            break;
                                                        } else {
                                                            System.out.println("Invalid input, Try again.");
                                                        }
                                                    } catch (InputMismatchException e) {
                                                        System.out.println("Invalid input type, Try again.");
                                                        USER_INPUT.next();
                                                    }
                                                }
                                            } else {
                                                System.out.println("Invalid input not found, try again.");
                                            }
                                        } catch (InputMismatchException msg) {
                                            System.out.println("Invalid input type, Try again.");
                                            USER_INPUT.next();
                                        }
                                    }
                                } else if (selectDepartment == 5) {
                                    // Cigarettes
                                    Cigarettes department = new Cigarettes();
                                    department.showAllProductInformation();
                                    ArrayList<Object[]> departmentItems = department.getDepartmentProducts();

                                    while (true) {
                                        try {
                                            System.out.print(">> ");
                                            int selectProduct = USER_INPUT.nextInt();
                                            if (selectProduct == 0) {
                                                MainProgram();
                                                break;
                                            } else if (selectProduct > 0 && selectProduct <= departmentItems.size()) {
                                                myCart.addProduct(departmentItems.get(selectProduct - 1)); // add to
                                                                                                           // cart
                                                System.out.println("Would you like to choose product again?");
                                                System.out.println("[1] Yes");
                                                System.out.println("[2] No, Exit to menu");
                                                while (true) {
                                                    try {
                                                        System.out.print(">> ");
                                                        int chooseAgain = USER_INPUT.nextInt();
                                                        if (chooseAgain == 1) {
                                                            department.showAllProductInformation();
                                                            break;
                                                        } else if (chooseAgain == 2) {
                                                            MainProgram();
                                                            break;
                                                        } else {
                                                            System.out.println("Invalid input, Try again.");
                                                        }
                                                    } catch (InputMismatchException e) {
                                                        System.out.println("Invalid input type, Try again.");
                                                        USER_INPUT.next();
                                                    }
                                                }
                                            } else {
                                                System.out.println("Invalid input not found, try again.");
                                            }
                                        } catch (InputMismatchException msg) {
                                            System.out.println("Invalid input type, Try again.");
                                            USER_INPUT.next();
                                        }
                                    }
                                } else if (selectDepartment == 6) {
                                    // Condiments & Spices
                                    CondimentsSpices department = new CondimentsSpices();
                                    department.showAllProductInformation();
                                    ArrayList<Object[]> departmentItems = department.getDepartmentProducts();

                                    while (true) {
                                        try {
                                            System.out.print(">> ");
                                            int selectProduct = USER_INPUT.nextInt();
                                            if (selectProduct == 0) {
                                                MainProgram();
                                                break;
                                            } else if (selectProduct > 0 && selectProduct <= departmentItems.size()) {
                                                myCart.addProduct(departmentItems.get(selectProduct - 1)); // add to
                                                                                                           // cart
                                                System.out.println("Would you like to choose product again?");
                                                System.out.println("[1] Yes");
                                                System.out.println("[2] No, Exit to menu");
                                                while (true) {
                                                    try {
                                                        System.out.print(">> ");
                                                        int chooseAgain = USER_INPUT.nextInt();
                                                        if (chooseAgain == 1) {
                                                            department.showAllProductInformation();
                                                            break;
                                                        } else if (chooseAgain == 2) {
                                                            MainProgram();
                                                            break;
                                                        } else {
                                                            System.out.println("Invalid input, Try again.");
                                                        }
                                                    } catch (InputMismatchException e) {
                                                        System.out.println("Invalid input type, Try again.");
                                                        USER_INPUT.next();
                                                    }
                                                }
                                            } else {
                                                System.out.println("Invalid input not found, try again.");
                                            }
                                        } catch (InputMismatchException msg) {
                                            System.out.println("Invalid input type, Try again.");
                                            USER_INPUT.next();
                                        }
                                    }
                                } else if (selectDepartment == 7) {
                                    // Instant Foods
                                    InstantFoods department = new InstantFoods();
                                    department.showAllProductInformation();
                                    ArrayList<Object[]> departmentItems = department.getDepartmentProducts();

                                    while (true) {
                                        try {
                                            System.out.print(">> ");
                                            int selectProduct = USER_INPUT.nextInt();
                                            if (selectProduct == 0) {
                                                MainProgram();
                                                break;
                                            } else if (selectProduct > 0 && selectProduct <= departmentItems.size()) {
                                                myCart.addProduct(departmentItems.get(selectProduct - 1)); // add to
                                                                                                           // cart
                                                System.out.println("Would you like to choose product again?");
                                                System.out.println("[1] Yes");
                                                System.out.println("[2] No, Exit to menu");
                                                while (true) {
                                                    try {
                                                        System.out.print(">> ");
                                                        int chooseAgain = USER_INPUT.nextInt();
                                                        if (chooseAgain == 1) {
                                                            department.showAllProductInformation();
                                                            break;
                                                        } else if (chooseAgain == 2) {
                                                            MainProgram();
                                                            break;
                                                        } else {
                                                            System.out.println("Invalid input, Try again.");
                                                        }
                                                    } catch (InputMismatchException e) {
                                                        System.out.println("Invalid input type, Try again.");
                                                        USER_INPUT.next();
                                                    }
                                                }
                                            } else {
                                                System.out.println("Invalid input not found, try again.");
                                            }
                                        } catch (InputMismatchException msg) {
                                            System.out.println("Invalid input type, Try again.");
                                            USER_INPUT.next();
                                        }
                                    }
                                } else if (selectDepartment == 8) {
                                    // Sweets
                                    Sweets department = new Sweets();
                                    department.showAllProductInformation();
                                    ArrayList<Object[]> departmentItems = department.getDepartmentProducts();

                                    while (true) {
                                        try {
                                            System.out.print(">> ");
                                            int selectProduct = USER_INPUT.nextInt();
                                            if (selectProduct == 0) {
                                                MainProgram();
                                                break;
                                            } else if (selectProduct > 0 && selectProduct <= departmentItems.size()) {
                                                myCart.addProduct(departmentItems.get(selectProduct - 1)); // add to
                                                                                                           // cart
                                                System.out.println("Would you like to choose product again?");
                                                System.out.println("[1] Yes");
                                                System.out.println("[2] No, Exit to menu");
                                                while (true) {
                                                    try {
                                                        System.out.print(">> ");
                                                        int chooseAgain = USER_INPUT.nextInt();
                                                        if (chooseAgain == 1) {
                                                            department.showAllProductInformation();
                                                            break;
                                                        } else if (chooseAgain == 2) {
                                                            MainProgram();
                                                            break;
                                                        } else {
                                                            System.out.println("Invalid input, Try again.");
                                                        }
                                                    } catch (InputMismatchException e) {
                                                        System.out.println("Invalid input type, Try again.");
                                                        USER_INPUT.next();
                                                    }
                                                }
                                            } else {
                                                System.out.println("Invalid input not found, try again.");
                                            }
                                        } catch (InputMismatchException msg) {
                                            System.out.println("Invalid input type, Try again.");
                                            USER_INPUT.next();
                                        }
                                    }
                                } else {
                                    System.out.println("Invalid input, Try again.");
                                    USER_INPUT.next();
                                }
                            } catch (InputMismatchException msg) {
                                System.out.println("Invalid DataType inputted, try again.");
                                USER_INPUT.next();
                            }
                        }
                    } else if (get_input == 2) {
                        // Cart
                        SpecialText.GetText("hr", 15);
                        System.out.println("\nMY CART:");
                        myCart.showCart("all-clean");
                        SpecialText.GetText("hr", 15);
                        System.out.println("\nMyCart selection:");
                        System.out.println("[1] Check out");
                        System.out.println("[2] Remove product");
                        System.out.println("[3] Go back to menu");
                        while (true) {
                            try {
                                System.out.print(">> ");
                                int myCartSelection = USER_INPUT.nextInt();
                                if (myCartSelection == 1) {
                                    // Check out
                                    System.out.println("Check out");
                                    SpecialText.printReceipt(myCart.getMyCart(), myCart.totalPrice());

                                    System.exit(1);
                                } else if (myCartSelection == 2) {
                                    while (true) {
                                        System.out.println("\nRemove options:");
                                        System.out.println("[0] Go back to main menu");
                                        System.out.println("[1] One product");
                                        System.out.println("[2] All similar products");
                                        System.out.println("[3] All products");
                                        try {
                                            System.out.print(">> ");
                                            int removeOption = USER_INPUT.nextInt();
                                            if (removeOption == 0) {
                                                MainProgram();
                                                break;
                                            } else if (removeOption == 1) {
                                                System.out.println("MY CART:");
                                                myCart.showCart("all-clean");
                                                while (true) {
                                                    try {
                                                        System.out.print("Enter number of product to be removed: ");
                                                        int removeProduct = USER_INPUT.nextInt();
                                                        if (myCart.removeProduct(removeProduct, "one-product")) {
                                                            System.out.println("Product has been removed from cart.");
                                                            break;
                                                        } else {
                                                            System.out.println(
                                                                    "Something went wrong while trying to remove product in My Cart.");
                                                        }
                                                    } catch (InputMismatchException e) {
                                                        System.out.println("Invalid input, try again.");
                                                        USER_INPUT.next();
                                                    }
                                                }
                                            } else if (removeOption == 2) {
                                                System.out.println("MY CART:");
                                                myCart.showCart("all-clean");
                                                while (true) {
                                                    try {
                                                        System.out.print("Enter number of product to be removed: ");
                                                        int removeProduct = USER_INPUT.nextInt();
                                                        if (myCart.removeProduct(removeProduct, "all-similar")) {
                                                            System.out.println(
                                                                    "All similar product has been removed from cart.");
                                                            break;
                                                        } else {
                                                            System.out.println(
                                                                    "Something went wrong while trying to remove product in My Cart.");
                                                        }
                                                    } catch (InputMismatchException e) {
                                                        System.out.println("Invalid input, try again.");
                                                        USER_INPUT.next();
                                                    }
                                                }
                                            } else if (removeOption == 3) {
                                                System.out.println("MY CART:");
                                                myCart.showCart("all-clean");
                                                while (true) {
                                                    try {
                                                        if (myCart.removeProduct(0, "all-product")) {
                                                            System.out
                                                                    .println("All product has been removed from cart.");
                                                            break;
                                                        } else {
                                                            System.out.println(
                                                                    "Something went wrong while trying to remove product in My Cart.");
                                                        }
                                                    } catch (InputMismatchException e) {
                                                        System.out.println("Invalid input, try again.");
                                                        USER_INPUT.next();
                                                    }
                                                }
                                            } else {
                                                System.out.println("Invalid input, try again.");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("Invalid input, try again.");
                                            USER_INPUT.next();
                                        }
                                    }
                                } else if (myCartSelection == 3) {
                                    MainProgram();
                                    break;
                                } else {
                                    System.out.println("Invalid input, try again.");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input type, try again.");
                                USER_INPUT.next();
                            }
                        }
                    } else if (get_input == 3) {
                        System.out.println("\n\nWelcome to STI-MART Kiosk Machine!");
                        System.out.println("\tOur integrated machine started in January of 2023.");
                        System.out.println("\n\tWith the contribution of:");
                        System.out.println("\t - Soria, Angelo (Lead Programmer, Researcher)");
                        System.out.println("\t - Mendoza, Nicole (Researcher and Document related)");
                        System.out.println("\t - Ellisterio, Ivan (Researcher and Document related)");
                        System.out.println("\n\tFrom STI College Bacoor, BSIT-301P.");

                        while (true) {
                            System.out.print("Enter 'y' to go back to menu: ");
                            String goBack = USER_INPUT.next();
                            if (goBack.equalsIgnoreCase("y")) {
                                MainProgram();
                                break;
                            } else {
                                System.out.println("Invalid input, try again.");
                                // USER_INPUT.next();
                            }
                        }
                    } else {
                        System.out.println("Invalid input, Try again.");
                        // USER_INPUT.next();
                    }
                } catch (InputMismatchException msg) {
                    System.out.println("Invalid type of input, Try again.");
                    // USER_INPUT.next();
                }

            }
        }
    }

    public static void main(String[] args) {
        new STI_Mart().MainProgram();
    }

    public static void PANEL_StartUp() {
        SpecialText.ClearConsole();
        System.out.println(SpecialText.GetText("hr", 25));
        System.out.println();
        System.out.println(SpecialText.GetText("brand"));
        System.out.println(SpecialText.GetText("hr", 25));
        System.out.println("[1] SHOP Now!");
        System.out.println("[2] My Cart");
        System.out.println("[3] Credits");
    }

    public static void PANEL_Shop() {
        SpecialText.ClearConsole();
        System.out.println(SpecialText.GetText("hr", 25));
        System.out.println();
        System.out.println(SpecialText.GetText("brand"));
        System.out.println(SpecialText.GetText("hr", 25));
        System.out.println("Choose a Department:");
        System.out.println("[0] Go back to menu");
        System.out.println("[1] Beverages");
        System.out.println("[2] Alcohol");
        System.out.println("[3] Snacks");
        System.out.println("[4] Cigarettes");
        System.out.println("[5] Condiments & Spices");
        System.out.println("[6] Instant Foods");
        System.out.println("[7] Sweets");
        System.out.println("[8] Cleaning Products");
    }

}
