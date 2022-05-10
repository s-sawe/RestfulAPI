package com.example.kotlinapi.repository

import com.example.kotlinapi.model.OverviewTransactionModel
import com.example.kotlinapi.model.TransactionModel
import com.example.kotlinapi.repository.model.TransactionDBModel
import org.springframework.data.repository.CrudRepository
import java.util.*

interface TransferRepository: CrudRepository<TransactionDBModel, UUID> {

}