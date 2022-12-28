/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.allamiflorencia.CalcularEdad.Controller;

import com.allamiflorencia.CalcularEdad.Service.ICalcularService;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author flopy
 */
@RestController
public class CalcularController {
    @Autowired
    private ICalcularService calcular;
    
    @GetMapping("/calcular/{dia}/{mes}/{anio}")
    public int calcularEdad(@PathVariable int dia, @PathVariable int mes, @PathVariable int anio){
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        
        return calcular.obtenerEdad(fecha);
    }
}
