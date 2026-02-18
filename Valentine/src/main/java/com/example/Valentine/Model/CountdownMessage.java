package com.example.Valentine.Model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "countdown_messages")
@Getter
@Setter

public class CountdownMessage {

    @Id
    private UUID id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String message;

    private String senderName;

    @Column(nullable = false)
    private LocalDateTime unlockTime;

    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        this.id = UUID.randomUUID();
        this.createdAt = LocalDateTime.now();
    }

}
