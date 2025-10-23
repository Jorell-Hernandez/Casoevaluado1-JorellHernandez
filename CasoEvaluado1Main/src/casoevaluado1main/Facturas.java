/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1main;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class Facturas {

    private String nombreCliente;
    private int cedulaCliente;
    private int codigoFactura;
    private double montoFactura;
    private int mesNumero;
    private int electricosContador;
    private int automotrizContador;
    private int construccionContador;

    public Facturas(String nombreCliente, int cedulaCliente, int codigoFactura, double montoFactura, int mesNumero, int electricosContador, int automotrizContador, int construccionContador) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.mesNumero = mesNumero;
        this.electricosContador = electricosContador;
        this.automotrizContador = automotrizContador;
        this.construccionContador = construccionContador;
    }

    public void construccionContador(int contador) {
        contador = 0;
    }

    public String getNombreCliente() { //obtiene el nombre del objeto
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) { //Setea el nombre del objeto
        this.nombreCliente = nombreCliente;
    }

    public int getCedulaCliente() { //obtiene el nombre del objeto
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) { //obtiene el nombre del objeto
        this.cedulaCliente = cedulaCliente;
    }

    public int getCodigoFactura() { //obtiene el nombre del objeto
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) { //obtiene el nombre del objeto
        this.codigoFactura = codigoFactura;
    }

    public double getMontoFactura() { //obtiene el nombre del objeto
        return montoFactura;
    }

    public void setMontoFactura(double montoFactura) { //obtiene el nombre del objeto
        this.montoFactura = montoFactura;
    }

    public int getMesNumero() { //obtiene el numero del mes
        return mesNumero;
    }

    public void setMesNumero(int mesNumero) { //setea el número del mes del objeto
        this.mesNumero = mesNumero;
    }

    public int getElectricosContador() { //obtiene el contador de electronicos del objeto
        return electricosContador;
    }

    public void setElectricosContador(int electricosContador) { //setea el contador de electronicos del objeto
        this.electricosContador = electricosContador;
    }

    public int getAutomotrizContador() { //obtiene el numero de automotriz del objeto
        return automotrizContador;
    }

    public void setAutomotrizContador(int automotrizContador) { //setea el numero de automotriz del objeto
        this.automotrizContador = automotrizContador;
    }

}
