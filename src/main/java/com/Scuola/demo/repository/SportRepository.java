package com.Scuola.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Scuola.demo.model.Sport;

@Repository
public interface SportRepository extends CrudRepository<Sport,Long> {

}
