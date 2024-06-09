package com.condominios.app.repositories;

import com.condominios.app.model.ManutencaoAvulsa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManutencaoRepository extends JpaRepository<ManutencaoAvulsa, Long> {


}
