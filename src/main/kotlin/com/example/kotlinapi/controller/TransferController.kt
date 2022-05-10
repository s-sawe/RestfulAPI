package com.example.kotlinapi.controller

import com.example.kotlinapi.model.OverviewTransactionModel
import com.example.kotlinapi.model.TransactionModel
import com.example.kotlinapi.model.convertToDBModel
import com.example.kotlinapi.model.convertToOverviewTransactionModel
import com.example.kotlinapi.repository.TransferRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/transfer")
class TransferController(val repository: TransferRepository){

    @PostMapping("/new")
    fun newTransfer(@RequestBody transactionModel: TransactionModel){
        repository.save(transactionModel.convertToDBModel())

    }
    @GetMapping("/all")
    fun getAllTransfers(): List<OverviewTransactionModel> {
        return repository.findAll().map{ it.convertToOverviewTransactionModel()}
    }
}