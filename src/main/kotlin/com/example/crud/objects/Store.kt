

package com.example.crud.objects

import org.springframework.stereotype.Component

@Component
class Store {
    var name: String? = null


    constructor() : super() {}
    constructor(name: String?) {
        this.name = name
    }
}