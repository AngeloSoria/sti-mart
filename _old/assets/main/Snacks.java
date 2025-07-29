package main;

import java.util.ArrayList;

public class Snacks extends DepartmentStructure {
    String DepartmentName = "dep_snacks";
    private ArrayList<Object[]> DepartmentProducts = new ArrayList<>();

    public String getName() {
        return this.DepartmentName;
    }

    private void findProductWithDepartment() {
        if (DepartmentProducts.size() > 0) {
            DepartmentProducts.clear();
        }

        Object[][] all_product = new Product().getProducts();

        for (Object[] this_product : all_product) {
            Object[] current = this_product;
            if (this.getName().equalsIgnoreCase((String) current[3])) {
                this.DepartmentProducts.add(current);
            }
        }
    }

    public ArrayList<Object[]> getDepartmentProducts() {
        return DepartmentProducts;
    }

    public void showAllProductInformation() {
        this.findProductWithDepartment();
        System.out.println("\nSnacks:");
        System.out.println("[0] Go back to menu");
        for (int index = 0; index < DepartmentProducts.size(); index++) {
            System.out.println("[" + (index + 1) + "] " + DepartmentProducts.get(index)[1] + " " + "-".repeat(5)
                    + " Php" + DepartmentProducts.get(index)[2]);
        }
    }
}
