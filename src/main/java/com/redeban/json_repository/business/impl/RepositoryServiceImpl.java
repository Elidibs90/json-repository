package com.redeban.json_repository.business.impl;

import com.redeban.json_repository.business.RepositoryService;
import com.redeban.json_repository.business.dto.Depot;
import com.redeban.json_repository.dao.crud.RepositoryCrud;
import com.redeban.json_repository.dao.models.JsonRepository;
import com.redeban.json_repository.mapper.DepotMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepositoryServiceImpl implements RepositoryService {

    @Autowired
    private RepositoryCrud repositoryCrud;

    @Override
    public Depot createDepot(Depot depot) {
        if(depot == null){
            return null;
        }
        JsonRepository jsonRepository = DepotMapper.getJsonRepository(depot);
        JsonRepository jsonRepositorySaved = new JsonRepository();

        jsonRepositorySaved=repositoryCrud.save(jsonRepository);

        return DepotMapper.getDepot(jsonRepositorySaved);
    }
}
