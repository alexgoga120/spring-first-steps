package com.example.springfirststeps.models.dao;

import com.example.springfirststeps.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDAO extends JpaRepository<Cliente, Long> {

}
