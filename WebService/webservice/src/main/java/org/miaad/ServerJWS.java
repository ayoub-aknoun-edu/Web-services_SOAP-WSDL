package org.miaad;

import jakarta.xml.ws.Endpoint;
import org.miaad.ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String host= "http://0.0.0.0:9191/";
        Endpoint.publish(host,new BanqueService());
        System.out.println("web service deploye sur "+host);
    }
}
