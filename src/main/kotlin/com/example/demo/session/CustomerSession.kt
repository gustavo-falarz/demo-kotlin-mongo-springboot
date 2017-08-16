package com.example.demo.session

import com.example.demo.entity.Customer
import com.example.demo.repository.CustomerRepository
import org.springframework.stereotype.Component

/**
 * Created by Gustavo on 8/16/2017.
 */
@Component
class CustomerSession(val repository: CustomerRepository) {

    fun findAll() = repository.findAll()

    fun add(customer: Customer): Customer {
            val existing = repository.findByLastName(customer.lastName!!)
        if (existing != null){
            return repository.save(customer)
        }
            return existing
    }

    fun findByLastName(lastName: String) = repository.findByLastName(lastName)

}