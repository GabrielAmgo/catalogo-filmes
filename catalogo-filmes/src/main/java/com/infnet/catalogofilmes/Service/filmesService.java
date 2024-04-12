package com.infnet.catalogofilmes.Service;

import com.infnet.catalogofilmes.Entity.filmes;
import com.infnet.catalogofilmes.Repository.FilmesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class filmesService {

    @Autowired
    private FilmesRepository filmesRepository;

    public List<filmes> getAllFilmes() {
        return filmesRepository.findAll();
    }

    public Optional<filmes> getFilmeById(Integer id) {
        return filmesRepository.findById(id);
    }

    public filmes saveFilme(filmes filme) {
        return filmesRepository.save(filme);
    }

    public void deleteFilme(Integer id) {
        filmesRepository.deleteById(id);
    }
}
