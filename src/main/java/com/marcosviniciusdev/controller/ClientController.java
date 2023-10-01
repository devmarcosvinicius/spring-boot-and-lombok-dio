package com.marcosviniciusdev.controller;

import com.marcosviniciusdev.model.ClientModel;
import com.marcosviniciusdev.repository.ClientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public ResponseEntity<List<ClientModel>> listAll() {
        return ResponseEntity.ok(clientRepository.findAll());
    }

}
