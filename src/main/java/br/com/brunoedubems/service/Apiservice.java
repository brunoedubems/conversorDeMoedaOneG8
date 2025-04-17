package br.com.brunoedubems.service;

import br.com.brunoedubems.dto.MoedaDto;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Apiservice {

    public MoedaDto getMoeda(String key, String conversor, double valorDeConversao){

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setPrettyPrinting()
                .create();

        try {
            String endereco = "https://v6.exchangerate-api.com/v6/" + key + "/pair/" + conversor + "/" + valorDeConversao;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String jsonResponse = response.body();

            return gson.fromJson(jsonResponse, MoedaDto.class);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
