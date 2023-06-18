package org.example.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;


@Table(name = "planet")
@Entity
@Data
@ToString(exclude = {"tickets_from","tickets_to"})
public class Planet {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy="from_planet_id")
    private List<Ticket> tickets_from;

    @OneToMany(mappedBy="to_planet_id")
    private List<Ticket> tickets_to;
}
