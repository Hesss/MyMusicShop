package com.example.accessingdatamysql.repos;

import com.example.accessingdatamysql.domain.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepo extends CrudRepository<Client, Long> {
    List<Client> findByName(String name);
}
