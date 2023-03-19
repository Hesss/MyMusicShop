package com.example.accessingdatamysql.repos;

import com.example.accessingdatamysql.domain.Sales;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SalesRepo extends CrudRepository<Sales, Long> {
    List<Sales> findByDatesales(String datesales);
}
