package com.gubee

import jakarta.inject.Inject
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/ping")
@Produces(MediaType.TEXT_PLAIN)
class PingController @Inject constructor (val pingService: PingService) {

    @GET
    fun ping(): String {
        this.pingService.ping()
        return "pong"
    }
}