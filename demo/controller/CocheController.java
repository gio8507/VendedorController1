package com.example.demo.controller;

import com.example.demo.domain.Coche;
import com.example.demo.domain.Concesionario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@RestController

  public class CocheController {


    private Concesionario concesionario = new Concesionario();
    @GetMapping ("/coche")
    public ResponseEntity<List<Coche>> coche(){
        ArrayList<Coche> coche1=new ArrayList<>();
        for(Coche coche:concesionario.getCoches().values()){
            coche1.add(coche);
        }
        return ResponseEntity.ok(coche1);
    }

    @PostMapping("/coche")
    public void altaCoches( @Valid @RequestBody CocheInput coche) {
        concesionario.altacoche(coche.toDomain());
    }
    @PutMapping("/coche/{id}")
    public void modificarReservaCoche(@PathVariable String id, @Valid @RequestBody  CocheUpdate coche){
        concesionario.modificarCoche(coche.toDomain(id));
    }
    @DeleteMapping("/coche/{id}")
    public void deleteCoches(@PathVariable String id){
        concesionario.deleteCoche(id);
    }

}






