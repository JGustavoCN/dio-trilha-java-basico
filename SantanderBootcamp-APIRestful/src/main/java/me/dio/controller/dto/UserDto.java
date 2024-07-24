package me.dio.controller.dto;

import me.dio.domain.model.User;

import java.util.Set;

import static java.util.Collections.emptySet;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toSet;

public class UserDto {
    private Long id;
    private String name;
    private AccountDto account;
    private CardDto card;
    private Set<FeatureDto> features;
    private Set<NewsDto> news;

    public UserDto() {
    }

    // Construtor com todos os campos
    public UserDto(Long id, String name, AccountDto account, CardDto card, Set<FeatureDto> features, Set<NewsDto> news) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.card = card;
        this.features = features;
        this.news = news;
    }

    // Construtor que aceita o modelo User
    public UserDto(User model) {
        this(
            model.getId(),
            model.getName(),
            ofNullable(model.getAccount()).map(AccountDto::new).orElse(null),
            ofNullable(model.getCard()).map(CardDto::new).orElse(null),
            ofNullable(model.getFeatures()).orElse(emptySet()).stream().map(FeatureDto::new).collect(toSet()),
            ofNullable(model.getNews()).orElse(emptySet()).stream().map(NewsDto::new).collect(toSet())
        );
    }

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountDto getAccount() {
        return account;
    }

    public void setAccount(AccountDto account) {
        this.account = account;
    }

    public CardDto getCard() {
        return card;
    }

    public void setCard(CardDto card) {
        this.card = card;
    }

    public Set<FeatureDto> getFeatures() {
        return features;
    }

    public void setFeatures(Set<FeatureDto> features) {
        this.features = features;
    }

    public Set<NewsDto> getNews() {
        return news;
    }

    public void setNews(Set<NewsDto> news) {
        this.news = news;
    }

    public User toModel() {
        User model = new User();
        model.setId(this.id);
        model.setName(this.name);
        model.setAccount(ofNullable(this.account).map(AccountDto::toModel).orElse(null));
        model.setCard(ofNullable(this.card).map(CardDto::toModel).orElse(null));
        model.setFeatures(ofNullable(this.features).orElse(emptySet()).stream().map(FeatureDto::toModel).collect(toSet()));
        model.setNews(ofNullable(this.news).orElse(emptySet()).stream().map(NewsDto::toModel).collect(toSet()));
        return model;
    }
}
