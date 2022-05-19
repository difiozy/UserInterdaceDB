package com.example.userinterface.models;

import lombok.Data;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
public class CompanyAirportId implements Serializable {
    private static final long serialVersionUID = -6859890147669117367L;
    @Column(name = "companyId", nullable = false)
    private Integer companyId;
    @Column(name = "airportId", nullable = false)
    private Integer airportId;

    @Override
    public int hashCode() {
        return Objects.hash(companyId, airportId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CompanyAirportId entity = (CompanyAirportId) o;
        return Objects.equals(this.companyId, entity.companyId) &&
                Objects.equals(this.airportId, entity.airportId);
    }
}