package com.DAO;

import com.entity.Region;
import com.Utility.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class RegionDAO {

    public void addRegion(Region region) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(region);
        et.commit();
        em.close();
    }

    public Region getRegion(int id) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        Region region = em.find(Region.class, id);
        em.close();
        return region;
    }

    public void updateRegionName(int id, String newName) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Region region = em.find(Region.class, id);
        region.setRegion_name(newName);
        et.commit();
        em.close();
    }

    public void deleteRegion(int id) {
        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        Region region = em.find(Region.class, id);
        if (region != null) em.remove(region);
        et.commit();
        em.close();
    }
}
