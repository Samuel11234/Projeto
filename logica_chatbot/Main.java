package logica_chatbot;

import logica_chatbot.Chatbot;
import logica_chatbot.FAQStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criar uma instância do chatbot com uma estratégia de resposta de FAQ
        logica_chatbot.Chatbot chatbot = new Chatbot(new FAQStrategy());

        // Interagir com o usuário
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Chatbot! Digite sua mensagem ou 'exit' para sair.");

        while (true) {
            System.out.print("Você: ");
            String message = scanner.nextLine().trim();

            if (message.equalsIgnoreCase("exit")) {
                System.out.println("Até logo!");
                break;
            }

            // Responder a mensagem usando a estratégia atual
            String response = chatbot.respond(message);
            System.out.println("Chatbot: " + response);
        }

        scanner.close();
    }
}
