package uz.task.model;

import uz.task.model.templates.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product extends BaseEntity {
    @Column(length = 10)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category_id;

    @Column(length = 20)
    private String description;

    private Double price;

    @Column(length = 1024)
    private String photo;

    public Product() {
    }

    public Product(String name, Category category_id, String description, Double price, String photo) {
        this.name = name;
        this.category_id = category_id;
        this.description = description;
        this.price = price;
        this.photo = photo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
