package com.app.pos.service;

import com.app.pos.entity.Cliente;
import com.app.pos.exception.UserNotFoundException;
import com.app.pos.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        log.info("Fetching all clientes");
        return clienteRepository.findAll();
    }

    public Cliente findById(Long id) {
        log.info("Fetching cliente by id: {}", id);
        return clienteRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("Cliente by id " + id + " was not found"));
    }

    public Cliente add(Cliente cliente) {
        log.info("Saving new cliente: {}", cliente.getNombreCliente());
        return clienteRepository.save(cliente);
    }

    public Cliente update(Cliente Cliente) {
        log.info("Updating Cliente: {}", Cliente.getNombreCliente());
        return clienteRepository.save(Cliente);
    }

    public Boolean delete(Long id) {
        log.info("Deleting Cliente by id: {}", id);
        clienteRepository.deleteById(id);
        return Boolean.TRUE;
    }

}
