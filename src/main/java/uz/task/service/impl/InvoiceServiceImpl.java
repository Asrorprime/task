package uz.task.service.impl;

import org.springframework.stereotype.Service;
import uz.task.model.Invoice;
import uz.task.model.payload.ApiResponseModel;
import uz.task.repositories.InvoiceRepository;
import uz.task.service.InvoiceService;

import java.util.Date;
import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    private final InvoiceRepository invoiceRepository;

    public InvoiceServiceImpl(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }


    @Override
    public ApiResponseModel getInvoicesDate(Date date) {
            List<Invoice> invoices = invoiceRepository.findAllByDateToDate(date);
            return new ApiResponseModel(true, "Invoices", invoices);
    }
}
