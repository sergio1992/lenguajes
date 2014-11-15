/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.model;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author campitos
 */
public class Operaciones {
    public static void main(String args[]){
    SessionFactory factory=    HIbernateUtilidades.getSessionFactory();
  Session sesion=  factory.openSession();
  Transaction t=sesion.beginTransaction();
  
               //  mala.save(new Trabajador("juan", "campos", "martinez"));
  
          Trabajador tra= (Trabajador)  sesion.createCriteria(Trabajador.class).add(Restrictions.idEq(new Integer(14))).uniqueResult();
               
                   //   List lista=     c.list();
             //  Trabajador t4=   (Trabajador)    lista.get(11);
                  //    System.out.println(lista.size());
                 // sesion.update(new Trabajador(16,"Martinez"));
                      
                      
             t.commit();
                 sesion.close();
                 System.out.println("Se ha guardado este trabajadorcito"+tra.getNombre());
    }
}
