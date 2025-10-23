/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado1main;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio
 */
public class CasoEvaluado1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // MAIN CASO EVALUADO 1 JORELL HERNÁNDEZ CALDERÓN

        JOptionPane.showMessageDialog(null, "¡Bienvenido al sistema de facturas y bonos!"); //Da la bienvenida al programa

        AgenteVendedor agenteVendedor1 = new AgenteVendedor("", 0, 0, "", ""); // Crea el objeto "agenteVendedor1"
        Facturas facturaAgente1 = new Facturas("", 0, 0, 0, 0, 0, 0, 0);

        agenteVendedor1.setNombreAgente(JOptionPane.showInputDialog("Digite su nombre: ")); //Solicita el nombre del agente vendedor

        agenteVendedor1.setCedulaAgente(Integer.parseInt(JOptionPane.showInputDialog("Digite su cedula: "))); //solicita la cédular la cual la transforma en un int
        agenteVendedor1.setCodigoAgente(Integer.parseInt(JOptionPane.showInputDialog("Digite su codigo de Agente: ")));//solicita el codigo de Agente
        agenteVendedor1.setSucursal(JOptionPane.showInputDialog("Digite la sucursal en la que trabaja: ")); //Solicita el lugar de trabajo
        agenteVendedor1.setVehiculoAgente(JOptionPane.showInputDialog("¿Tiene vehículo propio? SI/NO : ")); // Pregunta si posee vehiculo o no

        JOptionPane.showMessageDialog(null, "Bienvenido Agente " + agenteVendedor1.getNombreAgente() + "su Cedula es:" + agenteVendedor1.getCedulaAgente());
        
        facturaAgente1.setCedulaCliente(Integer.parseInt(JOptionPane.showInputDialog("Digite la cédula del cliente: ")));
        facturaAgente1.setNombreCliente(JOptionPane.showInputDialog("Digite el nombre del cliente: "));
        JOptionPane.showMessageDialog(null, "Cedula del cliente: " + facturaAgente1.getCedulaCliente() + "Nombre del cliente: " + facturaAgente1.getNombreCliente());
        
        
        
        
        
    }

}
