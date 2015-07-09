package com.ardc.distribuidos_final.communication.client.interfaces;

import com.ardc.distribuidos_final.model.PostalCard;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * Interface descrevendo os métodos disponíveis para um Cliente.
 * @author ALVES, R.C.
 */
public interface Client extends Remote, Serializable{
    
    /**
     * Método para disponibilizar o nome do CLiente.
     * @return O nome do Cliente.
     * @throws RemoteException 
     */
    public String getName() throws RemoteException;
    
    /**
     * Método para executar uma troca de dois cartões postais.
     * @param offer O cartão sendo oferecido.
     * @param desired O cartão desejado.
     * @return TRUE se a troca obtiver êxito, FALSE caso contrário.
     * @throws RemoteException 
     */
    public boolean requestTrade(PostalCard offer, PostalCard desired) throws RemoteException;
    
    /**
     * Método para disponibilizar toda a lista de cartas atualmente cadastradas no cliente.
     * @return Retorna um ArrayList contendo os cartões atualmente cadastrados no cliente.
     * @throws RemoteException 
     */
    public ArrayList<PostalCard> fetchCards() throws RemoteException;
    
    /**
     * Método para cadastrar um cartão postal no cliente.
     * @return Retorna TRUE se a carta for cadastrada, FALSE se ocorrer algum erro.
     * @throws RemoteException 
     */
    public boolean registerCard() throws RemoteException;
    
    /**
     * Método para remover um cartão postal de um cliente.
     * @param p O cartão postal a ser removido.
     * @return Retorna TRUE caso o cartão seja removido com êxito, FALSE caso contrário;
     * @throws RemoteException 
     */
    public boolean removeCard(PostalCard p) throws RemoteException;
    
    /**
     * Método para enviar uma simples mensagem ao cliente.
     * @param message A mensagem a ser enviada.
     * @throws RemoteException 
     */
    public void notify(String message) throws RemoteException;
    
    /**
     * Método para localizar um cartão postal com base em seu local de origem e o ano.
     * @param location O local de origem do cartão a ser buscado.
     * @param year O ano do cartão a ser buscado.
     * @return Retorna o cartão postal encontrado para os critérios de busca.
     * @throws RemoteException 
     */
    public PostalCard searchCard(String location, int year) throws RemoteException;
}
