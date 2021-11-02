package com.carRental.carRental.carStore;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Car, Long> {
}
