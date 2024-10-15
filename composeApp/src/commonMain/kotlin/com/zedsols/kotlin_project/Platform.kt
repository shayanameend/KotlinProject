package com.zedsols.kotlin_project


interface Platform {
    val name: String
}

expect fun getPlatform(): Platform