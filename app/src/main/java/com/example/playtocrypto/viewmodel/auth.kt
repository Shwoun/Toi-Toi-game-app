package com.example.playtocrypto.viewmodel

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.playtocrypto.navigat.Screen
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.database
import com.google.firebase.firestore.auth.User
import com.google.firebase.firestore.firestore

class Auth : ViewModel() {

    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
    private val firestore = Firebase.firestore
val database = Firebase.database
    val current = auth.currentUser




    fun login(email: String, password: String, navController: NavController) {

        auth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                navController.navigate(Screen.Home.route) {
                    popUpTo(Screen.Login.route) {
                        inclusive = true
                    }

                }

            } else {

            }
        }


    }

    fun singUp(email: String, password: String, name: String, navController: NavController) {
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                val userdata = User(
                    name = name, email = email

                )
               database.getReference("Users").child(auth.currentUser!!.uid).setValue(userdata)
                    .addOnSuccessListener {
                        navController.navigate(Screen.Home.route) {
                            popUpTo(Screen.SignUp.route) {
                                inclusive = true
                            }

                        }

                    }
                    .addOnFailureListener {
                        navController.navigate(Screen.Login.route) {
                            popUpTo(Screen.Login.route) {
                                inclusive = true
                            }

                        }
                    }


            } else {

            }
        }

    }

}


data class User(
    val email: String = "",
    val name: String = ""
)