package com.example.demo.entitiy.repository;

import com.example.demo.entitiy.Cliente;
import com.example.demo.entitiy.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Cliente,Long> {

}
