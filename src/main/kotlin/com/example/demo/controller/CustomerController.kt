package com.example.demo.controller

import com.example.demo.entity.Customer
import com.example.demo.session.CustomerSession
import org.springframework.web.bind.annotation.*


/**
 * Created by Gustavo on 6/22/2017.
 */
@RestController
@RequestMapping("/customer")
class CustomerController(val session: CustomerSession) {

    @GetMapping("/")
    fun findAll() = session.findAll()

    @RequestMapping("/add")
    fun add (@RequestBody customer : Customer) = session.add(customer)

    @GetMapping("/{lastName}")
    fun findByLastName(@PathVariable lastName: String) = session.findByLastName(lastName)
}