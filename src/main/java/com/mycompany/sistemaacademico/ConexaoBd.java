/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaacademico;
import java.sql.*;
/**
 *
 * @author 22.01552-3
 */
public class ConexaoBd {
    private static String host = "Localhost";
    private static String porta = "3306";
    private static String db = "login_e_senha";
    private static String usuario = "root";
    private static String senha = "mysqlimt";
    
    public static Connection obterConexao() throws Exception {
        String url = String.format("jdbc:mysql://%s:%s/%s", host, porta , db);
        return DriverManager.getConnection(url, usuario, senha);
    }
}
