/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicaciones;

import java.rmi.RemoteException;

/**
 *
 * @author roberto
 */
public interface interfaces {
    public int suma(int a, int b)throws RemoteException;
    public int resta(int a, int b)throws RemoteException;
    public int mult(int a, int b)throws RemoteException;
    public int div(int a, int b)throws RemoteException;
    
}