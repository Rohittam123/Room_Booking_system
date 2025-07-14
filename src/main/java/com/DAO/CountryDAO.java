package com.DAO;

import com.entity.Country;
import com.Utility.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CountryDAO {

    public void insertCountry(Country country) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(country);
        et.commit();
        em.close();
    }

    public Country getCountry(String id) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        Country country = em.find(Country.class, id);
        em.close();
        return country;
    }

    public void changeCountryName(String id, String newName) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Country country = em.find(Country.class, id);
        country.setCountry_name(newName);
        et.commit();
        em.close();
    }

    public void deleteCountry(String id) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Country country = em.find(Country.class, id);
        if (country != null) em.remove(country);
        et.commit();
        em.close();
    }
}
