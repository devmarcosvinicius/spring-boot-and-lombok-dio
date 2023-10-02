package com.marcosviniciusdev.controller;

import com.marcosviniciusdev.model.ClientModel;
import com.marcosviniciusdev.repository.ClientRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
@AllArgsConstructor
public class ClientController {

    private final ClientRepository clientRepository;

    @GetMapping("/listall")
    public ResponseEntity<List<ClientModel>> listAll() {
        return ResponseEntity.ok(clientRepository.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<ClientModel> saveClient(@RequestBody ClientModel client) {
        return ResponseEntity.ok(clientRepository.save(client));
    }

}
