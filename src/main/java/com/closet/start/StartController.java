package com.closet.start;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")

public class StartController {

    @GetMapping("/mi-ruta")
    public String miMetodo() {
        return "¡Hola desde mi controlador!";
    }
}
