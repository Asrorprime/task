package uz.task.model;

import uz.task.model.templates.BaseEntity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "payments")
public class Payment  extends BaseEntity {
    private Timestamp time;
    @Column(length = 8)
    private Double amount;
    @ManyToOne(fetch = FetchType.LAZY)
    private Invoice invoice_id;

    public Payment() {
    }

    public Payment(Timestamp time, Double amount, Invoice invoice_id) {
        this.time = time;
        this.amount = amount;
        this.invoice_id = invoice_id;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Invoice getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Invoice invoice_id) {
        this.invoice_id = invoice_id;
    }
}
