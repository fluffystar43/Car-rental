package com.car_rental.car_rental_java_client.repositories;

import com.car_rental.car_rental_java_client.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByLogin(String login);
}
