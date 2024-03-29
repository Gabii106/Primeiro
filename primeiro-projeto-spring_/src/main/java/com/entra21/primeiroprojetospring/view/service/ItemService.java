package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.ItemDTO;
import com.entra21.primeiroprojetospring.model.entity.ItemEntity;
import com.entra21.primeiroprojetospring.view.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<ItemDTO> getAll(Long idGenero) {
        List<ItemEntity> list;
        if (idGenero != null) {
            list = itemRepository.findAllByGeneros_Id(idGenero);
        } else {
            list = itemRepository.findAll();
        }
        return list.stream().map(fr -> {
            ItemDTO dto = new ItemDTO();
            dto.setId(fr.getId());
            dto.setTitulo(fr.getTitulo());
            dto.setEmprestado(fr.getEmprestado());
            dto.setTipo(fr.getType());
            return dto;
        }).collect(Collectors.toList());
    }

}
