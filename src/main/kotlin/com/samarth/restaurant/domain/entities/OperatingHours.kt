package com.samarth.restaurant.domain.entities

import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType

data class OperatingHours(
    @Field(type = FieldType.Nested)
    val monday: TimeRange,

    @Field(type = FieldType.Nested)
    val tuesday: TimeRange,

    @Field(type = FieldType.Nested)
    val wednesday: TimeRange,

    @Field(type = FieldType.Nested)
    val thursday: TimeRange,

    @Field(type = FieldType.Nested)
    val friday: TimeRange,

    @Field(type = FieldType.Nested)
    val saturday: TimeRange,

    @Field(type = FieldType.Nested)
    val sunday: TimeRange,
)
