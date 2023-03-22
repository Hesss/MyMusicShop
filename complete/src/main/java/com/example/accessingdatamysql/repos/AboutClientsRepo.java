package com.example.accessingdatamysql.repos;

import com.example.accessingdatamysql.domain.AboutClients;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AboutClientsRepo extends CrudRepository<AboutClients, Long> {
    List<AboutClients> findByName(String name);
}
