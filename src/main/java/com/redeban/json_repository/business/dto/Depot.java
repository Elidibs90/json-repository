package com.redeban.json_repository.business.dto;

import java.time.LocalDateTime;
import java.util.Map;

public class Depot {

    private int id;

    private LocalDateTime date;

    private Map<String, Integer> json;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Map<String, Integer> getJson() {
        return json;
    }

    public void setJson(Map<String, Integer> json) {
        this.json = json;
    }
}
