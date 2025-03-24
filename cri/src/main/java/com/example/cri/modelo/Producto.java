/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cri.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author christianrieigl
 */

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Producto {
    @Id @GeneratedValue
    private Integer id;
    
    private String nombre;
    private float precio;
}
