package it.nttdata.myschool.repository;

import org.springframework.data.repository.CrudRepository;

import it.nttdata.myschool.entity.SchoolClass;

public interface ClassRepository extends CrudRepository <SchoolClass,Long>{



}