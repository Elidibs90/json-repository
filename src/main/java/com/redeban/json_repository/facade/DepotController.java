package com.redeban.json_repository.facade;

import com.redeban.json_repository.business.dto.Depot;
import com.redeban.json_repository.business.impl.RepositoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/depot")
public class DepotController {

    @Autowired
    private RepositoryServiceImpl repositoryService;

    @PostMapping
    public ResponseEntity<Depot> addDepot(@RequestBody Depot depot) {
        Depot savedDepot= repositoryService.createDepot(depot);
        return new ResponseEntity<>(savedDepot, HttpStatus.CREATED);
    }

}
