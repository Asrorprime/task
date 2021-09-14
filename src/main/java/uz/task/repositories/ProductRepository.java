package uz.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.task.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
