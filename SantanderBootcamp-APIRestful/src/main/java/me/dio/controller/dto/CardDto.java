package me.dio.controller.dto;

import me.dio.domain.model.Card;

import java.math.BigDecimal;

public class CardDto {

    private Long id;
    private String number;
    private BigDecimal limit;

    public CardDto() {
    }

    public CardDto(Long id, String number, BigDecimal limit) {
        this.id = id;
        this.number = number;
        this.limit = limit;
    }

    public CardDto(Card model) {
        this(model.getId(), model.getNumber(), model.getLimit());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public Card toModel() {
        Card model = new Card();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setLimit(this.limit);
        return model;
    }
}
