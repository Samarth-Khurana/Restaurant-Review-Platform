package com.samarth.restaurant.domain.entities

import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType

data class TimeRange(
    @Field(name = "open-time", type = FieldType.Keyword)
    val openTime: String,

    @Field(name = "closed-time", type = FieldType.Keyword)
    val closedTime: String,
)
