package logica_chatbot;

public class GeneraQuestionStrategy implements ResponseStrategy {
    @Override
    public String respond(String message){
        return "Sinto muito, mas não consigo responder a essa pergunta neste momento.";
    }
}
