/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientesoap;

import ws.WSOperaciones;
import ws.WSOperaciones_Service;

/**
 *
 * @author USUARIO
 */
public class ClienteSoap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WSOperaciones_Service servicio = new WSOperaciones_Service();
        WSOperaciones servicios = servicio.getWSOperacionesPort();
        System.out.println(servicios.procesarPago(2, 3));
        System.out.println(servicios.consultaPalabra("gato"));

    }
    
}
