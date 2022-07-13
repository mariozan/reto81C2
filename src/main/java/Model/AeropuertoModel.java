/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Class.Aeropuerto;
import Controller.Conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 *
 * @author Mario
 */
public class AeropuertoModel {
    Conn conexion = new Conn();
    
    public int Create(Aeropuerto a){
        Connection conn = conexion.getConnection();
        String query = "INSERT INTO aeropuerto(nombre, ciudad, pais, coord_x, coord_y) VALUES(?, ?, ?, ?, ?)";
        try{
            PreparedStatement statment = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statment.setString(1, a.getNombre());
            statment.setString(2, a.getCiudad());
            statment.setString(3, a.getPais());
            statment.setInt(4, (int) a.getCoord_x());
            statment.setInt(5, (int) a.getCoord_y());
            statment.executeUpdate();
            return 1; // Todo salio bien
        }catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }  
        return 0; // SI algo sale mal
    }
}
