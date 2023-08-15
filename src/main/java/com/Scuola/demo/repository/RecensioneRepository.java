package com.Scuola.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Scuola.demo.model.Recensione;

@Repository
public interface RecensioneRepository extends CrudRepository <Recensione, Long> {

}
