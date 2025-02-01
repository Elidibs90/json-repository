package com.redeban.json_repository.mapper;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.redeban.json_repository.business.dto.Depot;
import com.redeban.json_repository.dao.models.JsonRepository;



public class DepotMapper {

    public static Depot getDepot(JsonRepository jsonRepository) {
        Depot depot = new Depot();
        depot.setId(jsonRepository.getId());
        depot.setDate(jsonRepository.getDate());
        String jsonBody = new Gson().toJson(jsonRepository.getJsonProperty());
        if(jsonRepository.isValid(jsonBody)){
            depot.setJson(jsonBody);
        }else{
            depot.setJson(null);
        }
        return depot;
    }

    public static JsonRepository getJsonRepository(Depot depot) {
        JsonRepository jsonRepository = new JsonRepository();
        jsonRepository.setId(depot.getId());
        jsonRepository.setDate(depot.getDate());
        /*if(jsonRepository.isValid(depot.getJson())){
            JsonObject jsonObject= new Gson().fromJson(depot.getJson(), JsonObject.class);
            jsonRepository.setJsonProperty(jsonObject);
        }else{
            jsonRepository.setJsonProperty(new JsonObject());
        }*/

        return jsonRepository;
    }
}
