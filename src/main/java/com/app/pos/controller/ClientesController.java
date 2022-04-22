package com.app.pos.controller;


import com.app.pos.entity.Cliente;
import com.app.pos.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequiredArgsConstructor
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClienteService clienteService;


    @GetMapping("/all")
    public ResponseEntity<List<Cliente>> getAll() {
        List<Cliente> lstCliente = clienteService.findAll();
        return new ResponseEntity<>(lstCliente, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Cliente> getById(@PathVariable("id") Long id) {
        Cliente cliente = clienteService.findById(id);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Cliente> add(@RequestBody Cliente Cliente) {
        Cliente addCliente = clienteService.add(Cliente);
        return new ResponseEntity<>(addCliente, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Cliente> update(@RequestBody Cliente Cliente) {
        Cliente updateCliente = clienteService.update(Cliente);
        return new ResponseEntity<>(updateCliente, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id) {
        clienteService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
