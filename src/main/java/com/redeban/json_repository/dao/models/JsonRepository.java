package com.redeban.json_repository.dao.models;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;
import java.util.Map;

@Entity
@Table(name = "repository")
public class JsonRepository {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private LocalDateTime date;

    @Column(name = "json_information")
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Integer> jsonProperty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime fecha) {
        this.date = fecha;
    }

    public Map<String, Integer> getJsonProperty() {
        return jsonProperty;
    }

    public void setJsonProperty(Map<String, Integer> jsonProperty) {
        this.jsonProperty = jsonProperty;
    }
}
