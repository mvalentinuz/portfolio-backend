package com.portfoliobackend.repository;

import com.portfoliobackend.model.InformacionPersonal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformacionPersonalRepository extends JpaRepository<InformacionPersonal, Long> {
}
