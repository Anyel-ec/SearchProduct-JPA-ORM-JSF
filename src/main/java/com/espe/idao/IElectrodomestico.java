package com.espe.idao;

import com.espe.model.Electrodomestico;

import java.util.List;

public interface IElectrodomestico {
    // desarrollado por Angel Patiño Diaz


    List<Electrodomestico> get();

    Electrodomestico getElectroByCodigo(String codigo);

    List<Electrodomestico>  getProductosMenosDeDiezUnidades();

    List<Electrodomestico>  getProductosConCeroUnidades();
}
