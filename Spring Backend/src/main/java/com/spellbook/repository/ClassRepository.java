package com.spellbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spellbook.entity.CastingClass;

@Repository
public interface ClassRepository extends JpaRepository<CastingClass, Integer>{

}
