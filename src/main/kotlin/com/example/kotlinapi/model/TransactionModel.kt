package com.example.kotlinapi.model

import com.example.kotlinapi.repository.model.TransactionDBModel

class TransactionModel (

    val targetAccount: String,
    val value: Double,
    val description: String = ""
)
fun TransactionModel.convertToDBModel() = TransactionDBModel(
    accountIdentifier = this.targetAccount,
    value = this.value,
    description = this.description
)


