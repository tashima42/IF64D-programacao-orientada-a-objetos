/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalmente;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author paulo
 */
public class TelaPrincipal extends JFrame{
    private JLabel jlbCod;
    private JLabel jlbNome;
    private JLabel jlbEndereco;
    
    private JTextField jtfCod;
    private JTextField jtfNome;
    private JTextField jtfEndereco;
    
    private JButton jbtFazAlgo;
    private JButton jbtFazAlgo2;
    
    public Cliente getCliente(){
        Cliente c = new Cliente();
        c.setCod(Integer.parseInt(jtfCod.getText()));
	System.out.println("CODIGO: " + c.getCod());
        c.setNome(jtfNome.getText());
        c.setEndereco(jtfEndereco.getText());
        return c;
    }
    
    public void setCliente(Cliente c){
        jtfCod.setText(String.valueOf(c.getCod()));
        jtfNome.setText(c.getNome());
        jtfEndereco.setText(c.getEndereco());
    }
    
    public TelaPrincipal(){
        this.setTitle("Finalmente!");
        this.setLayout(null);
        //tela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //Instanciando e configurando o rótulo
        jlbCod = new JLabel();
        jlbCod.setText("Código:");
        jlbCod.setBounds(50, 100, 50, 20);
        
        //Instanciando e configurando o rótulo
        jlbNome = new JLabel();
        jlbNome.setText("Nome:");
        jlbNome.setBounds(50, 130, 50, 20);
        
        //Instanciando e configurando o rótulo
        jlbEndereco = new JLabel();
        jlbEndereco.setText("Endereço:");
        jlbEndereco.setBounds(50, 160, 70, 20);
        
        
        //Instanciar e configurar o campo (JTextField)
        jtfCod = new JTextField();
        jtfCod.setBounds(110, 100, 50, 20);
        
        //Instanciar e configurar o campo (JTextField)
        jtfNome = new JTextField();
        jtfNome.setBounds(110, 130, 200, 20);
     
        //Instanciar e configurar o campo (JTextField)
        jtfEndereco = new JTextField();
        jtfEndereco.setBounds(110, 160, 200, 20);
        
        //Instanciar e configurar o botão (JButton)
        jbtFazAlgo = new JButton();
        jbtFazAlgo.setText("Cadastrar!!!");
        jbtFazAlgo.setBounds(300, 350, 150, 30);
        jbtFazAlgo.setName("cadastrar");
        //Instanciar e configurar o botão2 (JButton)
        jbtFazAlgo2 = new JButton();
        jbtFazAlgo2.setText("Consultar!!!");
        jbtFazAlgo2.setBounds(100, 350, 150, 30);
        jbtFazAlgo2.setName("consultar");
        //Adicionar cada componente à tela
        this.add(jlbNome);
        this.add(jtfNome);
        this.add(jbtFazAlgo);
        this.add(jbtFazAlgo2);
        this.add(jlbCod);
        this.add(jlbEndereco);
        this.add(jtfCod);
        this.add(jtfEndereco);
        //Tornar visível
        this.setVisible(true);
    }
    
    public void addListener(Gerenciador g){
        jbtFazAlgo.addActionListener(g);
        jbtFazAlgo2.addActionListener(g);
    }
    
}
