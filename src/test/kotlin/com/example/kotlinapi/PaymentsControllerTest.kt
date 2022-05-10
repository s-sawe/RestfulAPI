package com.example.kotlinapi

import com.example.kotlinapi.model.TransactionModel
import com.example.kotlinapi.repository.TransferRepository
import com.example.kotlinapi.repository.model.TransactionDBModel
import com.fasterxml.jackson.databind.ObjectMapper
import io.mockk.every
import io.mockk.mockk
import org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.any
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.http.RequestEntity.get
import org.springframework.http.RequestEntity.post
import org.springframework.http.ResponseEntity.status
import org.springframework.test.web.client.match.MockRestRequestMatchers.content
import org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath
import org.springframework.test.web.servlet.MockMvc
import java.util.*

@WebMvcTest
class PaymentsControllerTest(@Autowired val mockMvc: MockMvc) {
   /* @MockBean
    private lateinit var paymentsRepository: TransferRepository

    @Test
    fun `should submit transaction with success`(){
        val transfer = TransactionModel(
            value = 1456.0,
            description = "christmass gifts",
            targetAccount = "124567889"
        )
        every { paymentsRepository.save(any()) } returns mockk()

        mockMvc.perform(post("/transfer/new")
            .content(ObjectMapper().writeValueAsString(transfer))
            .contentType(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON))
            .andDo(print())
            .andExpect(status().isOk)
    }

    @Test
    fun `should get transaction with success`(){
        val mockTransaction = mockk<TransactionDBModel>().apply{
            every {value} returns 1456.0
            every { description } returns "christmass gifts"
            every { accountIdentifier } returns "124567889"
            every { date } returns Date()
            every { id } returns UUID.randomUUID()
        }

        every { paymentsRepository.findAll() } returns listOf(mockTransaction)

        mockMvc.perform(get("/transfer/all").accept(MediaType.APPLICATION_JSON))
            .andDo(print())
            .andExpect(status().isOk)
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("\$.[0].description").value("christmass gifts"))
    }
    @Test
    fun `should return a bad request error if the request there is no body`(){
        mockMvc.perform(post("/transfer/new")
            .contentType(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON))
            .andDo(print())
            .andExpect(status().is4xxClientError)
    }
*/
}