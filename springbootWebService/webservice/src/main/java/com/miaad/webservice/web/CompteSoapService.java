package com.miaad.webservice.web;


import com.miaad.webservice.entities.Compte;
import com.miaad.webservice.repositories.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "banqueWS")
public class CompteSoapService {
    @Autowired
    private CompteRepository compteRepository;

    @WebMethod
    public List<Compte> compteList(){
        return compteRepository.findAll();
    }

    @WebMethod
    public  Compte getOne(@WebParam Long id ){
        return compteRepository.findById(id).get();
    }

}
