package com.hotels17.servicioreservas.servicio;

import com.hotels17.servicioreservas.dao.ReservaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {
    @Autowired
    private ReservaDAO dao;
}
