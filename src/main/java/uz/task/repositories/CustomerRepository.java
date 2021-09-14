package uz.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.task.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
