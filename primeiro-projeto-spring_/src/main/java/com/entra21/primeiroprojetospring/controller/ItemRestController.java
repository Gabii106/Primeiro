package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.ItemDTO;
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
    public List<ItemDTO> getItens(
            @RequestParam(name = "idGenero", required = false) Long idGenero)
       {
        return itemService.getAll(idGenero);
    }
}
