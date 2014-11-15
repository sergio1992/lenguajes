/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.controller;

import org.springframework.context.annotation.Configuration;

/**
 *
 * @author campitos
 */
@Configuration
public class Cuadrado implements Superficie {
    private int lado;

    public Cuadrado() {
    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
  float area=lado*lado;
  return area;
    }
}
