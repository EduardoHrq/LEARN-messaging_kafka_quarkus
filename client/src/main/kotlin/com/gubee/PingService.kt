package com.gubee

import io.smallrye.reactive.messaging.kafka.Record
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import org.eclipse.microprofile.reactive.messaging.Incoming
import java.util.logging.Logger

@ApplicationScoped
class PingService {

    @Incoming("ping")
    fun getPing(record: Record<String, String>) {
//        this.logger.info("ping -> k=${record.key()} v=${record.value()}" )
        println("ping -> k=${record.key()} v=${record.value()}" )
    }
}