import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

Product product1 = new Product("Shoes",100,5);
Product product2 = new Product("T-Shirt", 25,30);
Product product3 = new Product ("Pants",50,20);

        List<Product>products = Arrays.asList(product1,product2,product3);
        Collections.sort(products);
        int index = Collections.binarySearch(products,product2);
        System.out.println(index);

        for (Product product: products
             ) {
            System.out.println(product.getPrice());

        }

    }
}