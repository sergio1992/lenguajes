/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.model;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;

/**
 *
 * @author T107
 */
public class ProbarUsuarioDirecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        SessionFactory factory= HIbernateUtilidades.getSessionFactory();
        Session sesion=factory.openSession();
        Transaction tranza=sesion.beginTransaction();
        Usuario u=new Usuario();
        Direccion d= new Direccion();
        d.setCalle("calle de la amargura");
        d.setColonia("colonia de avon");
        d.setCp(55130);
        d.setEstado("ebriedad");
        //importante ligar al usuario anterior esta direccion
        d.setIdUsuario(u);
        u.setDireccion(d);
        u.setEdad(43);
        u.setNombre("sergio rodriguez");
        u.setSueldo(40002f);
        sesion.save(u);
        sesion.save(d);
        tranza.commit();
        sesion.close();
        System.out.println("todo se guardo bien");
    }
    
}
