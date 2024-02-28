package application;

import model.Product;
import repository.Repository;
import repository.impl.ProductRepositoryImpl;

public class Main2 {
    public static void main(String[] args) {

        Repository<Product> repository = new ProductRepositoryImpl();

        repository.list().stream().forEach(System.out::println);
        System.out.println("**** Get by Id: 1");
        System.out.println(repository.byId(1L).toString());

        repository.delete(2L);
    }
}
