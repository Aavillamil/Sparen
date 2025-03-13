package com.sparen.income.domain.models;

public class People {
    private Integer idPerson;
    private String firtsName;
    private String lastName;
    private String email;
    private String phone;

    public People() {
    }

    public People(Integer idPerson, String firtsName, String lastName, String email, String phone) {
        this.idPerson = idPerson;
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "People{" +
                "idPerson=" + idPerson +
                ", firtsName='" + firtsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
