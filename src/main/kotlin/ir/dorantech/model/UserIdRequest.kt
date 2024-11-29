package ir.dorantech.model

import kotlinx.serialization.Serializable

@Serializable
data class UserIdRequest(
    val id: Int
)