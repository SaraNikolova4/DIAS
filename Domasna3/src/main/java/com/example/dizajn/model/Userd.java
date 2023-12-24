package com.example.dizajn.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Userd")
@Data
@NoArgsConstructor
public class Userd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String location;
    @ManyToMany
    private List<Vina> oceneti;
    private Integer poeni;

    public Userd(String name, String  surname,String email, String password, String location) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.location = location;
        this.surname = surname;

    }
    public Userd(String name, String surname, String email, String password, String location, List<Vina> oceneti) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.location = location;
        this.oceneti = oceneti;
    }
}
