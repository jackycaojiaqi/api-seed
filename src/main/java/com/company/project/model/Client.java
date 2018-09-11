package com.company.project.model;

import lombok.Data;

import javax.persistence.*;

@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_country")
    private String clientCountry;

    @Column(name = "client_city")
    private String clientCity;

    @Column(name = "client_intention")
    private String clientIntention;

    @Column(name = "client_intention_machine")
    private String clientIntentionMachine;

    @Column(name = "close_time")
    private String closeTime;

    @Column(name = "is_del")
    private Integer isDel;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return client_name
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * @return client_country
     */
    public String getClientCountry() {
        return clientCountry;
    }

    /**
     * @param clientCountry
     */
    public void setClientCountry(String clientCountry) {
        this.clientCountry = clientCountry;
    }

    /**
     * @return client_city
     */
    public String getClientCity() {
        return clientCity;
    }

    /**
     * @param clientCity
     */
    public void setClientCity(String clientCity) {
        this.clientCity = clientCity;
    }

    /**
     * @return client_intention
     */
    public String getClientIntention() {
        return clientIntention;
    }

    /**
     * @param clientIntention
     */
    public void setClientIntention(String clientIntention) {
        this.clientIntention = clientIntention;
    }

    /**
     * @return client_intention_machine
     */
    public String getClientIntentionMachine() {
        return clientIntentionMachine;
    }

    /**
     * @param clientIntentionMachine
     */
    public void setClientIntentionMachine(String clientIntentionMachine) {
        this.clientIntentionMachine = clientIntentionMachine;
    }

    /**
     * @return close_time
     */
    public String getCloseTime() {
        return closeTime;
    }

    /**
     * @param closeTime
     */
    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * @return is_del
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * @param isDel
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }
}