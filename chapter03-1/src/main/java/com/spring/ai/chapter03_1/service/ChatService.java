package com.spring.ai.chapter03_1.service;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.stereotype.Service;

@Service
public class ChatService {

    // 02장의 ChatService를 수정합니다
    private final ChatModel chatModel;
    public ChatService(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String getChatResponse(String query) {
        String response = chatModel.call(query);
        return response;
    }

}