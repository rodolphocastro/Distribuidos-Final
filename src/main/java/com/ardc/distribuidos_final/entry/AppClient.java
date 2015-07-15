package com.ardc.distribuidos_final.entry;

import com.ardc.distribuidos_final.communication.client.ClientImpl;
import com.ardc.distribuidos_final.communication.manager.interfaces.Manager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Classe para executar um cliente, deve ser executada após a inicialização de um Manager.
 * @author AlvesRC
 */
public class AppClient {
    
    private static Registry reg;
    public static Manager mngr;
    public static ClientImpl client;
    
    /**
     * Método para executar um cliente.
     * @param args 
     */
    public static void main(String[] args) {
        
        String mngrName = args[0];
        String cliName = args[1];
        System.out.format("[%s]: %s.\n", "CliBoot", String.format("Booting client, manager name is %s", mngrName));
        System.out.format("[%s]: %s.\n", "CliBoot", String.format("Booting client, client name is %s", cliName));
        try {
            System.out.format("[%s]: %s.\n", "CliBoot", "Attempting to locate the Registry");
            reg = LocateRegistry.getRegistry(8765);
            System.out.format("[%s]: %s.\n", "CliBoot", "Attempting to locate the Manager");
            mngr = (Manager) reg.lookup(mngrName);
            System.out.format("[%s]: %s.\n", "CliBoot", String.format("Setting up client %s", cliName));
            client = new ClientImpl(cliName, mngr);
            System.out.format("[%s]: %s.\n", "CliBoot", String.format("Binding client %s to the Registry", cliName));
            reg.rebind(cliName, client);
            mngr.notify(cliName + " says hi!");
            if(mngr.registerClient(client)){
                System.out.format("[%s]: %s.\n", "CliBoot", String.format("Client %s is now registered on the Manager", cliName));
            }else{
                System.out.format("[%s]: %s.\n", "CliBoot", String.format("Client %s did not register on the Manager", cliName));
                System.exit(-1);
            }
        } catch (Exception ex) {
            System.out.format("[%s]: %s.\n", "CliBoot", "Error when attempting to create a new Client");
            ex.printStackTrace();
        }
    }
}
