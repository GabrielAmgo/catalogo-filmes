package com.infnet.catalogofilmes.Repository;


import com.infnet.catalogofilmes.Entity.filmes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmesRepository extends JpaRepository<filmes, Integer> {

}