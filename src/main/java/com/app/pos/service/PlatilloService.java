package com.app.pos.service;

import com.app.pos.entity.Platillo;
import com.app.pos.entity.Usuario;
import com.app.pos.exception.UserNotFoundException;
import com.app.pos.repository.PlatilloRepository;
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
public class PlatilloService {

    @Autowired
    private PlatilloRepository platilloRepository;

    public List<Platillo> findAll() {
        log.info("Fetching all platillos");
        return platilloRepository.findAll();
    }

    public Platillo findById(Long id) {
        log.info("Fetching platillo by id: {}", id);
        return platilloRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("Platillo by id " + id + " was not found"));
    }

    public Platillo add(Platillo platillo) {
        log.info("Saving new platillo: {}", platillo.getNombrePlatillo());
        return platilloRepository.save(platillo);
    }

    public Platillo update(Platillo platillo) {
        log.info("Updating platillo: {}", platillo.getNombrePlatillo());
        return platilloRepository.save(platillo);
    }

    public Boolean delete(Long id) {
        log.info("Deleting platillo by id: {}", id);
        platilloRepository.deleteById(id);
        return Boolean.TRUE;
    }

}
