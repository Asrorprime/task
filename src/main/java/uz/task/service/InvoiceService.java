package uz.task.service;

import org.springframework.http.ResponseEntity;
import uz.task.model.payload.ApiResponseModel;

import java.util.Date;

public interface InvoiceService {

    public ApiResponseModel getInvoicesDate(Date date);
}
