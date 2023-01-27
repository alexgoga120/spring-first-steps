package com.example.springfirststeps.models.dao;

import com.example.springfirststeps.models.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteDAO extends CrudRepository<Cliente, Long> {
}
