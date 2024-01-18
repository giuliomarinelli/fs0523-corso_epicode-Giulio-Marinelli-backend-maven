package week2.day4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private long id;
    private String status;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private List<Product> products;
    private Customer customer;

    public Order(Customer customer) {
        id = UsaClassi.generateRandomId(0, 1000000000);
        status = "pending";
        orderDate = LocalDate.now();
        this.status = status;
        this.customer = customer;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(long id) {
        List <Long> idList = new ArrayList<>();
        idList = products.stream().map(Product::getId).toList();
        int index = idList.indexOf(id);
        products.remove(index);
    }

    public List<Long> getProductIdsByName(String name) {
        return products.stream().filter(p -> p.getName().equals(name)).map(Product::getId).toList();
    }

    public long getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
