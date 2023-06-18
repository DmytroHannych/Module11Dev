package org.example.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Table(name = "client")
@Entity
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy="client")
    private List<Ticket> tickets;
}
