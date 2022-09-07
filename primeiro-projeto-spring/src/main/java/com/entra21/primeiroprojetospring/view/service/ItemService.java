package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.GeneroDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroPayloadDTO;
import com.entra21.primeiroprojetospring.model.dto.ItemDTO;
import com.entra21.primeiroprojetospring.model.dto.ItemPayloadDTO;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import com.entra21.primeiroprojetospring.model.entity.ItemEntity;
import com.entra21.primeiroprojetospring.view.repository.GeneroRepository;
import com.entra21.primeiroprojetospring.view.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<ItemDTO> getAll() {
        return itemRepository.findAll().stream().map(fr -> {
            ItemDTO dto = new ItemDTO();
            dto.setId(fr.getId());
            dto.setTitulo(fr.getTitulo());
            dto.setEmprestado(fr.getEmprestado());
            return dto;
        }).collect(Collectors.toList());
    }

//    public void save(ItemPayloadDTO input) {
//        ItemEntity newEntity = new ItemEntity();
//        newEntity.setTitulo(input.getTitulo());
//        itemRepository.save(newEntity);
//    }
//
//    public ItemDTO getById(Long id) {
//        ItemEntity e = itemRepository.findById(id)
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Item não encontrado!"));
//        ItemDTO dto = new ItemDTO();
//        dto.setId(e.getId());
//        dto.setTitulo(e.getTitulo());
//        dto.setEmprestado(e.getEmprestado());
//        return dto;
//    }
//
//    public void delete(Long id) {
//        itemRepository.deleteById(id);
//    }
//
//    public ItemDTO update(Long id, String novoTitulo) {
//        ItemEntity e = itemRepository.findById(id)
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Gênero não encontrado!"));
//        e.setTitulo(novoTitulo);
//        e = itemRepository.save(e);
//        ItemDTO dto = new ItemDTO();
//        dto.setTitulo(e.getTitulo());
//        dto.setId(e.getId());
//        return dto;
//    }

}
