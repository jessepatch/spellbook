package com.spellbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spellbook.entity.Spell;

@Repository
public interface SpellRepository extends JpaRepository<Spell, Integer>{

}
