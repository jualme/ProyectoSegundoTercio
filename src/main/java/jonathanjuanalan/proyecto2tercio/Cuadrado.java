/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jonathanjuanalan.proyecto2tercio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author Juancho
 */
@RestController
@RequestMapping("/cuadrado")
public class Cuadrado {

    //@RequestMapping("/{number}")
    @RequestMapping(method = RequestMethod.GET, path = "/{number}")
    public ResponseEntity<?> cuadrado(@PathVariable("number") int number){
        return new ResponseEntity<>(number*number,HttpStatus.OK);
    }
}
