package com.example.springfirststeps.models.services;

import com.example.springfirststeps.models.entity.Cliente;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
}
