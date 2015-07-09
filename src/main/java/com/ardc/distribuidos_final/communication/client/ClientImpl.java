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
    public boolean requestTrade(PostalCard offer, PostalCard desired) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PostalCard> fetchCards() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean registerCard() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeCard(PostalCard p) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notify(String message) throws RemoteException {
        System.out.format("[%s]: %s\n", this.name, message);
    }

    @Override
    public PostalCard searchCard(String location, int year) throws RemoteException {
        return null;
    }
    
    
}
