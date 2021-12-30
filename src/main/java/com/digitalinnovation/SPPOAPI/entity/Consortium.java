package com.digitalinnovation.SPPOAPI.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

/**
 * @author Fellipe Toledo
 * @created 30/12/2021
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Consortium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private List<Company> companies;

}
