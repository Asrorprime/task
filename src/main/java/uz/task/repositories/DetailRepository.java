package uz.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.task.model.Detail;

@Repository
public interface DetailRepository extends JpaRepository<Detail, Long> {
}
