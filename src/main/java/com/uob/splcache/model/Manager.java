package com.uob.splcache.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MANAGER_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manager implements Serializable {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private String name;
    private String contactNo;

}
