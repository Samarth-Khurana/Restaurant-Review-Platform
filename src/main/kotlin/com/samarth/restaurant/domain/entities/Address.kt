package com.samarth.restaurant.domain.entities

import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType

data class Address(
    @Field(name = "street-number", type = FieldType.Keyword)
    val streetNumber: String,

    @Field(name = "street-name", type = FieldType.Text)
    val streetName: String,

    @Field(name = "unit", type = FieldType.Keyword)
    val unit: String,

    @Field(name = "city", type = FieldType.Keyword)
    val city: String,

    @Field(name = "state", type = FieldType.Keyword)
    val state: String,

    @Field(name = "postal-code", type = FieldType.Keyword)
    val postalCode: String,

    @Field(name = "country", type = FieldType.Keyword)
    val country: String,

)
