/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado1main;

/**
 *
 * @author Laboratorio
 */
public class AgenteVendedor {

    private String nombreAgente;
    private int cedulaAgente;
    private int codigoAgente;
    private String Sucursal;
    private String vehiculoAgente;

    public AgenteVendedor(String nombreAgente, int cedulaAgente, int codigoAgente, String Sucursal, String vehiculoAgente) {
        this.nombreAgente = nombreAgente;
        this.cedulaAgente = cedulaAgente;
        this.codigoAgente = codigoAgente;
        this.Sucursal = Sucursal;
        this.vehiculoAgente = vehiculoAgente;
    }

    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public int getCedulaAgente() {
        return cedulaAgente;
    }

    public void setCedulaAgente(int cedulaAgente) {
        this.cedulaAgente = cedulaAgente;
    }

    public int getCodigoAgente() {
        return codigoAgente;
    }

    public void setCodigoAgente(int codigoAgente) {
        this.codigoAgente = codigoAgente;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }

    public String getVehiculoAgente() {
        return vehiculoAgente;
    }

    public void setVehiculoAgente(String vehiculoAgente) {
        this.vehiculoAgente = vehiculoAgente;
    }
    
    
}
