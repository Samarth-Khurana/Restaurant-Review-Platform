package com.samarth.restaurant.domain.entities

import org.springframework.data.elasticsearch.annotations.DateFormat
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType
import java.time.LocalDateTime

data class Review(
    @Field(type = FieldType.Keyword)
    val id: String,

    @Field(type = FieldType.Text)
    val content: String,

    @Field(type = FieldType.Integer)
    val rating: Int,

    @Field(type = FieldType.Date, format = [DateFormat.date_hour_minute_second])
    val datePosted: LocalDateTime,

    @Field(type = FieldType.Date, format = [DateFormat.date_hour_minute_second])
    val lastEdited: LocalDateTime,

    @Field(type = FieldType.Nested)
    val photos: List<Photo> = emptyList(),

    @Field(type = FieldType.Nested)
    val user: UserEntity
)
