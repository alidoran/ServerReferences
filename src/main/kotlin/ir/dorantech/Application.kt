package ir.dorantech

import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

@Suppress("UNUSED")
fun Application.module() {
    configureRouting()
}
