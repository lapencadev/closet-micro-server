package com.closet.colours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import util.Constants;

import java.util.List;

@RestController
@RequestMapping("/api/v1/colours")
@CrossOrigin(
        origins = "*",
        methods = {RequestMethod.POST, RequestMethod.GET})
public class ColoursController {

    @Autowired ColoursService coloursService;

    @GetMapping(value = {Constants.BARRA, Constants.VACIO})
    List<Colours> obtenerColores() {
        return this.coloursService.obtenerColores();
    }
}
