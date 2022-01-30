package com.example.junitloginpage

object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    /**
     * ..the username/password is empty
     * ..the username is already taken
     * ..the confirmed password is not the same as the original
     * .. the password contains less than 2 digit
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword:String
    ): Boolean{
        if (username.isEmpty() || password.isEmpty()){
            return false
        }

        if (username in existingUsers){
            return false
        }
        if (confirmedPassword != password){
            return false
        }
        if (password.count { it.isDigit() } <2){
            return false
        }
        return true
    }
}