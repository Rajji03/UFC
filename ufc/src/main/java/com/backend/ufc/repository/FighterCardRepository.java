package com.backend.ufc.repository;

import com.backend.ufc.entity.FightCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FighterCardRepository extends JpaRepository<FightCard,Integer> {
}
