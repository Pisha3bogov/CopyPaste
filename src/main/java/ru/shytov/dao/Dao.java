package ru.shytov.dao;

import java.util.List;

//Копировать все
public interface Dao <Entity,Integer> { //Название поменять чтобы не было ошибок
    Entity findById (Integer id);
    List<Entity> findAll();
    void save(Entity entity);
    void update(Entity entity);
    void delete(Entity entity);
}
