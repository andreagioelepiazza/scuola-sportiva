package com.Scuola.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Scuola.demo.model.Sede;


@Repository
public interface SedeRepository extends CrudRepository<Sede,Long> {

}
