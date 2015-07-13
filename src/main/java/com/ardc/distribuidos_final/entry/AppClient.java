package com.ardc.distribuidos_final.entry;

import com.ardc.distribuidos_final.communication.client.ClientImpl;
import com.ardc.distribuidos_final.communication.client.interfaces.Client;
import com.ardc.distribuidos_final.communication.manager.interfaces.Manager;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe para executar um cliente, deve ser executada após a inicialização de um Manager.
 * @author AlvesRC
 */
public class AppClient {
    
    /**
     * Método para executar um cliente.
     * @param args 
     */
    public static void main(String[] args) {
        String mngrName = "CmmMngr";
        String cliName = "Client-Rodolpho";
        try {
            System.out.format("[%s]: %s.\n", "CliBoot", "Attempting to locate the Registry");
            Registry reg = LocateRegistry.getRegistry(8765);
            System.out.format("[%s]: %s.\n", "CliBoot", "Attempting to locate the Manager");
            Manager mngr = (Manager) reg.lookup(mngrName);
            System.out.format("[%s]: %s.\n", "CliBoot", String.format("Setting up client %s", cliName));
            ClientImpl client = new ClientImpl(cliName, mngr);
            System.out.format("[%s]: %s.\n", "CliBoot", String.format("Binding client %s to the Registry", cliName));
            reg.rebind(cliName, client);
            mngr.notify(cliName + " says hi!");
            if(mngr.registerClient(client)){
                System.out.format("[%s]: %s.\n", "CliBoot", String.format("Client %s is now registered on the Manager", cliName));
            }else{
                System.out.format("[%s]: %s.\n", "CliBoot", String.format("Client %s did not register on the Manager", cliName));
            }
        } catch (Exception ex) {
            System.out.format("[%s]: %s.\n", "CliBoot", "Error when attempting to create a new Client");
            ex.printStackTrace();
        }
    }
}
