package com.redeban.json_repository.dao.crud;

import com.redeban.json_repository.dao.models.JsonRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCrud extends JpaRepository<JsonRepository, Integer> {
}
