/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import Class.Aeropuerto;
import Model.AeropuertoModel;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *
 * @author Mario
 */
public class TestAeropuertoModel {
    
    public TestAeropuertoModel() {
    }
    
    private int suma(int num1, int num2){
        return num1+num2;
    }
    
    private int resta(int num1, int num2){
        return num1-num2;
    }
    
    @Test
    public void testSuma(){
     int num1 = 32;
     int num2 = 8;
     int resultado = suma(num1, num2);
          //esperado, obtenido
     assertEquals(40, resultado);
    }
    
    @Test
    public void testResta(){
     int num1 = 32;
     int num2 = 8;
     int resultado = resta(num1, num2);
          //esperado, obtenido
     assertEquals(24, resultado);
    }
    
//    @Test
//    public void testCreate(){
//        AeropuertoModel aeropuerto_model = new AeropuertoModel();
//        Aeropuerto a = new Aeropuerto(14, "Internacional de Mexico", "Mexico DF", "Mexico", 47878, 454545);
//        int resultado = aeropuerto_model.Create(a);
//        assertNotEquals(1, resultado);
//    }
    
    @Test
    public void testUpdate(){
        AeropuertoModel aeropuerto_model = new AeropuertoModel();
        Aeropuerto a = new Aeropuerto(14, "Miguel Hidalgo y Costilla", "Guadalajara", "Mexico", 47878, 454545);
        int resultado = aeropuerto_model.Update(a, 9);
        assertNotEquals(0, resultado);
    }
    
    @Test
    public void testDelete(){
        AeropuertoModel aeropuerto_model = new AeropuertoModel();
        int resultado = aeropuerto_model.Delete(9);
        assertNotEquals(0, resultado);
    }
}
