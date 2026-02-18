package com.example.Valentine.Service;

import com.example.Valentine.Model.DateIdeaResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class DateIdeaService {

    public DateIdeaResponse generateIdea(int years, int months, String distanceType) {

        int totalMonths = years * 12 + months;

        // Above 2 years
        if (totalMonths > 24) {
            return new DateIdeaResponse(
                    "You don’t need date ideas anymore ❤️ You both are the perfect idea for each other."
            );
        }

        String stage = determineStage(totalMonths);

        List<String> ideas = generateIdeas(stage, distanceType);

        Random random = new Random();
        String selectedIdea = ideas.get(random.nextInt(ideas.size()));

        return new DateIdeaResponse(selectedIdea);
    }

    // ================== PRIVATE METHODS ==================

    private String determineStage(int totalMonths) {

        if (totalMonths <= 6) {
            return "STAGE_1";
        } else if (totalMonths <= 12) {
            return "STAGE_2";
        } else if (totalMonths <= 18) {
            return "STAGE_3";
        } else {
            return "STAGE_4";
        }
    }

    private List<String> generateIdeas(String stage, String distanceType) {

        if (distanceType.equalsIgnoreCase("LONG")) {

            return switch (stage) {

                case "STAGE_1" -> List.of(
                        "Watch the same movie together on video call 🍿",
                        "Late night deep talk video call 🌙",
                        "Send each other surprise voice notes 🎧",
                        "Virtual coffee date ☕",
                        "Play online games together 🎮",
                        "Send handwritten letter photo 💌",
                        "Cook same recipe together 🍝",
                        "Online quiz about each other 📝",
                        "Virtual playlist exchange 🎵",
                        "Plan your future trip together ✈️"
                );

                case "STAGE_2" -> List.of(
                        "Virtual candlelight dinner 🕯️",
                        "Online truth or dare 🔥",
                        "Watch old photos together 📸",
                        "Send surprise delivery gift 🎁",
                        "Late night stargazing call 🌌",
                        "Online escape room game 🧩",
                        "Record video message 💖",
                        "Make a shared bucket list 📋",
                        "Virtual karaoke night 🎤",
                        "Plan reunion countdown ⏳"
                );

                case "STAGE_3" -> List.of(
                        "Write future love letters 💌",
                        "Create shared digital scrapbook 📔",
                        "Recreate your first chat 💬",
                        "Virtual anniversary celebration 🎉",
                        "Online couple challenge 💑",
                        "Memory quiz night 🧠",
                        "Future house planning session 🏠",
                        "Couple goal discussion ❤️",
                        "Deep life talk session 🌠",
                        "Plan surprise meet visit 🎁"
                );

                default -> List.of(
                        "Plan a surprise trip reveal ✈️",
                        "Create relationship timeline video 🎥",
                        "Virtual slow dance night 💃",
                        "Write vows for fun 💍",
                        "Dream life planning session 🌍",
                        "Memory rewind night 🎞️",
                        "Future baby name discussion 👶",
                        "Couple vision board 📌",
                        "Online spa night together 🛀",
                        "Anniversary virtual party 🎊"
                );
            };

        } else { // SHORT DISTANCE

            return switch (stage) {

                case "STAGE_1" -> List.of(
                        "Go for evening walk together 🌅",
                        "Ice cream date 🍦",
                        "Watch sunset together 🌇",
                        "Mini bike ride date 🏍️",
                        "Try new café ☕",
                        "Street food night 🌮",
                        "Photo walk 📷",
                        "Park chill date 🌳",
                        "Movie theatre date 🎬",
                        "Random surprise meet ❤️"
                );

                case "STAGE_2" -> List.of(
                        "Dinner date 🍽️",
                        "Amusement park fun 🎢",
                        "Couple cooking night 👩‍🍳",
                        "Late night drive 🚗",
                        "Shopping date 🛍️",
                        "Beach visit 🌊",
                        "Temple visit together 🛕",
                        "Bowling night 🎳",
                        "Game arcade date 🕹️",
                        "Romantic rooftop dinner 🌃"
                );

                case "STAGE_3" -> List.of(
                        "Mini weekend trip 🏖️",
                        "Adventure activity 🧗",
                        "Couple photoshoot 📸",
                        "Surprise candlelight setup 🕯️",
                        "Memory scrapbook making 📔",
                        "Staycation night 🏨",
                        "Concert date 🎵",
                        "Cooking competition 🍳",
                        "Night picnic 🌙",
                        "Theme park revisit 🎠"
                );

                default -> List.of(
                        "Plan long vacation together ✈️",
                        "Family meet introduction 👨‍👩‍👧",
                        "Luxury dinner night 🍷",
                        "Relationship milestone celebration 🎉",
                        "Recreate first date 💕",
                        "Future home planning 🏡",
                        "Dream car ride date 🚘",
                        "Anniversary big surprise 🎁",
                        "Couple spa day 🧖",
                        "Write love letters to each other 💌"
                );
            };
        }
    }
}
