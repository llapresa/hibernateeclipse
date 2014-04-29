/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.luis.controllers;

import com.luis.model.Puesto;
import com.luis.services.ManagerPuestos;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author alumno
 */
public class PuestosController implements Controller, BeanFactoryAware {

    private ManagerPuestos dao;
    
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        
        Collection<Puesto> c = dao.getAllPuesto();
        
        Map<String, Object> datos;
        datos = new HashMap<>();
        
        datos.put("fecha", new Date());
        datos.put("puestos", c);
        
        return new ModelAndView("puestos", datos);
    }

    @Override
    public void setBeanFactory(BeanFactory bf) throws BeansException {
        dao = (ManagerPuestos) bf.getBean("daoPuesto");
    }
    
}
