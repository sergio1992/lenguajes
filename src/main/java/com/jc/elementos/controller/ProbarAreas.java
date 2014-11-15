/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 *
 * @author campitos
 */


public class ProbarAreas {
    
   

    
    public static void main(String[] args) {
        // TODO code application logic here
    ApplicationContext ctx = new AnnotationConfigApplicationContext(ServicioCalcularAreaImpl.class);
  
Superficie ser= ctx.getBean(Superficie.class);
       System.out.println(       ser.calcularArea());
      
    }
    
}
