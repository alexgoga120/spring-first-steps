package com.example.springfirststeps.models.services;

import com.example.springfirststeps.models.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Page<Cliente> findAll(Pageable pageable);

    public Cliente findById(Long id);
    public Cliente save(Cliente cliente);

    public void delete(Long id);
}
