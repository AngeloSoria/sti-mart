package main;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private String PRODUCT_NAME;
    private double PRODUCT_PRICE;
    private String PRODUCT_DEPARTMENT;
    private String PRODUCT_ID;
    private Map<String, Map<String, Object>> THIS_PRODUCT = new HashMap<>();

    // Array of Product Data
    private Object[][] all_products = {
            // Beverages
            { "id_0001", "Royal Orange Cola", 40.00, "dep_beverages" },
            { "id_0002", "Coca Cola", 40.00, "dep_beverages" },
            { "id_0003", "Sprite", 40.00, "dep_beverages" }, { "id_0004", "Root Beer", 40.00, "dep_beverages" },
            { "id_0005", "Delight", 45.00, "dep_beverages" }, { "id_0006", "C2", 30.00, "dep_beverages" },
            { "id_0007", "Gatorade", 55.00, "dep_beverages" }, { "id_0008", "Mogu-Mogu", 55.00, "dep_beverages" },
            { "id_0009", "Chuckie", 25.00, "dep_beverages" }, { "id_0010", "Smart C", 42.00, "dep_beverages" },

            // Alcohol
            { "id_0011", "Alfonso", 250.00, "dep_alcohol" }, { "id_0012", "Emperador", 200.00, "dep_alcohol" },
            { "id_0013", "San Mig", 80.00, "dep_alcohol" }, { "id_0014", "Red Horse", 80.00, "dep_alcohol" },
            { "id_0015", "Mojito", 150.00, "dep_alcohol" }, { "id_0016", "Smirnoff", 60.00, "dep_alcohol" },
            { "id_0017", "Black Label", 200.00, "dep_alcohol" }, { "id_0018", "Tanduay", 85.00, "dep_alcohol" },
            { "id_0019", "GSM", 80.00, "dep_alcohol" }, { "id_0020", "Whiskey", 300.00, "dep_alcohol" },

            // Snacks
            { "id_0021", "Piattos", 17.00, "dep_snacks" }, { "id_0022", "Nova", 17.00, "dep_snacks" },
            { "id_0023", "Roller Coaster", 20.00, "dep_snacks" }, { "id_0024", "Honey Butter", 40.00, "dep_snacks" },
            { "id_0025", "Pic-A", 45.00, "dep_snacks" }, { "id_0026", "Clover", 25.00, "dep_snacks" },
            { "id_0027", "Martys", 30.00, "dep_snacks" }, { "id_0029", "Oishi", 20.00, "dep_snacks" },
            { "id_0030", "Tortillos", 27.00, "dep_snacks" }, { "id_0031", "Snacku", 21.00, "dep_snacks" },
            { "id_0032", "Mr.Chips", 15.00, "dep_snacks" },

            // Cleaning products
            { "id_0033", "Zonrox", 30.00, "dep_cleaning_products" },
            { "id_0034", "Calla", 15.00, "dep_cleaning_products" },
            { "id_0035", "Downy", 12.00, "dep_cleaning_products" },
            { "id_0036", "Champion", 13.00, "dep_cleaning_products" },
            { "id_0037", "Tide", 15.00, "dep_cleaning_products" },
            { "id_0038", "Wings", 14.00, "dep_cleaning_products" },
            { "id_0039", "Ariel", 15.00, "dep_cleaning_products" },
            { "id_0040", "Breeze", 12.00, "dep_cleaning_products" },
            { "id_0040", "Surf", 10.00, "dep_cleaning_products" },
            { "id_0041", "Perla", 11.00, "dep_cleaning_products" },

            // Cigarettes
            { "id_0042", "Malboro", 150.00, "dep_cigarettes" }, { "id_0043", "CAMEL", 45.00, "dep_cigarettes" },
            { "id_0044", "Dunhill", 299.00, "dep_cigarettes" }, { "id_0045", "Pall mall", 59.00, "dep_cigarettes" },
            { "id_0046", "Lucky Strike", 150.00, "dep_cigarettes" },
            { "id_0047", "Parliament", 144.00, "dep_cigarettes" },
            { "id_0048", "Hope", 89.00, "dep_cigarettes" }, { "id_0049", "Winston", 180.00, "dep_cigarettes" },
            { "id_0050", "Fortine", 49.00, "dep_cigarettes" },

            // Condiments and Spices
            { "id_0051", "Datu Puti Soy Sauce", 30.00, "dep_condiments_spices" },
            { "id_0052", "Datu Puti Vinegar", 30.00, "dep_condiments_spices" },
            { "id_0053", "Datu Puti Patis", 27.00, "dep_condiments_spices" },
            { "id_0054", "Salt", 25.00, "dep_condiments_spices" },
            { "id_0055", "Pepper", 20.00, "dep_condiments_spices" },
            { "id_0056", "Catsup", 35.00, "dep_condiments_spices" },
            { "id_0057", "Mang Tomas", 40.00, "dep_condiments_spices" },
            { "id_0058", "Silver Swan Soy Sauce", 30.00, "dep_condiments_spices" },
            { "id_0059", "Silver Swan Vinegar", 30.00, "dep_condiments_spices" },
            { "id_0060", "Silver Swan Patis", 27.00, "dep_condiments_spices" },

            // Instant Foods
            { "id_0061", "Lucky Me Bulalo", 29.00, "dep_instant_foods" },
            { "id_0062", "Lucky Me La Paz Batchoy", 29.00, "dep_instant_foods" },
            { "id_0063", "Jin Ramen", 35.00, "dep_instant_foods" },
            { "id_0064", "Shin Ramyun", 40.00, "dep_instant_foods" },
            { "id_0065", "Nissin Ramen", 35.00, "dep_instant_foods" },
            { "id_0066", "Ligo", 25.00, "dep_instant_foods" },
            { "id_0067", "Mega", 25.00, "dep_instant_foods" }, { "id_0068", "Century", 30.00, "dep_instant_foods" },
            { "id_0069", "San Marino", 30.00, "dep_instant_foods" }, { "id_0070", "555", 25.00, "dep_instant_foods" },

            // Sweets
            { "id_0071", "Goya", 26.00, "dep_sweets" }, { "id_0072", "Choco Mucho", 12.00, "dep_sweets" },
            { "id_0073", "KitKat", 35.00, "dep_sweets" }, { "id_0074", "Snickers", 45.00, "dep_sweets" },
            { "id_0075", "Choco Baby", 50.00, "dep_sweets" }, { "id_0076", "Pochi", 30.00, "dep_sweets" },
            { "id_0077", "Champi", 33.00, "dep_sweets" }, { "id_0078", "Fun Chocolate", 32.00, "dep_sweets" },
            { "id_0079", "Judge", 30.00, "dep_sweets" }, { "id_0080", "Flat Tops", 20.00, "dep_sweets" },

    };

    private void addProduct(Object name, Object price, Object department, Object product_id) {
        // Object / DataType Casting
        this.PRODUCT_NAME = (String) name;
        this.PRODUCT_PRICE = (double) price;
        this.PRODUCT_DEPARTMENT = (String) department;
        this.PRODUCT_ID = (String) product_id;

        Map<String, Object> PRODUCT_PROPERTIES = new HashMap<>();
        PRODUCT_PROPERTIES.put("product_name", this.PRODUCT_NAME);
        PRODUCT_PROPERTIES.put("product_price", this.PRODUCT_PRICE);
        PRODUCT_PROPERTIES.put("product_department", this.PRODUCT_DEPARTMENT);
        PRODUCT_PROPERTIES.put("product_id", this.PRODUCT_ID);
        THIS_PRODUCT.put(PRODUCT_ID, PRODUCT_PROPERTIES);

        // super.setDepartment(THIS_PRODUCT);
    }

    public void loadAllProducts() {
        for (Object[] product : all_products) {
            addProduct(product[1], product[2], product[3], product[0]);
        }

    }

    public Object[][] getProducts() {
        return all_products;
    }
}
