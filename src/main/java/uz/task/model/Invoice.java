package uz.task.model;


import uz.task.model.templates.BaseEntity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invoice")
public class Invoice extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY)
    private Order order;

    @Column(length = 8)
    private Double amount;

    private Date issued;

    private Date due;

    public Invoice() {
    }

    public Invoice(Order order, Double amount, Date issued, Date due) {
        this.order = order;
        this.amount = amount;
        this.issued = issued;
        this.due = due;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getIssued() {
        return issued;
    }

    public void setIssued(Date issued) {
        this.issued = issued;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }
}
