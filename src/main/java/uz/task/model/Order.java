package uz.task.model;

import uz.task.model.templates.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order  extends BaseEntity {

    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer_id;

    public Order() {
    }

    public Order(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Customer customer_id) {
        this.customer_id = customer_id;
    }
}
