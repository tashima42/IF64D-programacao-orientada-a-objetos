/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalmente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author paulo
 */
public class Gerenciador implements ActionListener{

    private TelaPrincipal tp;
    private Cliente c;
    private ClienteDAO clienteDAO = new ClienteDAO();
    
    public Gerenciador(){
        System.out.println("Passo1");
        tp = new TelaPrincipal();
        tp.addListener(this);
        c = new Cliente();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         
        JButton botaoapertado = (JButton)e.getSource();
        String opc = botaoapertado.getName();
        
        switch(opc){
            case "consultar":
		Cliente clienteConsulta = tp.getCliente();
                tp.setCliente(clienteDAO.getOne(clienteConsulta.getCod()));
                break;
            case "cadastrar":
                c = tp.getCliente();
		clienteDAO.add(c);
                break;
        }
    }
}
