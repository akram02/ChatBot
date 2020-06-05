package com.example.application;

import org.goldrenard.jb.configuration.BotConfiguration;
import org.goldrenard.jb.core.Bot;
import org.goldrenard.jb.core.Chat;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    private final Chat chatSession;

    public ChatService() {
        BotConfiguration botConfiguration = BotConfiguration.builder()
                .name("alice")
                .path("src/main/resources")
                .build();
        Bot bot = new Bot(botConfiguration);
        chatSession = new Chat(bot);
    }

    public String answer(String message) {
        return chatSession.multisentenceRespond(message);
    }
}
