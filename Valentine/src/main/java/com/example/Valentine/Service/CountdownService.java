package com.example.Valentine.Service;

import com.example.Valentine.Model.CountdownMessage;
import com.example.Valentine.Repository.CountdownRepository;
import org.springframework.stereotype.Service;
import java.util.UUID;

@Service // This tells Spring this is a Service bean
public class CountdownService {

    private final CountdownRepository repository;

    // Constructor injection for the repository
    public CountdownService(CountdownRepository repository) {
        this.repository = repository;
    }

    public CountdownMessage createCountdown(CountdownMessage message) {
        return repository.save(message);
    }

    public CountdownMessage getCountdown(UUID id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Message not found"));
    }
}