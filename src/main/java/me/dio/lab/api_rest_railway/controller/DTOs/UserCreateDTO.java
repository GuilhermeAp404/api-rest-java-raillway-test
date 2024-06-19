package me.dio.lab.api_rest_railway.controller.DTOs;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import me.dio.lab.api_rest_railway.domain.model.Account;
import me.dio.lab.api_rest_railway.domain.model.Card;
import me.dio.lab.api_rest_railway.domain.model.Feature;
import me.dio.lab.api_rest_railway.domain.model.News;

import java.util.List;

public record UserCreateDTO(
        @NotNull String name,
        @NotNull Account account,
        @NotNull Card card,
        @NotNull List<Feature> features,
        @NotNull List<News> news

) {
}
