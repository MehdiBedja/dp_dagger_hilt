package com.example.learning.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}