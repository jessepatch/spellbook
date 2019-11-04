package com.spellbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spellbook.entity.Subclass;

@Repository
public interface SubclassRepository extends JpaRepository<Subclass, Integer>{

}
