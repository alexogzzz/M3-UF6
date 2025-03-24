/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.example.aog.servicio;

import com.example.aog.modelo.Producto;
import com.example.aog.repositorio.ProductoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author alexormgom
 */
@Service
public class ProductoServicio {
    @Autowired
    private ProductoRepositorio repositorio;
    
    public List<Producto>listarProductos(){
        return repositorio.findAll();
    }
    
    public Producto guardarProducto(Producto producto) {
        return repositorio.save(producto);
    }
    
    public Producto obtenerProductoPorId(Integer id){
        return repositorio.findById(id).get();
    }
    
    public void eliminarProducto (Integer id){
        repositorio.deleteById(id);
    }
}
