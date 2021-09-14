package uz.task.model;

import uz.task.model.templates.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer extends BaseEntity {

    @Column(name = "Name", length = 14)
    private String name;
    @Column(name = "Country", length = 3)
    private String country;
    @Column(name = "Address")
    private String address;
    @Column(name = "Phone", length = 50)
    private String phone;

    public Customer() {
    }

    public Customer(String name, String country, String address, String phone) {

        this.name = name;
        this.country = country;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
