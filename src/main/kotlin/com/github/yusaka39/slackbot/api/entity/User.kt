package com.github.yusaka39.slackbot.api.entity

interface User {
    val id: String
    val userName: String
    val realName: String
    val replyString: String
        get() = "<@${this.id}>"
}