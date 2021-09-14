package uz.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.task.model.payload.ApiResponseModel;
import uz.task.service.InvoiceService;

import java.util.Date;

@RestController
@RequestMapping(value = "/api/v1/invoice")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/expired_invoices")
    public ApiResponseModel getByTime(@RequestParam Date date){
    return invoiceService.getInvoicesDate(date);
    }




}
