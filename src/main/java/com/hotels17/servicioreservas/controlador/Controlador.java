package com.hotels17.servicioreservas.controlador;

import com.hotels17.servicioreservas.servicio.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reservas")
public class Controlador {
    @Autowired
    private Servicio servicio;
}
