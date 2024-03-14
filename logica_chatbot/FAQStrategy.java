package logica_chatbot;

import logica_chatbot.ResponseStrategy;

public class FAQStrategy implements ResponseStrategy {
    @Override
    public String respond(String message) {
        // Lógica para responder perguntas frequentes
        if (message.toLowerCase().contains("horário de funcionamento")) {
            return "Nosso horário de funcionamento é de segunda a sexta, das 9h às 18h.";
        } else if (message.toLowerCase().contains("formas de pagamento")) {
            return "Aceitamos cartão de crédito, débito e transferência bancária.";
        } else {
            return "Desculpe, não entendi sua pergunta. Por favor, tente novamente.";
        }
    }
}
