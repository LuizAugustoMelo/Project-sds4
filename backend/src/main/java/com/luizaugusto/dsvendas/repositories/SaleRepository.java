package com.luizaugusto.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizaugusto.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
