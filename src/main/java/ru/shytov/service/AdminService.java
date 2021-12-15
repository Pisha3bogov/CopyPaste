package ru.shytov.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.shytov.dao.Dao;
import ru.shytov.model.Admin;

import java.util.List;

public class AdminService implements Dao<Admin,Integer> { //За место Admin нужно подставить свою модель, если несколько моделей то и для каждой нужен свой сервис
    //Все остальное копируется с заменой Admin на свою модель
    private final SessionFactory factory;

    public AdminService(SessionFactory factory) {
        this.factory = factory;
    }


    @Override
    public Admin findById(Integer id) {
        try(Session session = factory.openSession()) {
            return session.get(Admin.class,id);
        }
    }

    @Override
    public List<Admin> findAll() {
        try(Session session = factory.openSession()) {
            return session.createQuery("from Admin",Admin.class).list();
        }
    }

    @Override
    public void save(Admin admin) {
        try(Session session = factory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.save(admin);
            transaction.commit();
        }
    }

    @Override
    public void update(Admin admin) {
        try(Session session = factory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.update(admin);
            transaction.commit();
        }
    }

    @Override
    public void delete(Admin admin) {
        try(Session session = factory.openSession()) {
            final Transaction transaction = session.beginTransaction();
            session.delete(admin);
            transaction.commit();
        }
    }
}
