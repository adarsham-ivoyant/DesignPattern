package BehaviorlDP.Iterator;

public class Main {
    public static void main(String[] args) {
        ProductCollection products = new ProductCollection();
        products.addProduct(new Product("IPhone"));
        products.addProduct(new Product("Tablet"));
        products.addProduct(new Product("Apple"));

        Iterator iterator =  products.createIterator();
        while (iterator.hasNext()){
            Product product = (Product) iterator.next();
            System.out.println(product.getName());
        }
    }
}
