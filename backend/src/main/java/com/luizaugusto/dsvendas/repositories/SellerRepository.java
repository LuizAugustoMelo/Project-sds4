package com.luizaugusto.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizaugusto.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
	
}