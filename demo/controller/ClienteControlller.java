package com.example.demo.controller;

import com.example.demo.domain.Cliente;
import com.example.demo.domain.Coche;
import com.example.demo.domain.Concesionario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ClienteControlller {
    private Concesionario concesionario = new Concesionario();
    @GetMapping ("/cliente")
    public ResponseEntity<List<Cliente>> cliente(){
        ArrayList<Cliente> cliente1=new ArrayList<>();
        for(Cliente cliente:concesionario.getClientes().values()){
            cliente1.add(cliente);
        }
        return ResponseEntity.ok(cliente1);
    }

    @PostMapping("/cliente")
    public void altaCliente( @Valid @RequestBody ClienteInput cliente) {
        concesionario.altaCliente(cliente.toDomain());
    }
    @PutMapping("/cliente/{dni}")
    public void modificarCliente(@PathVariable String dni, @Valid @RequestBody  ClienteUpdate cliente){
        concesionario.modificarCliente(cliente.toDomain(dni));
    }
    @DeleteMapping("/cliente/{dni}")
    public void deleteCliente(@PathVariable String dni){
        concesionario.deleteCliente(dni);
    }
}

