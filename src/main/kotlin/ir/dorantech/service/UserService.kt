package ir.dorantech.service

import ir.dorantech.model.UserDto

class UserService {
    private val users = listOf(
        UserDto(id = 1, name = "Ali", email = "alidoran@gmail.com"),
        UserDto(id = 2, name = "Roya", email = "r.darvishi63@gmail.com")
    )

    fun getUserById(id: Int): UserDto? {
        return users.find { it.id == id }
    }
}