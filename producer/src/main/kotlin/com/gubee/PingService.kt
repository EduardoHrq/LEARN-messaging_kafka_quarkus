package com.gubee

import io.smallrye.reactive.messaging.kafka.Record
import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import org.eclipse.microprofile.reactive.messaging.Channel
import org.eclipse.microprofile.reactive.messaging.Emitter
import org.eclipse.microprofile.reactive.messaging.Outgoing
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

@ApplicationScoped
class PingService @Inject constructor (
    @Channel("ping") // o nome do topico tambem será 'ping'
//    record é o evento que possui header, key, value e timestamp, mas aqui só é configuravel key e value
    val emitter: Emitter<Record<String, String>>
) {

    fun ping() {
        this.emitter.send(Record.of("pingKey", "pong"))
    }

}