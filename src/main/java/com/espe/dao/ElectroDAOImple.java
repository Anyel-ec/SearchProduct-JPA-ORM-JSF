package com.espe.dao;

import com.espe.idao.IElectrodomestico;
import com.espe.model.Electrodomestico;
import com.espe.model.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class ElectroDAOImple  implements IElectrodomestico {
    EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
    @Override
    public List<Electrodomestico> get() {
        Query query = entityManager.createQuery("SELECT e FROM Electrodomestico e");
        return query.getResultList();
    }
    /// desarrollado por Angel Patiño

    @Override
    public Electrodomestico getElectroByCodigo(String codigo) {
        Electrodomestico oElectrodomestico = new Electrodomestico();
        oElectrodomestico = entityManager.find(Electrodomestico.class,codigo);
        //JPAUtil.shutdown();
        return oElectrodomestico;
    }

    @Override
    public List<Electrodomestico> getProductosMenosDeDiezUnidades() {
        Query query = entityManager.createQuery("SELECT e FROM Electrodomestico e WHERE e.cantidad < 10 and e.cantidad > 0");
        return query.getResultList();

    }

    @Override
    public List<Electrodomestico> getProductosConCeroUnidades() {
        Query query = entityManager.createQuery("SELECT e FROM Electrodomestico e WHERE e.cantidad = 0");
        return query.getResultList();
    }
}
