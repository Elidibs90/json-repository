package com.redeban.json_repository.dao.models;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDateTime;

@Entity
@Table(name = "repository")
public class JsonRepository {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private LocalDateTime fecha;

    @Column(name = "json_information")
    @JdbcTypeCode(SqlTypes.JSON)
    private MyJson jsonProperty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public MyJson getJsonProperty() {
        return jsonProperty;
    }

    public void setJsonProperty(MyJson jsonProperty) {
        this.jsonProperty = jsonProperty;
    }
}
