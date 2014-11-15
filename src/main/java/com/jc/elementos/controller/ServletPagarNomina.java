/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.controller;

import com.jc.elementos.model.HIbernateUtilidades;
import com.jc.elementos.model.Nomina;
import com.jc.elementos.model.Trabajador;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author campitos
 */
public class ServletPagarNomina extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    SessionFactory factory=    HIbernateUtilidades.getSessionFactory();
  Session sesion=  factory.openSession();
  Transaction t=sesion.beginTransaction();
  
   // Criteria c= mala.createCriteria(Trabajador.class);
  Trabajador tt=  (Trabajador)sesion.get(Trabajador.class, new Integer(5));
  String nombre=request.getParameter("nombre");
  String paterno=request.getParameter("paterno");
  String materno=request.getParameter("materno");
  Trabajador trabajador=new Trabajador(nombre,paterno,materno);
  
                sesion.save(trabajador);
             
               t.commit();
               sesion.close();
               
        
          
               out.println("Se ha guardado este trabajadorcito"+request.getParameter("nombre"));
        
    }
}