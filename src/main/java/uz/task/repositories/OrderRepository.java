package uz.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.task.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
