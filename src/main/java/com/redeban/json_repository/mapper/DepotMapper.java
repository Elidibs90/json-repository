package com.redeban.json_repository.mapper;

import com.redeban.json_repository.business.dto.Depot;
import com.redeban.json_repository.dao.models.JsonRepository;

import java.util.HashMap;
import java.util.Map;

public class DepotMapper {

    public static Depot getDepot(JsonRepository jsonRepository) {
        Depot depot = new Depot();
        depot.setId(jsonRepository.getId());
        depot.setDate(jsonRepository.getDate());
        Map<String,Integer> map = new HashMap<>();
        jsonRepository.getJsonProperty().putAll(map);
        depot.setJson(map);
        return depot;
    }

    public static JsonRepository getJsonRepository(Depot depot) {
        JsonRepository jsonRepository = new JsonRepository();
        jsonRepository.setId(depot.getId());
        jsonRepository.setDate(depot.getDate());
        Map<String,Integer> map = new HashMap<>();
        depot.getJson().putAll(map);
        jsonRepository.setJsonProperty(map);
        return jsonRepository;
    }
}
