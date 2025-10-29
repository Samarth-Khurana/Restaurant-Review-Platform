package com.samarth.restaurant.domain.entities

import org.springframework.data.elasticsearch.annotations.DateFormat
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType
import java.time.LocalDateTime

data class Photo(
    @Field(type = FieldType.Keyword)
    val url: String,

    @Field(type = FieldType.Date, format = [DateFormat.date_hour_minute_second])
    val uploadDate: LocalDateTime,
)
