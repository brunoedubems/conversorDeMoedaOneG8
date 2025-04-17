package br.com.brunoedubems.dto;

public record MoedaDto(String base_code, String target_code, double conversion_rate, double conversion_result) { }

