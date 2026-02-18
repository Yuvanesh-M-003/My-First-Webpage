package com.example.Valentine.Repository;

import com.example.Valentine.Model.CountdownMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface CountdownRepository extends JpaRepository<CountdownMessage, UUID> {
}