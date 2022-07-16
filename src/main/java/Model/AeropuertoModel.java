/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Class.Aeropuerto;
import Controller.Conn;
import java.sql.*;
import java.util.ArrayList;

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
    
    public ArrayList<Aeropuerto> Read() {
        Connection conn = conexion.getConnection();
        ArrayList<Aeropuerto> lista_aeropuertos = new ArrayList();
        String query = "SELECT * FROM aeropuerto;";
        try {
            PreparedStatement newStatement = conn.prepareStatement(query);
            ResultSet resultados = newStatement.executeQuery();
            while (resultados.next()) {
                int id = resultados.getInt(1);
                String nombre = resultados.getString(2);
                String ciudad = resultados.getString(3);
                String pais = resultados.getString(4);
                int coord_x = resultados.getInt(5);
                int coord_y = resultados.getInt(6);
                Aeropuerto aero = new Aeropuerto(id, nombre, ciudad, pais, coord_x, coord_y);
                lista_aeropuertos.add(aero);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        return lista_aeropuertos;
    }
    
    public int Update(Aeropuerto a, int id) {
        Connection conn = conexion.getConnection();
        String query = "UPDATE aeropuerto "
                + "SET nombre = ?, "
                + "ciudad = ?, "
                + "pais = ?, "
                + "coord_x = ?, "
                + "coord_y = ? "
                + "WHERE id = ?";        
         try {
            PreparedStatement newStatement = conn.prepareStatement(query);
            newStatement.setString(1, a.getNombre());
            newStatement.setString(2, a.getCiudad());
            newStatement.setString(3, a.getPais());
            newStatement.setDouble(4, a.getCoord_x());
            newStatement.setDouble(5, a.getCoord_y());
            newStatement.setInt(6, id);
            newStatement.executeUpdate();
            return 1;
        } catch (Exception exp) {
            System.out.println("Error: " + exp.getMessage());
        }
        return 0;
    }
    
    public int Delete(int id) {
        Connection conn = conexion.getConnection();
        String query = "DELETE FROM aeropuerto WHERE id = ?;";
        try {
            PreparedStatement newStatement = conn.prepareStatement(query);
            newStatement.setInt(1, id);
            newStatement.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return 0;
    }

    
    

}
