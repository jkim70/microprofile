package com.jihwan.microservice.tomee.jpadb.service;

import com.jihwan.microservice.tomee.jpadb.model.User;
import jakarta.ejb.Stateful;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateful
public class UserService {

  @PersistenceContext(name="jta-unit")
  private EntityManager em;
  public String getUserById(Long id) {
    User usr = em.find(User.class, id);
    if(usr == null) {
      return "null";
    }else {
      return usr.toString();
    }
  }
}
