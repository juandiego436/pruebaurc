package com.ruc.prueba.ruc.proxy;

import com.ruc.prueba.ruc.proxy.response.RucResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RucProxy {
    
    @Autowired
    RestTemplate restTemplate;
    
    
    public RucResponse consultaRuc(String ruc, String token){
        String url = "http://wsruc.com/Ruc2WS_JSON.php?tipo=2&ruc="+ ruc + "&token=" + token;
        return restTemplate.getForObject(url, RucResponse.class);
    }
}
