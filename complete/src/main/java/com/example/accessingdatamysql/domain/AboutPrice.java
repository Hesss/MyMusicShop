package com.example.accessingdatamysql.domain;

import javax.persistence.*;

@Entity
@Table(schema="public", name = "aboutprice")
public class AboutPrice {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_seller;
    private String instrument;
    private Integer price;

    public AboutPrice() {
    }

    public AboutPrice(Integer id_seller, String instrument, Integer price) {
        this.id_seller = id_seller;
        this.instrument = instrument;
        this.price = price;
    }

    public Integer getId_seller() {
        return id_seller;
    }

    public String getInstrument() {
        return instrument;
    }

    public Integer getPrice() {
        return price;
    }

    public void setId_seller(Integer id_seller) {
        this.id_seller = id_seller;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
