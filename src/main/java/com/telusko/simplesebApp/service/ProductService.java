package com.telusko.simplesebApp.service;

import com.telusko.simplesebApp.model.Product;
import com.telusko.simplesebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {
@Autowired
    ProductRepo repo;

  /*  List<Product> product = new ArrayList(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "lap", 55000),
            new Product(103, "tab", 50000)
    ));

   */

    public List<Product> getProduct() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
      //  return product.stream().filter(p -> p.getProdid() == prodId).findFirst().orElse(new Product(100, "no item", 0));
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct( List < Product> products) {
        repo.saveAll(products);
    }

    public void updateProduct(Product prod) {
      /*  int index = 0;
        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getProdid() == prod.getProdid())
                index = i;

        }

       */
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
       /* int index = 0;
        for (int i = 0; i < product.size(); i++) {
            if (product.get(i).getProdid() == (prodId))
                index =   i;

        }

        */
        repo.deleteById(prodId);
    }
}