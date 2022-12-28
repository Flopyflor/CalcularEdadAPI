/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.allamiflorencia.CalcularEdad.Service;

import java.time.LocalDate;
import java.time.Period;
import org.springframework.stereotype.Service;

/**
 *
 * @author flopy
 */
@Service
public class CalcularService implements ICalcularService {
    @Override
    public int obtenerEdad(LocalDate fecha){
        LocalDate ahora = LocalDate.now();
        System.out.println(ahora);
        Period edad = fecha.until(ahora);
        return edad.getYears();
    }
}
