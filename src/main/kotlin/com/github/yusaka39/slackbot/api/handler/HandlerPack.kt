package com.github.yusaka39.slackbot.api.handler

import com.github.yusaka39.slackbot.api.entity.Message

abstract class HandlerPack {
    private var _receivedMessage: Message? = null

    fun setReceivedMessage(message: Message?) {
        this._receivedMessage?.let {
            throw IllegalStateException("Received message is already set")
        }
        this._receivedMessage = message
    }

    protected val receivedMessage: Message
        get() = this._receivedMessage ?: throw IllegalStateException("Backing property is null")
}