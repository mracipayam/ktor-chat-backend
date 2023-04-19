package com.mracipayam.plugins

import com.mracipayam.room.RoomController
import com.mracipayam.routes.chatSocket
import com.mracipayam.routes.getAllMessages
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    val roomController by inject<RoomController>()
    install(Routing){
        chatSocket(roomController)
        getAllMessages(roomController)
    }
}
