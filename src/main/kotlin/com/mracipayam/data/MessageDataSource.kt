package com.mracipayam.data

import com.mracipayam.data.model.Message

interface MessageDataSource {
    suspend fun getAllMessages(): List<Message>
    suspend fun insertMessage(message: Message)
}