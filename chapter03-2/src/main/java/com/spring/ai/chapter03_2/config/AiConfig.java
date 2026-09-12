package com.spring.ai.chapter03_2.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {
    // @Bean(name="openAiChatClient") 생략가능
    @Bean
    @Primary
    public ChatClient openAiChatClient(OpenAiChatModel openAiChatModel) {
        return ChatClient.builder(openAiChatModel).build();
    }

    // @Bean(name="ollamaChatClient") 생략가능
    @Bean
    public ChatClient ollamaChatClient(OllamaChatModel ollamaChatModel) {
        return ChatClient.builder(ollamaChatModel).build();
    }
}
