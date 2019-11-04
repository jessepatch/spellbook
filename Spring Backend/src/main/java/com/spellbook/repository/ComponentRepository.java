package com.spellbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spellbook.entity.Component;

@Repository
public interface ComponentRepository extends JpaRepository<Component, Integer>{

}
