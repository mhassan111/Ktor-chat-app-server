package com.app.plugins

import com.app.room.RoomController
import com.app.routes.chatSocket
import com.app.routes.getAllMessages
import io.ktor.routing.*
import io.ktor.application.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing) {
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
