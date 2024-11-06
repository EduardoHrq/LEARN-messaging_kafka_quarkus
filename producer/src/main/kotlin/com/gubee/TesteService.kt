package com.gubee

import io.smallrye.mutiny.Multi
import jakarta.enterprise.context.ApplicationScoped
import org.eclipse.microprofile.reactive.messaging.Outgoing
import java.time.Duration

@ApplicationScoped
class TesteService {

    @Outgoing("teste")
    fun teste(): Multi<String> {
        return Multi.createFrom().ticks().every(Duration.ofSeconds(5)).map { "teste" }
    }
}