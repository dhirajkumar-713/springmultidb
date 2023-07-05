package com.aumultidb.springmultidb.dbone.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tableonedbone")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TableOneForDbOne {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
    private boolean live;


}
