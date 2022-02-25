package com.ruc.prueba.ruc.service;

import com.ruc.prueba.ruc.proxy.response.Response;

public interface RucService {
    
    public Response registrar(String ruc, String tipo);
}
