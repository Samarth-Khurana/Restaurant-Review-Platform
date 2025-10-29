package com.samarth.restaurant.domain.entities

import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType

data class UserEntity(
    @Field(name = "id", type = FieldType.Keyword)
    val id: String,

    @Field(type = FieldType.Text, name = "username")
    val username: String,

    @Field(type = FieldType.Text, name = "given-name")
    val givenName: String,

    @Field(type = FieldType.Text, name = "family-name")
    val familyName: String,

    )
