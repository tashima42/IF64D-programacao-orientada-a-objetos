/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.finalmente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class ClienteDAO {
	
    private final Connection conn;

    public ClienteDAO() {
        this.conn = Connect.connect();
    }

    public void add(Cliente cliente) {
        String sql = "INSERT INTO clientes (cod, name, address) VALUES (?, ?, ?);";

        try ( PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setInt(1, cliente.getCod());
            pstmt.setString(2, cliente.getNome());
            pstmt.setString(3, cliente.getEndereco());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to add cliente");
        }
    }

    public Cliente getOne(int cod) {
	    String sql = "SELECT cod, name, address FROM clientes WHERE cod = ? LIMIT 1;";
	    
	    try ( PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
		    pstmt.setInt(1, cod);

		    ResultSet res = pstmt.executeQuery();

		    int c = res.getInt("cod");
		    String name = res.getString("name");
		    String endereco = res.getString("address");

		    Cliente cliente  = new Cliente();
		    cliente.setCod(cod);
		    cliente.setNome(name);
		    cliente.setEndereco(endereco);
		    return cliente;
		} catch (SQLException e) {
		    System.out.println(e.getMessage());
		    System.out.println("Failed to add cliente");
		}
	    return null;
    }
}
