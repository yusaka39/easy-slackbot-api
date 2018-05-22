package com.github.yusaka39.slackbot.api.handler

import com.github.yusaka39.slackbot.api.entity.Action
import com.github.yusaka39.slackbot.api.entity.Message

interface Handler {
    fun createActionProvider(message: Message): () -> Action
    fun isMatchedTo(message: Message, isReplyMessage: Boolean): Boolean
}