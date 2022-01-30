package com.example.junitloginpage

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Pjillip",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exits returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `confirmed password is different of original password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Pjillip",
            "123",
            "1234"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than two digits returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Pjillip",
            "abcedef",
            "abcedef"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password is empty returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Pjillip",
            "",
            ""
        )
        assertThat(result).isFalse()
    }





}