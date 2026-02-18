package com.example.Valentine.Service;

import org.springframework.stereotype.Service;

@Service
public class LoveScoreService {

    public int calculateScore(String name1, String name2) {

        String combined = (name1 + name2).toLowerCase();

        int sum = 0;

        for (char c : combined.toCharArray()) {
            sum += c;
        }

        return sum % 101;
    }

    public String getLoveMessage(int score) {

        if (score > 80) return "Soulmates energy 💖🔥";
        if (score > 60) return "Strong romantic vibes 💘";
        if (score > 40) return "There is potential 🌹";
        if (score > 20) return "Friend zone warning 😅";
        return "Chaotic love situation 💀";
    }
}
