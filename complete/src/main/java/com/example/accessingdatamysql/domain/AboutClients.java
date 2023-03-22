package com.example.accessingdatamysql.domain;


import javax.persistence.*;

@Entity
@Table(schema="public", name = "aboutclients")
public class AboutClients {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String surname;
    private String name;
    private String patronymic;
    private String instrument;
    private Integer price;

    public AboutClients() {
    }

    public AboutClients(String surname, String name, String patronymic, String instrument, Integer price) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.instrument = instrument;
        this.price = price;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getInstrument() {
        return instrument;
    }

    public Integer getPrice() {
        return price;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
