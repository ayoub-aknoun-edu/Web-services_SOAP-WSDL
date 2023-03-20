package org.miaad.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement(name="compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code ;
    private double sold ;
    @XmlTransient
    private Date dateCreation;

    public Compte() {
    }

    public Compte(int code, double sold, Date dateCreation) {
        this.code = code;
        this.sold = sold;
        this.dateCreation = dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }


    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", sold=" + sold +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
