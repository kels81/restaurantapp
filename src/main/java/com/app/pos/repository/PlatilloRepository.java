package com.app.pos.repository;

import com.app.pos.entity.Platillo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatilloRepository extends JpaRepository<Platillo, Long> {
}
