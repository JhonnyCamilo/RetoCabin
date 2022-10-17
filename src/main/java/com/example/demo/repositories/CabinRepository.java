package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Cabin;

public interface CabinRepository  extends JpaRepository<Cabin, Integer>{
}
