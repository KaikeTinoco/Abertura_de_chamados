package com.condominios.app.repositories;

import com.condominios.app.model.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChamadoRepository extends JpaRepository<Chamado, Long> {
    Optional<Chamado> findById(Long id);

}
