package com.redeban.json_repository.dao;

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

    @JdbcTypeCode(SqlTypes.JSON)
    private MyJson jsonProperty;


}
