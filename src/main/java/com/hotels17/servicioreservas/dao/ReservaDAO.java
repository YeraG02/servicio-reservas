package com.hotels17.servicioreservas.dao;

import com.hotels17.servicioreservas.modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaDAO extends JpaRepository<Reserva, Integer> {
}
