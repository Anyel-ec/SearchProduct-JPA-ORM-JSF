package com.espe.model;

import jakarta.persistence.*;

import java.time.LocalDate;



@Entity
@Table(name = "electrodomestico")
public class Electrodomestico {
    // Desarrollado por Angel Paul Patiño Diaz


    /*
     * De los electrodomésticos se desea almacenar un
     * código que lo dará el mismo almacen (no es el id, pero es único), el nombre, la marca, el modelo,
     * su fecha de elaboración y la cantidad de unidades,
     *  cada uno con su tipo de dato respectivo.*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_electrodomestico;
    @Column
    private String codigo;
    @Column
    private String nombre;
    @Column
    private String Marca;
    @Column
    private String modelo;
    @Column
    private LocalDate fecha;
    @Column
    private int cantidad;

    /// desarrollado por Angel Patiño
    public Electrodomestico() {
    }


    public Electrodomestico(int id_electrodomestico, String codigo, String nombre, String marca, String modelo, LocalDate fecha, int cantidad) {
        this.id_electrodomestico = id_electrodomestico;
        this.codigo = codigo;
        this.nombre = nombre;
        Marca = marca;
        this.modelo = modelo;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public int getId_electrodomestico() {
        return id_electrodomestico;
    }

    public void setId_electrodomestico(int id_electrodomestico) {
        this.id_electrodomestico = id_electrodomestico;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "id_electrodomestico=" + id_electrodomestico +
                ", codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", Marca='" + Marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fecha=" + fecha +
                ", cantidad=" + cantidad +
                '}';
    }
}
