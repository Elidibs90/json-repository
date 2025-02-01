package com.redeban.json_repository.dao.impl;

import com.redeban.json_repository.dao.crud.RepositoryCrud;
import com.redeban.json_repository.dao.models.JsonRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class DaoRepository implements RepositoryCrud {
    @Override
    public <S extends JsonRepository> S save(S entity) {
        return null;
    }

    @Override
    public <S extends JsonRepository> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<JsonRepository> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<JsonRepository> findAll() {
        return null;
    }

    @Override
    public Iterable<JsonRepository> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(JsonRepository entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends JsonRepository> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
