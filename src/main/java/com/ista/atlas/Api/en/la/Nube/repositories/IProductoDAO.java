/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ista.atlas.Api.en.la.Nube.repositories;

import com.ista.atlas.Api.en.la.Nube.models.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author matei
 */
@Repository
public interface IProductoDAO extends MongoRepository<Producto, String>{
    
}
