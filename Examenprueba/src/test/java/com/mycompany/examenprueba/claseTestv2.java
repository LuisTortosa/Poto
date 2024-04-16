/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.examenprueba;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis
 */
public class claseTestv2 {
    
    public claseTestv2() {
    }

    

    @org.junit.jupiter.api.Test
    public void testdividir() {
        double num1 = 12;
        double num2 = 4;
        clase instance = new clase();
        double resultadoEsperado = 3;
        double resultado = instance.dividir(12,4);
        assertEquals(resultadoEsperado, resultado);
        
        num1 = 3;
        num2 = 2.0;
        resultadoEsperado = 1.5;
        resultado = instance.dividir(3,2);
        assertEquals(resultadoEsperado, resultado);
        
        num1 = 12;
        num2 = 0;
        resultadoEsperado = 0;
        resultado = instance.dividir(12,0);
        assertEquals(resultadoEsperado, resultado);
    }
    
}
