package com.ruc.prueba.ruc.service.impl;

import com.ruc.prueba.ruc.entity.Ruc;
import com.ruc.prueba.ruc.proxy.RucProxy;
import com.ruc.prueba.ruc.proxy.response.Response;
import com.ruc.prueba.ruc.proxy.response.RucResponse;
import com.ruc.prueba.ruc.repository.RucRepository;
import com.ruc.prueba.ruc.service.RucService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RucServiceImpl implements RucService {

    @Autowired
    RucRepository repository;

    @Autowired
    private RucProxy proxy;

    private static final Logger LOG = LoggerFactory.getLogger(RucServiceImpl.class);

    @Override
    public Response registrar(String ruc, String tipo) {
        RucResponse rucResponse = new RucResponse();
        Ruc rucEntity =  new Ruc();
        try {
            rucResponse = proxy.consultaRuc(ruc, tipo);
            if (rucResponse.getRuc() != null) {
                rucEntity.setRuc(rucResponse.getRuc());
                rucEntity.setRazonSocial(rucResponse.getRazonSocial());
                rucEntity.setDireccion(rucResponse.getDireccion());
                rucEntity.setDepartamento(rucResponse.getDepartamento());
                rucEntity.setUbigeo(rucResponse.getUbigeo());
                rucEntity.setDistrito(rucResponse.getDistrito());
                rucEntity.setProvincia(rucResponse.getProvincia());
                rucEntity.setEstado(rucResponse.getEstado());
                
                rucEntity = repository.save(rucEntity);
            }
            return new Response(rucEntity, "Ok");
        } catch (Exception ex) {
            LOG.error("Error interno", ex);
            return new Response(null, "Error", ex.getMessage());
        }
        
    }

}
