/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

/**
 *
 * @author campitos
 */
@Configuration
public class ServicioCalcularAreaImpl {
   
    Superficie superficie;

    public ServicioCalcularAreaImpl(Superficie superficie) {
        this.superficie = superficie;
    }

    public ServicioCalcularAreaImpl() {

    }
    
    @Bean
    public Superficie servicio(){
        
        return new Cuadrado(5);
    }
    
}
