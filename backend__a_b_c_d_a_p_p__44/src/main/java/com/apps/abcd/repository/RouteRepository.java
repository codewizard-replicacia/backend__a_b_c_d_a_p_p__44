package com.apps.abcd.repository;


import com.apps.abcd.model.Route;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class RouteRepository extends SimpleJpaRepository<Route, String> {
    private final EntityManager em;
    public RouteRepository(EntityManager em) {
        super(Route.class, em);
        this.em = em;
    }
    @Override
    public List<Route> findAll() {
        return em.createNativeQuery("Select * from \"abcdv1\".\"Route\"", Route.class).getResultList();
    }
}