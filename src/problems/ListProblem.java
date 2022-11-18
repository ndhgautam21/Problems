package problems;

import java.util.List;

class Sample {

    List<Product> productList;

    static class Product {
        List<Variant> variantList;

        static class Variant {
            List<Inventory> inventoryList;

            static class Inventory {

                private String InventoryId;
            }
        }
    }
}


public class ListProblem {

    Sample sample = new Sample();

    public static void main(String[] args) {

        String s = "1.0";
    }

}
