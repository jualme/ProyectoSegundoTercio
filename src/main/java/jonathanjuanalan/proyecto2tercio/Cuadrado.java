/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonathanjuanalan.proyecto2tercio;

import org.springframework.web.bind.annotation.*;


/**
 *
 * @author Juancho
 */
@RestController
@RequestMapping("/test")
public class Cuadrado {

    @RequestMapping("/{number}")
    public String cuadrado(@PathVariable("number") int number){
        return String.valueOf(Math.pow(number,2));
    }
}
