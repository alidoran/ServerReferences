package ir.dorantech.routes

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*
import io.ktor.server.request.receive
import io.ktor.server.response.*
import io.ktor.server.routing.*
import ir.dorantech.model.UserIdRequest
import ir.dorantech.service.UserService

fun Application.configureUserRoutes() {
    val userService = UserService()

    routing {
        post("/user") {
            try {
                val request = call.receive<UserIdRequest>()
                println("Received request: $request")
                val user = userService.getUserById(request.id)
                if (user != null) {
                    call.respond(user)
                } else {
                    call.respondText("User not found", status = HttpStatusCode.NotFound)
                }
            } catch (e: Exception) {
                call.respond(HttpStatusCode.BadRequest, "Invalid request body")
            }
        }
        post("/all-user") {
            try {
                val userList = userService.getAllUsers()
                if (userList.isNotEmpty()) {
                    call.respond(userList)
                } else {
                    call.respondText("User not found", status = HttpStatusCode.NotFound)
                }
            } catch (e: Exception) {
                call.respond(HttpStatusCode.BadRequest, "Invalid request body")
            }
        }
    }
}