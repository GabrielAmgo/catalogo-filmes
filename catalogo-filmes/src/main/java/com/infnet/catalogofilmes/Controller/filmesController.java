package com.infnet.catalogofilmes.Controller;

import com.infnet.catalogofilmes.Entity.filmes;
import com.infnet.catalogofilmes.Repository.FilmesRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;


    @Controller
    public class filmesController {

        @Autowired
        private FilmesRepository filmesRepository;

        // Método para listar todos os filmes
        @ResponseBody
        @GetMapping("/filmes")
        public List<filmes> getAllFilmes() {
            return filmesRepository.findAll();
        }

        // Método para buscar um filme por ID
        @ResponseBody
        @GetMapping("/{id}")
        public filmes getFilmeById(@PathVariable Integer id) {
            return filmesRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Filme não encontrado com o ID: " + id));
        }

        // Método para criar um novo filme
        @ResponseBody
        @PostMapping("/")
        public filmes createFilme(@RequestBody filmes filme) {
            return filmesRepository.save(filme);
        }

        // Método para atualizar um filme
        @ResponseBody
        @PutMapping("/{id}")
        public filmes updateFilme(@PathVariable Integer id, @RequestBody filmes filmes) {
            filmes filmeExistente = filmesRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Filme não encontrado com o ID: " + id));
            filmeExistente.setNome(filmes.getNome());
            filmeExistente.setAnoLancamento(filmes.getAnoLancamento());
            filmeExistente.setDiretor(filmes.getDiretor());
            filmeExistente.setGenero(filmes.getGenero());
            filmeExistente.setNota(filmes.getNota());
            return filmesRepository.save(filmeExistente);
        }


        // Método para excluir um filme
        @ResponseBody
        @DeleteMapping("/{id}")
        public void deleteFilme(@PathVariable Integer id) {
            filmesRepository.deleteById(id);
        }
    }

