package com.github.yusaka39.slackbot.api.handler

import com.github.yusaka39.slackbot.api.entity.Action
import kotlin.reflect.KCallable
import kotlin.reflect.KClass

interface HandlerProvider {
    fun createHandlerOrNull(
            annotations: List<Annotation>, kClass: KClass<*>, callable: KCallable<Action>
    ): Handler?
}