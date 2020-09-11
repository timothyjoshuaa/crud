package com.example.crud.controller

import com.example.crud.objects.Person
import com.example.crud.objects.Store
import com.example.crud.service.FirebaseService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.concurrent.ExecutionException

@RestController
class RestDemoController {
    @Autowired
    var firebaseService: FirebaseService? = null

    @PostMapping("/createUser")
    @Throws(InterruptedException::class, ExecutionException::class)
    fun postExample(@RequestBody person: Person?): String {
        return firebaseService!!.saveuserDetails(person)
    }
    @PostMapping("/createStore")
    @Throws(InterruptedException::class, ExecutionException::class)
    fun postExample(@RequestBody store: Store?): String {
        return firebaseService!!.savestoreDetails(store)
    }

    @PutMapping("/updateUser")
    @Throws(InterruptedException::class, ExecutionException::class)
    fun putExample(@RequestBody person: Person): String {
        return "Updated User" + person
    }

    @DeleteMapping("/deleteUser")
    fun deleteExample(@RequestHeader name: String): String {
        return "Deleted User $name"
    }
}