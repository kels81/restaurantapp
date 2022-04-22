package com.app.pos.service;

import com.app.pos.entity.Usuario;
import com.app.pos.exception.UserNotFoundException;
import com.app.pos.repository.UsuarioRepository;
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
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        log.info("Fetching all usuarios");
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) {
        log.info("Fetching usuario by id: {}", id);
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public Usuario add(Usuario usuario) {
        log.info("Saving new usuario: {}", usuario.getNombreUsuario());
        usuario.setActivo(Boolean.TRUE);
        return usuarioRepository.save(usuario);
    }

    public Usuario update(Usuario usuario) {
        log.info("Updating usuario: {}", usuario.getNombreUsuario());
        return usuarioRepository.save(usuario);
    }

    public Boolean delete(Long id) {
        log.info("Deleting usuario by id: {}", id);
        usuarioRepository.deleteById(id);
        return Boolean.TRUE;
    }

}
