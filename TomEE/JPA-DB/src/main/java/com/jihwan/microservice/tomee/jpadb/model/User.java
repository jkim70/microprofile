package com.jihwan.microservice.tomee.jpadb.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="git_user")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
  @SequenceGenerator(name = "user_id_seq", sequenceName = "GIT_USER_ID_SEQ", allocationSize = 1)
  @Column(name="id")
  private Long id;

  @Column(name="first_name")
  @Size(max=32)
  private String firstName;
  @Column(name="middle_name")
  @Size(max=16)
  private String middleName;
  @Column(name="last_name")
  @Size(max=32)
  private String lastName;
  @Column(name="user_id", unique = true)
  @Size(max=16)
  private String userId;

  @Column(name="email")
  @Size(max=50)
  private String email;
  @Column(name="address")
  private String address;

  @Column(name="created_on")
  private Timestamp createdOn;
  @Column(name="last_login")
  private Timestamp lastLogin;


  public User() {
  }
  public User(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Timestamp getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Timestamp createdOn) {
    this.createdOn = createdOn;
  }

  public Timestamp getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(Timestamp lastLogin) {
    this.lastLogin = lastLogin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(id, user.id) && Objects.equals(firstName, user.firstName) && Objects.equals(middleName, user.middleName) && Objects.equals(lastName, user.lastName) && Objects.equals(userId, user.userId) && Objects.equals(email, user.email) && Objects.equals(address, user.address) && Objects.equals(createdOn, user.createdOn) && Objects.equals(lastLogin, user.lastLogin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, middleName, lastName, userId, email, address, createdOn, lastLogin);
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", firstName='" + firstName + '\'' +
        ", middleName='" + middleName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", userId='" + userId + '\'' +
        ", email='" + email + '\'' +
        ", address='" + address + '\'' +
        ", createdOn=" + createdOn +
        ", lastLogin=" + lastLogin +
        '}';
  }
}
