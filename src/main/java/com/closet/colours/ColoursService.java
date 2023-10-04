package com.closet.colours;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColoursService {

    @Autowired ColoursRepository coloursRepository;

    public List<Colours>obtenerColores() {
        return this.coloursRepository.obtenerColores();
    }

}
