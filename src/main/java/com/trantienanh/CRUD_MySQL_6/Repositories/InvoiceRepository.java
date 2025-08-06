package com.trantienanh.CRUD_MySQL_6.Repositories;

import com.trantienanh.CRUD_MySQL_6.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
