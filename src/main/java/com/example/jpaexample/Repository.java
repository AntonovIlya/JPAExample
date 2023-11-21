package com.example.jpaexample;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public String getPersons(String city) {
        //entityManager.persist(new Person("Oleg", "Fedorov", 36, "89652793456", "Moscow"));
        var query = entityManager.createQuery("select p from Person p where p.cityOfLiving =:cityOfLiving")
                .setParameter("cityOfLiving", city);
        List<Person> personList = query.getResultList();
        personList.forEach(System.out::println);
        return null;
    }
}
