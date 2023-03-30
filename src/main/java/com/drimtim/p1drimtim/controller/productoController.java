package com.drimtim.p1drimtim.controller;


import com.drimtim.p1drimtim.service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/productos")
public class productoController {

    private final ProductoService service;


    @PostMapping("/add")
    public R



}
