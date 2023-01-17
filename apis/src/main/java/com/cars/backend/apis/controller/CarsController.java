package com.cars.backend.apis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.backend.apis.dto.CarDTO;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

    @GetMapping
    public String getCars() {
        return "lista de carros";
    }

    @PostMapping
    public String createCar(@RequestBody CarDTO req) {
        return "Modelo: " + req.modelo()
                + "\nFabricante: " + req.fabricante()
                + "\nData de fabricação: " + req.dataFabricacao()
                + "\nValor: " + req.valor() + "R$"
                + "\nAno do modelo: " + req.anoModelo();
    }

}
