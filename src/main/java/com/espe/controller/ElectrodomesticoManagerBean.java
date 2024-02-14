package com.espe.controller;

import com.espe.dao.ElectroDAOImple;
import com.espe.idao.IElectrodomestico;
import com.espe.model.Electrodomestico;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@Named
@RequestScoped
public class ElectrodomesticoManagerBean {

    @Inject
    private BuscarElectroBean buscarElectroBean;
    public String buscarElectrodomestico() {
        return buscarElectroBean.buscarElectro();
    }

    // Desarrollado por Angel Patiño
    private IElectrodomestico electroDAO = new ElectroDAOImple();
    private List<Electrodomestico> electrodomesticos;
    private List<Electrodomestico> productosMenosDeDiezUnidades;
    private List<Electrodomestico> productosConCeroUnidades;

    public ElectrodomesticoManagerBean() {
        // Al crear el controlador, cargamos la lista de electrodomesticos
        electrodomesticos = electroDAO.get();
        productosMenosDeDiezUnidades = electroDAO.getProductosMenosDeDiezUnidades();
        productosConCeroUnidades = electroDAO.getProductosConCeroUnidades();
    }

    public List<Electrodomestico> getElectrodomesticos() {
        return electrodomesticos;
    }

    /// desarrollado por Angel Patiño



    public List<Electrodomestico> getProductosMenosDeDiezUnidades() {
        return productosMenosDeDiezUnidades;
    }

    public List<Electrodomestico> getProductosConCeroUnidades() {
        return productosConCeroUnidades;
    }




}
