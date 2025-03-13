package com.sparen.income.domain.models;

public class Users {
    private Integer idUser;
    private String userName;
    private String password;
    private People person;
    public Users() {
    }

    public Users(Integer idUser,String userName, String password) {
        this.idUser=idUser;
        this.userName = userName;
        this.password = password;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public People getPerson() {
        return person;
    }

    public void setPerson(People person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Users{" +
                "idUser=" + idUser +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
