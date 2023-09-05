package hw_35.product.dao;

import hw_35.product.model.Product;

public interface SuperMarket {
    //add, remove, search, size, totalSumOfPrice, averagePrice.

    boolean add(Product product);

    Product remove(int id);

    Product search(int id);
    double totalSumOfPrice(Product[] arr);
    double averagePrice(Product[] arr);
    int size();
    void printProductArr(Object[] arr);
    void printProduct();
}
