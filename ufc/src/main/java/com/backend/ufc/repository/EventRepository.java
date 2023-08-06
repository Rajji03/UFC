package com.backend.ufc.repository;

import com.backend.ufc.entity.Events;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventRepository extends JpaRepository< Events,Integer> {
  Optional<Events> findByEventName(String eventName);
}
