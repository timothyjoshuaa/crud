package com.example.crud.objects

import org.springframework.stereotype.Component

@Component
class Person {
    var name: String? = null
    var age: String? = null
    var location: String? = null

    constructor() : super() {}
    constructor(name: String?, age: String?, location: String?) {
        this.name = name
        this.age = age
        this.location = location
    }
}