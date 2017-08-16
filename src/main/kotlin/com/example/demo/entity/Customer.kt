package com.example.demo.entity
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.PersistenceConstructor


class Customer @PersistenceConstructor constructor(
        val firstName: String?,
        val lastName: String?,
        @Id
        val id: String?) {


    override fun toString(): String {
        return "Customer(id=$id, firstName='$firstName', lastName='$lastName')"
    }
}