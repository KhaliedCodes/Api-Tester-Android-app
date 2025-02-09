package com.instabug.android_challenge.model

data class Response(
    val url: String,
    val responseBody: String?,
    val requestBody: String?,
    val errorBody: String?,
    val code: Int,
    val responseHeaders: Map<String, List<String>>?,
    val requestHeaders: Map<String, List<String>>?,
    val executionTime : Long
)
