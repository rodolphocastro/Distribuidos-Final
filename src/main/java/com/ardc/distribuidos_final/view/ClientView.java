/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ardc.distribuidos_final.view;

import com.ardc.distribuidos_final.communication.client.interfaces.Client;
import com.ardc.distribuidos_final.entry.AppClient;
import com.ardc.distribuidos_final.model.PostalCard;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALVES, R.C.
 */
public class ClientView extends javax.swing.JFrame {

    /**
     * Creates new form ClientView
     */
    public ClientView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JTabbedPane();
        panelInicializar = new javax.swing.JPanel();
        labelManager = new javax.swing.JLabel();
        labelClientName = new javax.swing.JLabel();
        inputManager = new javax.swing.JTextField();
        inputClientName = new javax.swing.JTextField();
        buttonInitClient = new javax.swing.JButton();
        panelCards = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelLocal = new javax.swing.JLabel();
        labelAno = new javax.swing.JLabel();
        labelCusto = new javax.swing.JLabel();
        inputCardLocal = new javax.swing.JTextField();
        inputCardAno = new javax.swing.JTextField();
        inputCardCusto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        buttonCardRemover = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        buttonCardAdicionar = new javax.swing.JButton();
        panelTrade = new javax.swing.JPanel();
        buttonConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inputTradeClient = new javax.swing.JTextField();
        panelTradeOffer = new javax.swing.JPanel();
        labelTradeOfferLocal = new javax.swing.JLabel();
        labelTradeOfferAno = new javax.swing.JLabel();
        inputTradeOfferLocal = new javax.swing.JTextField();
        inputTradeOfferAno = new javax.swing.JTextField();
        panelTradeDesired = new javax.swing.JPanel();
        labelTradeDesiredLocal = new javax.swing.JLabel();
        labelTradeDesiredAno = new javax.swing.JLabel();
        inputTradeDesiredLocal = new javax.swing.JTextField();
        inputTradeDesiredAno = new javax.swing.JTextField();
        buttonTradeTrocar = new javax.swing.JButton();
        buttonTradeNotify = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Client");

        labelManager.setText("Manager:");

        labelClientName.setText("Nome do Cliente:");

        inputManager.setText("CmmMngr");

        inputClientName.setText("Alpha");

        buttonInitClient.setText("Iniciar Cliente");
        buttonInitClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInitClientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInicializarLayout = new javax.swing.GroupLayout(panelInicializar);
        panelInicializar.setLayout(panelInicializarLayout);
        panelInicializarLayout.setHorizontalGroup(
            panelInicializarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicializarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInicializarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelClientName)
                    .addComponent(labelManager))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInicializarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputManager, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(inputClientName))
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicializarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonInitClient)
                .addContainerGap())
        );
        panelInicializarLayout.setVerticalGroup(
            panelInicializarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInicializarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInicializarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelManager)
                    .addComponent(inputManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInicializarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelClientName)
                    .addComponent(inputClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(buttonInitClient)
                .addContainerGap())
        );

        panelPrincipal.addTab("Iniciar", panelInicializar);

        labelLocal.setText("Localidade:");

        labelAno.setText("Ano:");

        labelCusto.setText("Custo:");

        inputCardLocal.setText("Localidade1");

        inputCardAno.setText("2015");

        inputCardCusto.setText("9.84");

        jPanel2.setLayout(new java.awt.GridLayout());

        buttonCardRemover.setText("Remover");
        buttonCardRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCardRemoverActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCardRemover);

        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        buttonCardAdicionar.setText("Adicionar");
        buttonCardAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCardAdicionarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCardAdicionar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLocal)
                            .addComponent(labelAno, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelCusto, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputCardAno)
                            .addComponent(inputCardLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(inputCardCusto))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLocal)
                    .addComponent(inputCardLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAno)
                    .addComponent(inputCardAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCusto)
                    .addComponent(inputCardCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelCardsLayout = new javax.swing.GroupLayout(panelCards);
        panelCards.setLayout(panelCardsLayout);
        panelCardsLayout.setHorizontalGroup(
            panelCardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCardsLayout.setVerticalGroup(
            panelCardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCardsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPrincipal.addTab("Gerais", panelCards);

        buttonConsultar.setText("Consultar");
        buttonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente:");

        inputTradeClient.setText("Beta");

        panelTradeOffer.setBorder(javax.swing.BorderFactory.createTitledBorder("Oferta"));

        labelTradeOfferLocal.setText("Localidade:");

        labelTradeOfferAno.setText("Ano:");

        inputTradeOfferLocal.setText("Localidade1");

        inputTradeOfferAno.setText("2015");

        javax.swing.GroupLayout panelTradeOfferLayout = new javax.swing.GroupLayout(panelTradeOffer);
        panelTradeOffer.setLayout(panelTradeOfferLayout);
        panelTradeOfferLayout.setHorizontalGroup(
            panelTradeOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTradeOfferLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTradeOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTradeOfferAno)
                    .addComponent(labelTradeOfferLocal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTradeOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputTradeOfferLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(inputTradeOfferAno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTradeOfferLayout.setVerticalGroup(
            panelTradeOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTradeOfferLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTradeOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTradeOfferLocal)
                    .addComponent(inputTradeOfferLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTradeOfferLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTradeOfferAno)
                    .addComponent(inputTradeOfferAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTradeDesired.setBorder(javax.swing.BorderFactory.createTitledBorder("Desejada"));

        labelTradeDesiredLocal.setText("Localidade:");

        labelTradeDesiredAno.setText("Ano:");

        inputTradeDesiredLocal.setText("Localidade2");

        inputTradeDesiredAno.setText("2015");

        javax.swing.GroupLayout panelTradeDesiredLayout = new javax.swing.GroupLayout(panelTradeDesired);
        panelTradeDesired.setLayout(panelTradeDesiredLayout);
        panelTradeDesiredLayout.setHorizontalGroup(
            panelTradeDesiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTradeDesiredLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTradeDesiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelTradeDesiredAno)
                    .addComponent(labelTradeDesiredLocal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTradeDesiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputTradeDesiredLocal, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(inputTradeDesiredAno))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelTradeDesiredLayout.setVerticalGroup(
            panelTradeDesiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTradeDesiredLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTradeDesiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTradeDesiredLocal)
                    .addComponent(inputTradeDesiredLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTradeDesiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTradeDesiredAno)
                    .addComponent(inputTradeDesiredAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        buttonTradeTrocar.setText("Trocar");
        buttonTradeTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTradeTrocarActionPerformed(evt);
            }
        });

        buttonTradeNotify.setText("Notificar");
        buttonTradeNotify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTradeNotifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTradeLayout = new javax.swing.GroupLayout(panelTrade);
        panelTrade.setLayout(panelTradeLayout);
        panelTradeLayout.setHorizontalGroup(
            panelTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTradeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTradeLayout.createSequentialGroup()
                        .addComponent(panelTradeOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelTradeDesired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(panelTradeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputTradeClient)
                        .addGap(18, 18, 18)
                        .addComponent(buttonConsultar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTradeLayout.createSequentialGroup()
                        .addComponent(buttonTradeNotify)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonTradeTrocar)))
                .addContainerGap())
        );
        panelTradeLayout.setVerticalGroup(
            panelTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTradeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConsultar)
                    .addComponent(jLabel1)
                    .addComponent(inputTradeClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTradeOffer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTradeDesired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonTradeTrocar)
                    .addComponent(buttonTradeNotify))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.addTab("Trocas", panelTrade);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonInitClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInitClientActionPerformed
        // Lógica para executar o cliente
        String clientName = this.inputClientName.getText();
        String mngrName = this.inputManager.getText();
        String[] params = {mngrName, clientName};
        AppClient.main(params);
    }//GEN-LAST:event_buttonInitClientActionPerformed

    private void buttonCardAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCardAdicionarActionPerformed
        String location = this.inputCardLocal.getText();
        int year = Integer.parseInt(this.inputCardAno.getText());
        float cost = Float.parseFloat(this.inputCardCusto.getText());
        PostalCard pTemp = new PostalCard(location, cost, year);
        try {
            //System.out.format("[%s]: %s.\n", AppClient.client.getName(), String.format("Adding card %s", pTemp.toString()));
            AppClient.client.registerCard(pTemp);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonCardAdicionarActionPerformed

    private void buttonCardRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCardRemoverActionPerformed
        String location = this.inputCardLocal.getText();
        int year = Integer.parseInt(this.inputCardAno.getText());
        float cost = Float.parseFloat(this.inputCardCusto.getText());
        PostalCard pTemp = new PostalCard(location, cost, year);
        try {
            AppClient.client.removeCard(pTemp);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonCardRemoverActionPerformed

    private void buttonTradeTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTradeTrocarActionPerformed
        String tempLocationOffer = this.inputTradeOfferLocal.getText();
        int tempAnoOffer = Integer.parseInt(this.inputTradeOfferAno.getText());
        PostalCard offer = new PostalCard(tempLocationOffer, 0f, tempAnoOffer);
        
        String tempLocationDesired = this.inputTradeDesiredLocal.getText();
        int tempAnoDesired = Integer.parseInt(this.inputTradeDesiredAno.getText());
        PostalCard desired = new PostalCard(tempLocationDesired, 0f, tempAnoDesired);
        
        try {
            Client temp = AppClient.client.findClient(this.inputTradeClient.getText());
            temp.requestTrade(AppClient.client, offer, desired);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonTradeTrocarActionPerformed

    private void buttonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarActionPerformed
        try {
            Client temp = AppClient.client.findClient(this.inputTradeClient.getText());
            ArrayList<PostalCard> pList = temp.fetchCards();
            System.out.println("Printing all cards for client " + temp.getName());
            for(PostalCard p : pList){
                System.out.println(p.toString());
            }
        } catch (RemoteException ex) {
            System.out.println("Client wasnt found.");
        }
    }//GEN-LAST:event_buttonConsultarActionPerformed

    private void buttonTradeNotifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTradeNotifyActionPerformed
        try {
            Client temp = AppClient.client.findClient(this.inputTradeClient.getText());
            temp.notify("Hello there!!");
        } catch (RemoteException ex) {
            Logger.getLogger(ClientView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonTradeNotifyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            AppClient.client.printCards();
        } catch(Exception err){
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCardAdicionar;
    private javax.swing.JButton buttonCardRemover;
    private javax.swing.JButton buttonConsultar;
    private javax.swing.JButton buttonInitClient;
    private javax.swing.JButton buttonTradeNotify;
    private javax.swing.JButton buttonTradeTrocar;
    private javax.swing.JTextField inputCardAno;
    private javax.swing.JTextField inputCardCusto;
    private javax.swing.JTextField inputCardLocal;
    private javax.swing.JTextField inputClientName;
    private javax.swing.JTextField inputManager;
    private javax.swing.JTextField inputTradeClient;
    private javax.swing.JTextField inputTradeDesiredAno;
    private javax.swing.JTextField inputTradeDesiredLocal;
    private javax.swing.JTextField inputTradeOfferAno;
    private javax.swing.JTextField inputTradeOfferLocal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAno;
    private javax.swing.JLabel labelClientName;
    private javax.swing.JLabel labelCusto;
    private javax.swing.JLabel labelLocal;
    private javax.swing.JLabel labelManager;
    private javax.swing.JLabel labelTradeDesiredAno;
    private javax.swing.JLabel labelTradeDesiredLocal;
    private javax.swing.JLabel labelTradeOfferAno;
    private javax.swing.JLabel labelTradeOfferLocal;
    private javax.swing.JPanel panelCards;
    private javax.swing.JPanel panelInicializar;
    private javax.swing.JTabbedPane panelPrincipal;
    private javax.swing.JPanel panelTrade;
    private javax.swing.JPanel panelTradeDesired;
    private javax.swing.JPanel panelTradeOffer;
    // End of variables declaration//GEN-END:variables
}
