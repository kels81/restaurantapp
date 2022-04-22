package com.app.pos.controller;


import com.app.pos.entity.Platillo;
import com.app.pos.service.PlatilloService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequiredArgsConstructor
@RequestMapping("/platillos")
public class PlatillosController {

    @Autowired
    private PlatilloService platilloService;


    @GetMapping("/all")
    public ResponseEntity<List<Platillo>> getAll() {
        List<Platillo> lstPlatillo = platilloService.findAll();
        return new ResponseEntity<>(lstPlatillo, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Platillo> getById(@PathVariable("id") Long id) {
        Platillo platillo = platilloService.findById(id);
        return new ResponseEntity<>(platillo, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Platillo> add(@RequestBody Platillo platillo) {
        Platillo addPlatillo = platilloService.add(platillo);
        return new ResponseEntity<>(addPlatillo, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Platillo> update(@RequestBody Platillo platillo) {
        Platillo updatePlatillo = platilloService.update(platillo);
        return new ResponseEntity<>(updatePlatillo, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") Long id) {
        platilloService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
