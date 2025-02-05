package com.redeban.json_repository.dao.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.*;
import jakarta.persistence.*;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;


import java.util.Date;

@Entity
@Table(name = "repository")
public class JsonRepository {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "fecha")
    private Date date;

    @Column(name = "json_information")
    @JdbcTypeCode(SqlTypes.JSON)
    private JsonNode jsonProperty;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date fecha) {
        this.date = fecha;
    }


    /*public boolean isValid(String json) {
        try {
            new JSONObject(json);
        } catch (JSONException e) {
            try {
                new JSONArray(json);
            } catch (JSONException ne) {
                return false;
            }
        }
        return true;
    }*/

    public boolean isValid(String json) {
        try {
            JsonParser.parseString(json);
        } catch (JsonSyntaxException e) {
            return false;
        }
        return true;
    }

    public JsonNode getJsonProperty() {
        return jsonProperty;
    }

    public void setJsonProperty(JsonNode jsonProperty) {
        this.jsonProperty = jsonProperty;
    }
}
