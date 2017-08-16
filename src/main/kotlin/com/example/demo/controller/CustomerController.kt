package com.example.demo.controller

import com.example.demo.entity.Customer
import com.example.demo.repository.CustomerRepository
import org.springframework.web.bind.annotation.*


/**
 * Created by Gustavo on 6/22/2017.
 */
@RestController
@RequestMapping("/customer")
class CustomerController(val repository: CustomerRepository) {

    @GetMapping("/")
    fun findAll() = repository.findAll()

    @RequestMapping("/add")
    fun add (@RequestBody customer : Customer) = repository.save(customer)

    @GetMapping("/{lastName}")
    fun findByLastName(@PathVariable lastName: String) = repository.findByLastName(lastName)
}