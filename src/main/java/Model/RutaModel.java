/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Class.Aeropuerto;
import Class.Ruta;
import Controller.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Mario
 */
public class RutaModel {
    
    Conn conexion = new Conn();
    
    public int Create(Ruta r){
        Connection conn = conexion.getConnection();
        String query = "INSERT INTO ruta(origen, destino, tiempo_estimado) VALUES(?, ?, ?)";
        try{
            PreparedStatement statment = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statment.setInt(1, r.getOrigen());
            statment.setInt(2, r.getDestino());
            statment.setInt(3, r.getTiempo_estimado());
            statment.executeUpdate();
            ResultSet generatedKey = statment.getGeneratedKeys();
            if (generatedKey.next()) {
                return generatedKey.getInt(1); // Todo salio bien
            }
        }catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }  
        return 0; // SI algo sale mal
    }
    
}
