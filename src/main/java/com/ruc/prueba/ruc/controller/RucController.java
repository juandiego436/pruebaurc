package com.ruc.prueba.ruc.controller;

import com.ruc.prueba.ruc.proxy.response.Response;
import com.ruc.prueba.ruc.service.RucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "ruc")
public class RucController {
    
    @Autowired
    RucService service;
    
    @PostMapping(path = "/registrar")
    public Response registrar(@RequestParam String ruc, @RequestParam String tipo){
        return service.registrar(ruc, tipo);
    }
}
