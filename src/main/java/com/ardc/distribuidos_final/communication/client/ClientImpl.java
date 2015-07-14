package com.ardc.distribuidos_final.communication.client;

import com.ardc.distribuidos_final.communication.client.interfaces.Client;
import com.ardc.distribuidos_final.communication.manager.interfaces.Manager;
import com.ardc.distribuidos_final.model.PostalCard;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Implementation of a RMI Client, responsible for doing the trades.
 * @author ALVES, R.C.
 */
public class ClientImpl extends UnicastRemoteObject implements Client{
    
    /**
     * Lista contendo todos os cartões postais disponíveis para esse cliente.
     */
    private final ArrayList<PostalCard> availableCards = new ArrayList<>();
    
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
     * Lock para impedir concorrência indevida.
     */
    private final Lock lock = new ReentrantLock();
    
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
        // Verificar se o cartão existe
        System.out.format("[%s]: %s.\n", this.name, String.format("%s wishes to trade cards", cli.getName()));
        if(this.searchCard(desired.getLocation(), desired.getYear()) == null){
            //O cartão desejado não existe
            System.out.format("[%s]: %s.\n", this.name, "The desired card does not exist");
            return false;
        }else{
            //O cartão desejado existe!
            System.out.format("[%s]: %s.\n", this.name, "The desired card exists");
            //Iniciando lock dos clientes
            this.lock();
            cli.lock();
            try{
                //Adicionando os cartoes aos novos donos
                cli.registerCard(desired);
                cli.removeCard(offer);
                this.registerCard(offer);
                this.removeCard(desired);
                //Removendo os cartoes dos antigos donos
                //cli.removeCard(offer);
                //this.removeCard(desired);
            } finally {
                this.unlock();
                cli.unlock();
                System.out.format("[%s]: %s.\n", this.name, "Trade completed");
                this.printCards();
                return true;
            }
            
        }
    }

    @Override
    public ArrayList<PostalCard> fetchCards() throws RemoteException {
        return this.availableCards;
    }

    @Override
    public boolean registerCard(PostalCard p) throws RemoteException {
        System.out.format("[%s]: %s.\n", this.name, "Adding a new PostalCard");
        if(this.availableCards.add(p)){
            System.out.format("[%s]: %s.\n", this.name, "A new PostalCard has been successfully added");
            this.printCards();
            return true;
        }
        System.out.format("[%s]: %s.\n", this.name, "Unable to add a new PostalCard");
        return false;
    }

    @Override
    public boolean removeCard(PostalCard p) throws RemoteException {
        System.out.format("[%s]: %s.\n", this.name, String.format("Attempting to remove PostalCard with data [%s, %d]", p.getLocation(), p.getYear()));
        PostalCard pTemp = this.searchCard(p.getLocation(), p.getYear());
        if(pTemp != null){
            //Postal card encontrado, remove-lo da lista.
            System.out.format("[%s]: %s.\n", this.name, "Removing the PostalCard");
            this.availableCards.remove(pTemp);
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
        this.lock();
        System.out.format("[%s]: %s\n", this.name, "Locking up");
        try{
            for(PostalCard p : this.availableCards){
                if(p.getLocation().equalsIgnoreCase(location) && p.getYear() == year){
                    System.out.format("[%s]: %s\n", this.name, "Found a card that matches the Search Criteria");
                    return p;
                }
            }
        } finally {
            //this.unlock();
            System.out.format("[%s]: %s\n", this.name, "Unlocking");
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

    /**
     * Getter para a lista de clientes conhecidos.
     * @return 
     */
    public ArrayList<Client> getKnowClients() {
        return knowClients;
    }
    
    /**
     * Método para encontrar um cliente específico na lista de clientes atualmente registrados.
     * @param name O nome do cliente a ser buscado.
     * @return 
     */
    public Client findClient(String name) throws RemoteException{
        for(Client cli : this.knowClients){
            if(cli.getName().equalsIgnoreCase(name)){
                return cli;
            }
        }
        
        return null;
    }
    
    /**
     * Método para imprimir dados de todas os cartões no console.
     */
    public void printCards(){
        System.out.format("[%s]: %s.\n", this.name, "Printing all the available cards");
        for(PostalCard p : this.availableCards){
            System.out.format("[%s]: %s\n", this.name, p.toString());
        }
    }

    @Override
    public void lock() throws RemoteException {
        System.out.format("[%s]: %s.\n", this.name, "Is now locked");
        this.lock.tryLock();
    }

    @Override
    public void unlock() throws RemoteException {
        System.out.format("[%s]: %s.\n", this.name, "Is now unlocked");
        this.lock.unlock();
    }
}
