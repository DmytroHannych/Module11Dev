package org.example.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;


@Table(name = "client")
@Entity
@Data
@ToString(exclude = "tickets")
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
