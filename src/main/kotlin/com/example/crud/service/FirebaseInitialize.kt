package com.example.crud.service

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import org.springframework.stereotype.Service
import java.io.FileInputStream
import javax.annotation.PostConstruct


@Service
class FirebaseInitialize {
    @PostConstruct
    fun initialize() {
        try {
            val serviceAccount = FileInputStream("./crud-1fd36-firebase-adminsdk-n44ma-e850a2d15e.json")
            val options = FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://crud-1fd36.firebaseio.com")
                    .build()
            FirebaseApp.initializeApp(options)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}