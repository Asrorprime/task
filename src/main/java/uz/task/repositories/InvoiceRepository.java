package uz.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import uz.task.model.Invoice;

import java.util.Date;
import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    @Query(value = "select * from  invoice where issued between date and current_date" , nativeQuery = true)
    List<Invoice> findAllByDateToDate(Date date);
}
