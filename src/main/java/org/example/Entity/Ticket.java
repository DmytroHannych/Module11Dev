package org.example.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Table(name = "ticket")
@Entity
@Data
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "created_at")
    private Date created_at;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name = "from_planet_id", nullable = false)
    private Planet from_planet_id;

    @ManyToOne
    @JoinColumn(name = "to_planet_id", nullable = false)
    private Planet to_planet_id;

}
