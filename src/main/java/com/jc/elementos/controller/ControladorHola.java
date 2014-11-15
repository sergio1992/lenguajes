/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author campitos
 */

@Controller
@RequestMapping("/")
public class ControladorHola {
    @Autowired ServicioCalcularAreaImpl servicio;
    
    
    @RequestMapping(value="/hola", method=RequestMethod.GET, headers={"Accept=text/html"})
    public @ResponseBody String hola(){
    float x=        servicio.servicio().calcularArea();
        return "Hola desde mi primer controller malo:"+x;
    }
    
}
