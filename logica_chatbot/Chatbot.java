package logica_chatbot;

import logica_chatbot.ResponseStrategy;

public class Chatbot {
    private ResponseStrategy strategy;

    public Chatbot(ResponseStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ResponseStrategy strategy) {
        this.strategy = strategy;
    }

    public String respond(String message) {
        return strategy.respond(message);
    }
}
