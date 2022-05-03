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
@RequestMapping("/message")
public class MessageController {

    @GetMapping("/all")
    public ResponseEntity<String> getAll() {
        String message = "Hola a todos desde el nuevo update";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
