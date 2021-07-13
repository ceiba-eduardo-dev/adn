package com.example.and_9119;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlumnoTest {

    @Test
    public  void  testCalcularPromedio(){
        Alumno alumno = new Alumno("11", "nombre", 1.2, 1.2);
        double resultado = alumno.calcularPromedio();
        assertEquals((1.2*1.2)/2, resultado, 0.00);
    }

}