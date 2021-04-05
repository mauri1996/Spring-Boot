package com.dmcm.demo.models;

import javax.persistence.*;

@Entity
@Table(name="usuario")

public class UsuarioModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;
    private String name;
    private String email;
    private Integer prioridad;

    public String getEmail() {
        return email;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Integer getPrioridad() {
        return prioridad;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

}