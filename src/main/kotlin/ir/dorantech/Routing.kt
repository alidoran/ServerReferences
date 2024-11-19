package ir.dorantech

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("I'm alive")
        }
        get("/hello") {
            call.respondText("Hello World!")
        }
        get("/ktor") {
            call.respondText("Hello ktor!")
        }
    }
}