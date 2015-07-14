/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ardc.distribuidos_final.communication.manager;

import com.ardc.distribuidos_final.communication.client.interfaces.Client;
import com.ardc.distribuidos_final.communication.manager.interfaces.Manager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 * Implementação de um Gestor para o sistema de trocas de cartões postais.
 * @author ALVES, R.C.
 */
public class ManagerImpl extends UnicastRemoteObject implements Manager{
    
    /**
     * Lista contendo todos os clientes.
     */
    private final ArrayList<Client> registeredClients;
    
    /**
     * Construtor para um gestor de trocas.
     * @throws RemoteException 
     */
    public ManagerImpl() throws RemoteException{
        System.out.format("[%s]: %s.\n", "Manager", "Starting up the Manager");
        this.registeredClients = new ArrayList<>();
    }
    
    
    @Override
    public void notify(String message) throws RemoteException {
        System.out.format("[%s]: %s\n", "Manager", message);
    }

    @Override
    public boolean registerClient(Client cli) throws RemoteException {
        System.out.format("[%s]: %s.\n", "Manager", String.format("Attempting to register client %s", cli.getName()));
        // Conferindo se o cliente já está cadastrado
        if(searchClient(cli.getName()) != null){
            // Cliente já extá cadastrado
            System.out.format("[%s]: %s.\n", "Manager", String.format("Client %s is already registered", cli.getName()));
            return false;
        }else{
            // Cliente não está cadastrado
            System.out.format("[%s]: %s.\n", "Manager", String.format("Client %s is now registered", cli.getName()));
            this.registeredClients.add(cli);
            this.notifyAllClients("A new client has connected to the manager");
            this.refreshAllClients();
            return true;
        }
    }

    @Override
    public Client searchClient(String name) throws RemoteException {
        System.out.format("[%s]: %s.\n", "Manager", String.format("Searching for client with name %s", name));
        // Iterando sobre a lista de clientes registrados
        for(Client cli : this.registeredClients){
            // Se encontrar um cliente com o nome...
            if(cli.getName().equalsIgnoreCase(name)){
                // Retorne-o como resultado
                return cli;
            }
        }
        // Se  nenhum cliente for encontrado...
        System.out.format("[%s]: %s.\n", "Manager", String.format("Client %s wasn't found", name));
        // Retorne null
        return null;
    }

    @Override
    public ArrayList<Client> fetchClients() throws RemoteException {
        // Retorne todos os clientes cadastrados
        return this.registeredClients;
    }
    
    /**
     * Método para enviar uma mensagem a todos os clientes conectados.
     * @param message A mensagem a ser enviada a todos os clientes.
     * @throws RemoteException 
     */
    public void notifyAllClients(String message) throws RemoteException {
        for(Client cli : this.registeredClients){
            cli.notify(message);
        }
    }
    
    /**
     * Método para atualizar as conexões de todos os clientes.
     * @throws RemoteException 
     */
    public void refreshAllClients() throws RemoteException{
        for(Client cli : this.registeredClients){
            cli.refreshConnections();
        }
    }
}
