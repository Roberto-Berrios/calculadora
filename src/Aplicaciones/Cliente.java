/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicaciones;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author roberto
 */
public class Cliente {
    
    public static void main(String[] args) {
        
        
        try {
            System.out.print("hola");
            String advertencia = JOptionPane.showInputDialog(null, "BIEN");
            
            Registry registro = LocateRegistry.getRegistry("localhost", 1099);
            interfaces i = (interfaces)Naming.lookup("//localhost/CALCULADORA");
            System.out.print("hola");
            while (true) {                
                
                String menu = JOptionPane.showInputDialog("CALCULADORA RMI\n "
                        + "1. SUMA\n" 
                        + "2. RESTA\n"
                        + "3. MULTIPLICACION\n" 
                        + "4. DIVISION\n"
                        + "5. SALIR");
               
                switch(menu){
                    
                    case "1":{
                        
                        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                        
                        JOptionPane.showMessageDialog(null, "La suma es: " +i.suma(n1, n2));
                        
                        break;
                    }
                    
                    case "2":{
                        
                        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                        
                        JOptionPane.showMessageDialog(null, "La resta es: " +i.resta(n1, n2));
                    
                        break;
                }
                    
                    case "3":{
                        
                        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                        
                        JOptionPane.showMessageDialog(null, "La multiplicacion es: " +i.mult(n1, n2));
                    
                        break;
                }
                    
                    case "4":{
                        
                        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                        
                        JOptionPane.showMessageDialog(null, "La division es: " +i.div(n1, n2));
                    
                        break;
                }
                    
                    case "5":{
                    
                        System.exit(0);
                }
                    
             }  
                
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "El servidor no esta  conectado");
            
        }
    }   
    
    
}

