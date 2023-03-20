package com.miaad.webservice;

import com.miaad.webservice.entities.Compte;
import com.miaad.webservice.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class WebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CompteRepository compteRepository){
        return args -> {
            compteRepository.save(new Compte(null,Math.random()*9999,new Date()));
            compteRepository.save(new Compte(null,Math.random()*9999,new Date()));
            compteRepository.save(new Compte(null,Math.random()*9999,new Date()));

            compteRepository.findAll().forEach(System.out::println);


        };
    }

}
