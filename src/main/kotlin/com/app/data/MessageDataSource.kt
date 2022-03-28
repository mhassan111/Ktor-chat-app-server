package com.app.data

import com.app.data.model.Message

interface MessageDataSource {
    suspend fun getAllMessages(): List<Message>
    suspend fun insertMessage(message: Message)
}