package ir.dorantech

import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import ir.dorantech.routes.configureHelloRoutes
import ir.dorantech.routes.configureUserRoutes


fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

@Suppress("UNUSED")
fun Application.module() {
    install(ContentNegotiation) {
        json()
    }
    configureUserRoutes()
    configureHelloRoutes()
}
