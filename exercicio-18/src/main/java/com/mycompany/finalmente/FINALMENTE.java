/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalmente;

import java.sql.Connection;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.sqlite.JDBC;

/**
 *
 * @author paulo
 */
public class FINALMENTE {

    public static void main(String[] args) {
        Connection connection = Connect.connect();
        Connect.prepare(connection, Boolean.TRUE, Boolean.TRUE);

        Gerenciador g = new Gerenciador();
    }
}
