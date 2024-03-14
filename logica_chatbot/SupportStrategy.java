package logica_chatbot;

public class SupportStrategy implements ResponseStrategy{
    @Override
    public String respond(String message){
        return "Seu problema foi registrado e um agente entrará em contato em breve.";
    }
}
