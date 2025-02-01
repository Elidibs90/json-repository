package com.redeban.json_repository.dao.crud;

import com.redeban.json_repository.dao.models.JsonRepository;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryCrud extends CrudRepository<JsonRepository, Integer> {
}
