/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicaciones;

import java.net.InetAddress;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author roberto
 */
public class Server {
    
    public static void main(String[] args) throws Exception{
        
        try {
            
            String IPg = (InetAddress.getLocalHost()).toString();
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("CALCULADORA", new rmi());
            JOptionPane.showMessageDialog(null, "El servidor esta conectado");
            
            
        } catch (RemoteException e) {
            
            JOptionPane.showMessageDialog(null, "El servidor no se pudo conetar" + e);
            
        }
        
    }
    
}

