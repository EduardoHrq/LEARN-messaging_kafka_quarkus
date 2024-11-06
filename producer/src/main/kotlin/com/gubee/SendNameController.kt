package com.gubee

import io.smallrye.reactive.messaging.kafka.Record
import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import org.eclipse.microprofile.reactive.messaging.Channel
import org.eclipse.microprofile.reactive.messaging.Emitter

@Path("/name")
class SendNameController @Inject constructor(
    @Channel("username") // no config é definido que o topico deste canal é 'nomeDeUsuario'
    val emitter: Emitter<Record<String, String>>
){

    @GET
    @Path("/{name}")
    fun sendName(name: String): String {
        this.emitter.send(Record.of("username", name))
        return name
    }
}