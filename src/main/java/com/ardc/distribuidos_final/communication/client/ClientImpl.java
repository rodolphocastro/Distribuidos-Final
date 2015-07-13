package com.ardc.distribuidos_final.communication.client;

import com.ardc.distribuidos_final.communication.client.interfaces.Client;
import com.ardc.distribuidos_final.communication.manager.interfaces.Manager;
import com.ardc.distribuidos_final.model.PostalCard;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 * Implementation of a RMI Client, responsible for doing the trades.
 * @author ALVES, R.C.
 */
public class ClientImpl extends UnicastRemoteObject implements Client{
    
    /**
     * Lista contendo todos os cartões postais disponíveis para esse cliente.
     */
    private ArrayList<PostalCard> availableCards = new ArrayList<>();
    
    /**
     * Lista contendo todos os clientes conhecidos pela instância atual.
     */
    private ArrayList<Client> knowClients = new ArrayList<>();
    
    /**
     * Referência ao manager, responsável por apresentar os clientes.
     */
    private final Manager rmiManager;
    
    /**
     * O nome do cliente.
     */
    private final String name;
       
    /**
     * Construtor para um cliente.
     * @param name O nome do cliente.
     * @param rmiManager Referência ao manager que irá ser conhecido por esse cliente.
     */
    public ClientImpl(String name, Manager rmiManager) throws RemoteException{
        this.name = name;
        this.rmiManager = rmiManager;
    }

    @Override
    public String getName() throws RemoteException {
        return this.name;
    }

    @Override
    public boolean requestTrade(Client cli, PostalCard offer, PostalCard desired) throws RemoteException {
        // Ativar as locks ao entrar no método.
        // Propor a troca
        // Aguardar confirmação
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PostalCard> fetchCards() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registerCard(PostalCard p) throws RemoteException {
        System.out.format("[%s]: %s.\n", this.name, "Adding a new PostalCard");
        if(this.availableCards.add(p)){
            System.out.format("[%s]: %s.\n", this.name, "A new PostalCard has been successfully added");
            return true;
        }
        System.out.format("[%s]: %s.\n", this.name, "Unable to add a new PostalCard");
        return false;
    }

    @Override
    public boolean removeCard(PostalCard p) throws RemoteException {
        System.out.format("[%s]: %s.\n", this.name, String.format("Attempting to remove PostalCard with data [%s, %d]", p.getLocation(), p.getYear()));
        if(this.searchCard(p.getLocation(), p.getYear()) != null){
            //Postal card encontrado, remove-lo da lista.
            System.out.format("[%s]: %s.\n", this.name, "Removing the PostalCard");
            this.availableCards.remove(p);
            return true;
        }
        //Nenhum cartão foi encontrado, retornar false.
        System.out.format("[%s]: %s.\n", this.name, "The PostalCard couldn't be removed");
        return false;
    }

    @Override
    public void notify(String message) throws RemoteException {
        System.out.format("[%s]: %s\n", this.name, message);
    }

    @Override
    public PostalCard searchCard(String location, int year) throws RemoteException {
        System.out.format("[%s]: %s\n", this.name, String.format("Searching for a PostalCard with data [%s,%d]", location, year));
        for(PostalCard p : this.availableCards){
            if(p.getLocation().equalsIgnoreCase(location) && p.getYear() == year){
                System.out.format("[%s]: %s\n", this.name, "Found a card that matches the Search Criteria");
                return p;
            }
        }
        System.out.format("[%s]: %s\n", this.name, "No PostalCard match the search criteria");
        return null;
    }
    
    @Override
    public void refreshConnections() throws RemoteException {
        this.knowClients = new ArrayList<>();
        for(Client cli : this.rmiManager.fetchClients()){
            if(cli.getName().equalsIgnoreCase(this.name)){
                //Descartar essa entrada
            }else{
                //Adicionar
                this.knowClients.add(cli);
                cli.notify(String.format("%s greets you", this.name));
            }
        }
    }

    @Override
    public void notifyAcceptTrade() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
