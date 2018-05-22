package com.github.yusaka39.slackbot.api.decorator

import com.github.yusaka39.slackbot.api.entity.Action

interface ActionProviderDecorator {
    fun decorate(provider: () -> Action): () -> Action

    infix fun compose(decorator: ActionProviderDecorator): ActionProviderDecorator {
        return object : ActionProviderDecorator {
            override fun decorate(provider: () -> Action): () -> Action =
                    this.decorate(decorator.decorate(provider))
        }
    }
}