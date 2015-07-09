package com.ardc.distribuidos_final.communication.manager.interfaces;

import com.ardc.distribuidos_final.communication.client.interfaces.Client;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * Interface descrevendo os métodos disponíveis a um Manager.
 * @author ALVES, R.C.
 */
public interface Manager extends Remote, Serializable{
    
    /**
     * Método para enviar uma simples mensagem ao servidor.
     * @param message Oconteúdo da mensagem.
     * @throws RemoteException 
     */
    public void notify(String message) throws RemoteException;
    
    /**
     * Método para cadastrar um cliente no Manager.
     * @param cli Referencia ao cliente que deve ser cadastrado.
     * @return Retorna TRUE caso o cliente seja cadastrado, FALSE caso contrário.
     * @throws RemoteException 
     */
    public boolean registerClient(Client cli) throws RemoteException;
    
    /**
     * Método para buscar uma referência de um cliente com base em seu nome.
     * @param name O nome do cliente a ser buscado.
     * @return A referência ao cliente.
     * @throws RemoteException 
     */
    public Client searchClient(String name) throws RemoteException;
    
    /**
     * Método para consultar todos os clientes atualmente registrados no servidor.
     * @return Retorna um array contendo todos os clientes cadastrados.
     * @throws RemoteException 
     */
    public ArrayList<Client> fetchClients() throws RemoteException;
}
