package com.codexmaker.model;

public class Client {
    int id;
    String name;
    String email;
    String phone;

    /** Constructeurs de la classe Client */
    public Client(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Client() {

    }

    /** Getters de la classe Client */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    /** Setters de la classe Client */
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Redefinition de la methode toString pour afficher les informations d'un
     * client
     */
    @Override
    public String toString() {
        return "Client{id=" + id + ", name='" + name + "', email='" + email + "', phone='" + phone + "'}";
    }
}
