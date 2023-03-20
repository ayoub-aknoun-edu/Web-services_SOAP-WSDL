package com.miaad.webservice;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class MyConfig {
    @Bean
    SimpleJaxWsServiceExporter serviceExporter() {
        SimpleJaxWsServiceExporter serviceExporterv = new SimpleJaxWsServiceExporter();
        serviceExporterv.setBaseAddress("http://0.0.0.0:8888/");
        return serviceExporterv;
    }
}
