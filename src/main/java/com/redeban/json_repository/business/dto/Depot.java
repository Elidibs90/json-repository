package com.redeban.json_repository.business.dto;


import com.fasterxml.jackson.databind.JsonNode;

import java.util.Date;

public class Depot {

    private Long id;

    private Date date;

    private JsonNode json;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public JsonNode getJson() {
        return json;
    }

    public void setJson(JsonNode json) {
        this.json = json;
    }
}
