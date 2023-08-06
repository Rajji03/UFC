package com.backend.ufc.repository;

import com.backend.ufc.entity.FighterRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FighterRecordRepository extends JpaRepository<FighterRecords,Integer> {
}
