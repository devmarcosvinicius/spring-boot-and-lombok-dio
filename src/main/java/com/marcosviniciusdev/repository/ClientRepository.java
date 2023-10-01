package com.marcosviniciusdev.repository;

import com.marcosviniciusdev.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {
}
