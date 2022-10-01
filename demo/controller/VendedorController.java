package com.example.demo.controller;


import com.example.demo.domain.*;


import com.example.demo.domain.Vendedor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class VendedorController {

    private Concesionario concesionario = new Concesionario();


    @GetMapping("/lista")
    public ResponseEntity<List<Vendedor>> vendedor() {
        ArrayList<Vendedor> vendedor1 = new ArrayList<>();
        for (Vendedor vendedor : concesionario.getVendedores().values()) {
            vendedor1.add(vendedor);
        }
        return ResponseEntity.ok(vendedor1);
    }

    @PostMapping("/vendedores")
    public ResponseEntity<String> altaVendedor(@Valid @RequestBody VendedorInput vendedorInput) throws SiTieneDeExcepcion {
        try {

            concesionario.altaVendedor(vendedorInput.toDomain());
        } catch (SiTieneDeExcepcion e1) {
            e1.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/vendedores/{dni}")
    public ResponseEntity<String> modificarVendedor(@PathVariable String dni, @Valid @RequestBody VendedorUpdate vendedorUpdate) throws NoHayExcepcion {
        try {
            concesionario.modificarVendedores(dni,vendedorUpdate.toDomain(dni));
        } catch (NoHayExcepcion e1) {
            e1.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/vendedores/{dni}")
    public ResponseEntity<String> deleteVendedor(@PathVariable String dni) throws Exception {
        try {
            concesionario.deleteVendedor(dni);
        } catch (NoHayExcepcion e1) {
            e1.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}

