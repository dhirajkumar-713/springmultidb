package com.aumultidb.springmultidb.dbtwo.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tabletwodbtwo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TableTwoDBTwo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String description;
}
