package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.GeneroDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroPayloadDTO;
import com.entra21.primeiroprojetospring.model.dto.ItemDTO;
import com.entra21.primeiroprojetospring.model.dto.ItemPayloadDTO;
import com.entra21.primeiroprojetospring.view.service.FranquiaService;
import com.entra21.primeiroprojetospring.view.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItemRestController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<ItemDTO> getItens() {
        return itemService.getAll();
    }

//    @PostMapping
//    public void addItem(@RequestBody ItemPayloadDTO payloadDTO){
//        itemService.save(payloadDTO);
//    }

//    @GetMapping("/{id}")
//    public ItemDTO getItem(@PathVariable(name = "id") Long id) {
//        return itemService.getById(id);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteItem(@PathVariable(name = "id") Long id) {
//        itemService.delete(id);
//    }
//
//    @PutMapping("/{id}")
//    public ItemDTO updateGenero(@PathVariable(name = "id") Long id,
//                                  @RequestBody String novoTitulo) {
//        return itemService.update(id, novoTitulo);
//    }
}
