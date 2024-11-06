package com.gubee

import io.smallrye.reactive.messaging.kafka.Record
import jakarta.enterprise.context.ApplicationScoped
import org.eclipse.microprofile.reactive.messaging.Incoming

@ApplicationScoped
class UsernameService {

    @Incoming("nomeDeUsuario") // usando nome do topico, pois não ha config para direcionar o canal username para o topico nomeDeUsuario
    fun getUsername(record: Record<String, String>) {
        println("new username -> ${record.value()}" )
    }
}