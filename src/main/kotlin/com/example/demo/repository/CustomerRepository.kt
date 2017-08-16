package com.example.demo.repository

import com.example.demo.entity.Customer
import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by Gustavo on 6/22/2017.
 */

interface CustomerRepository : MongoRepository<Customer, String> {

    fun findByLastName(lastName: String):Customer


}