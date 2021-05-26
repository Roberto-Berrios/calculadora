/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicaciones;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author roberto
 */
public class rmi extends UnicastRemoteObject implements interfaces{

    public rmi() throws RemoteException{
        int a, b;
    }

    @Override
    public int suma(int a, int b) throws RemoteException {
        return (a + b);
    }

    @Override
    public int resta(int a, int b) throws RemoteException {
        return (a - b);
    }

    @Override
    public int mult(int a, int b) throws RemoteException {
        return (a * b);
    }

    @Override
    public int div(int a, int b) throws RemoteException {
       return (a / b);
    }
}
