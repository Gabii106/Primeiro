package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import com.entra21.primeiroprojetospring.view.repository.FranquiaRepository;
import com.entra21.primeiroprojetospring.view.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/generos")
public class GeneroRestController {

    @Autowired
    private GeneroRepository generoRepository;

    @GetMapping
    public List<GeneroEntity> getGeneros() {
        return generoRepository.findAll();
    }

    @PostMapping
    public void addGenero(@RequestBody GeneroEntity entity){
        generoRepository.save(entity);
    }

    @GetMapping("/{id}")
    public ResponseEntity< GeneroEntity> getGenero(@PathVariable(name = "id") Long id) {
        Optional<GeneroEntity> genero = generoRepository.findById(id);
        if (genero.isPresent()){
            return ResponseEntity.ok(genero.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteGenero(@PathVariable(name = "id") Long id) {
        generoRepository.deleteById(id);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity updateGenero( @PathVariable(name = "id") Long id,
                                          @RequestBody String novoNome) {
        Optional<GeneroEntity> entity = generoRepository.findById(id);
        if (entity.isPresent()){
            entity.get().setNome(novoNome);
            return ResponseEntity.ok(generoRepository.save(entity.get()));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
