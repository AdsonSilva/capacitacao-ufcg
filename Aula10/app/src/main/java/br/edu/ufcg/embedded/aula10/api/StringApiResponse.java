package br.edu.ufcg.embedded.aula10.api;


public class StringApiResponse {
    private String message;

    public StringApiResponse() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
