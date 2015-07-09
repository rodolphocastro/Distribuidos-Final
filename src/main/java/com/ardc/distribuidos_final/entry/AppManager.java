package com.ardc.distribuidos_final.entry;

import com.ardc.distribuidos_final.communication.manager.ManagerImpl;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe para executar um Manager, deve ser executada antes dos clientes ou eles não poderam se comunicar.
 * @author ALVES, R.C.
 */
public class AppManager {
    
    /**
     * Método para executar um Manager.
     * @param args 
     */
    public static void main(String[] args) {
        String mngrName = "CmmMngr";
        try{
            System.out.format("[%s]: %s.\n", "MngrBoot", "Creating a new Registry");
            Registry reg = LocateRegistry.createRegistry(8765);
            System.out.format("[%s]: %s.\n", "MngrBoot", "Starting up a new Manager");
            ManagerImpl mngr = new ManagerImpl();
            System.out.format("[%s]: %s.\n", "MngrBoot", String.format("Binding the new Manager as %s", mngrName));
            reg.rebind(mngrName, mngr);
            System.out.format("[%s]: %s.\n", "MngrBoot", "Manager is up and running");
        } catch (RemoteException ex) {
            System.err.format("[%s]: %s.\n", "MngrBoot", "Error when starting up the Manager");
        }
    }
}
