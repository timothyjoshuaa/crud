package com.example.crud.service

import com.example.crud.objects.Store
import com.example.crud.objects.Person
import com.google.firebase.cloud.FirestoreClient
import org.springframework.stereotype.Service
import java.util.concurrent.ExecutionException

@Service
class FirebaseService {
    @Throws(InterruptedException::class, ExecutionException::class)
    fun saveuserDetails(person: Person?): String {
        val dbFirestore = FirestoreClient.getFirestore()
        val collectionsApiFuture = dbFirestore.collection("Profile").document(person!!.name.toString()).set(person)
        return collectionsApiFuture.get().updateTime.toString()
    }

    fun savestoreDetails(store: Store?): String {
        val dbFirestore = FirestoreClient.getFirestore()
        val collectionsApiFuture = dbFirestore.collection("Profile/Timothy Joshua S. Hernandez/Store").document(store!!.name.toString()).set(store)
        return collectionsApiFuture.get().updateTime.toString()
    }

}



