package com.Scuola.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Scuola.demo.model.Istruttore;

@Repository
public interface IstruttoreRepository extends CrudRepository<Istruttore, Long> {

}
