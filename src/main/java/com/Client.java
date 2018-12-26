package com;

import java.util.Objects;

public class Client {
  private String firstName;
  private String lastName;
  private String passport;

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPassport() {
    return this.passport;
  }

  public void setPassport(String passport) {
    this.passport = passport;
  }

  public Client(String firstName, String lastName, String passport) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.passport = passport;
  }

  public static class Builder {
    private String firstName;
    private String lastName;
    private String passport;

    public Builder(String firstName, String lastName) {
      this.firstName = Objects.requireNonNull(firstName);
      this.lastName = Objects.requireNonNull(lastName);
    }

    public Builder setPassport(String passport) {
      this.passport = passport;
      return this;
    }

    public Client build() {
      return new Client(firstName, lastName, passport);
    }
  }

  // @formatter:off
  @Override
  public String toString() {
    return "{" +
      " firstName='" + firstName + "'" +
      ", lastName='" + lastName + "'" +
      ", passport='" + passport + "'" +
      "}";
  }
}
