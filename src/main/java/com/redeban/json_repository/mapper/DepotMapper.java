package com.redeban.json_repository.mapper;

import com.redeban.json_repository.business.dto.Depot;
import com.redeban.json_repository.dao.models.JsonRepository;
import org.springframework.stereotype.Component;


@Component
public class DepotMapper {

    public Depot getDepot(JsonRepository jsonRepository) {
        Depot depot = new Depot();
        depot.setId(jsonRepository.getId());
        depot.setDate(jsonRepository.getDate());
        if(jsonRepository.getJsonProperty().isObject()){
            depot.setJson(jsonRepository.getJsonProperty());
        }
        return depot;
    }

    public JsonRepository getJsonRepository(Depot depot) {
        JsonRepository jsonRepository = new JsonRepository();
        jsonRepository.setId(depot.getId());
        jsonRepository.setDate(depot.getDate());
        if(depot.getJson() != null&&depot.getJson().isObject()){
            jsonRepository.setJsonProperty(depot.getJson());
        }
        return jsonRepository;
    }
}
