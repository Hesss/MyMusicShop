package com.example.accessingdatamysql.repos;

import com.example.accessingdatamysql.domain.AboutPrice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AboutPriceRepo extends CrudRepository<AboutPrice, Long> {
    List<AboutPrice> findByInstrument(String instrument);
}
