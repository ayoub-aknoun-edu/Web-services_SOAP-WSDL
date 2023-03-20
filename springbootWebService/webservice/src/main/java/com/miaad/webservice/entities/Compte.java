package com.miaad.webservice.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;


@Entity
@NoArgsConstructor @AllArgsConstructor
@Getter
@Setter
@ToString
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id ;

    private double solde ;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Compte compte = (Compte) o;
        return getId() != null && Objects.equals(getId(), compte.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

