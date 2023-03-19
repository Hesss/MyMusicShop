package com.example.accessingdatamysql.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sales {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_sales;

    private Integer id_client;
    private Integer id_seller;
    private Integer id_musical_instrument;
    private String datesales;

    public Sales() {
    }

    public Sales(Integer id_client, Integer id_seller, Integer id_musical_instrument, String datesales) {
        this.id_client = id_client;
        this.id_seller = id_seller;
        this.id_musical_instrument = id_musical_instrument;
        this.datesales = datesales;
    }

    public Integer getId_sales() {
        return id_sales;
    }

    public Integer getId_client() {
        return id_client;
    }

    public Integer getId_seller() {
        return id_seller;
    }

    public Integer getId_musical_instrument() {
        return id_musical_instrument;
    }

    public String getDatesales() {
        return datesales;
    }

    public void setId_sales(Integer id_sales) {
        this.id_sales = id_sales;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }

    public void setId_seller(Integer id_seller) {
        this.id_seller = id_seller;
    }

    public void setId_musical_instrument(Integer id_musical_instrument) {
        this.id_musical_instrument = id_musical_instrument;
    }

    public void setDatesales(String datesales) {
        this.datesales = datesales;
    }
}
