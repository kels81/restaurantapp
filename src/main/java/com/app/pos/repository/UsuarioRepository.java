package com.app.pos.repository;

import com.app.pos.entity.Cliente;
import com.app.pos.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
