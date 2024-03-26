package br.com.fujideia.iesp.tecback.controller;


import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.model.Genero;
import br.com.fujideia.iesp.tecback.service.GeneroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/genero")
public class GeneroController {


    @Autowired
    private GeneroService service;

    @PostMapping
    public Genero salvar(@RequestBody Genero genero) {
        return service.salvar(genero);

    }

    @PutMapping
    public Genero atualizar(@RequestBody Genero genero) {
        return service.atualizar(genero);
    }


    @GetMapping
    public List<Genero> listarTodos() {
        return service.listarTodos();

    }

    @GetMapping("/{id}")
    public Genero buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);

    }

    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Long id) {
        service.excluir(id);
    }


}
