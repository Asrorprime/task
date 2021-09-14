package uz.task.model;

import uz.task.model.templates.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "details")
public class Detail extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private Order order_id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Product product_id;

    private Short quantity;

    public Detail() {
    }

    public Detail( Order order_id, Product product_id, Short quantity) {
        this.order_id = order_id;
        this.product_id = product_id;
        this.quantity = quantity;
    }

    public Order getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Order order_id) {
        this.order_id = order_id;
    }

    public Product getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Product product_id) {
        this.product_id = product_id;
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }
}
