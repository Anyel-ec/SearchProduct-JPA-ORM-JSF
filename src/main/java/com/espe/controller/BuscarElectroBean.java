package com.espe.controller;


import com.espe.dao.ElectroDAOImple;
import com.espe.model.Electrodomestico;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class BuscarElectroBean {
    private String codigo;
    private Electrodomestico electrodomestico;

    public String buscarElectro() {
        ElectroDAOImple electroDao = new ElectroDAOImple();
        electrodomestico = electroDao.getElectroByCodigo(codigo);

        if (electrodomestico != null) {
            int numeroUnidades = electrodomestico.getCantidad();

            if (numeroUnidades > 10) {
                return "mayordiez";
            } else if (numeroUnidades > 0) {
                return "menosdiez";
            } else {
                return "noexiste";
            }
        } else {
            return "noexiste";
        }
    }
    /// desarrollado por Angel Patiño

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Electrodomestico getElectrodomestico() {
        return electrodomestico;
    }
    /// desarrollado por Angel Patiño

    public void setElectrodomestico(Electrodomestico electrodomestico) {
        this.electrodomestico = electrodomestico;
    }
}
