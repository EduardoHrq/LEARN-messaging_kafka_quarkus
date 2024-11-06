package com.gubee

import jakarta.enterprise.context.ApplicationScoped
import org.eclipse.microprofile.reactive.messaging.Incoming

@ApplicationScoped
class TesteService {

    @Incoming("teste")
    fun teste(teste: String) {
        println(teste)
    }
}