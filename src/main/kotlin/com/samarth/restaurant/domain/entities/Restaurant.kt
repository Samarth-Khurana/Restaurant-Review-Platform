package com.samarth.restaurant.domain.entities

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType
import org.springframework.data.elasticsearch.annotations.GeoPointField
import org.springframework.data.elasticsearch.core.geo.GeoPoint

@Document(indexName = "restaurants")
data class Restaurant(
    @Id
    val id: String,

    @Field(type = FieldType.Text)
    val name: String,

    @Field(type = FieldType.Text)
    val cuisineType: String,

    @Field(type = FieldType.Keyword)
    val contactInformation: String,

    @Field(type = FieldType.Float)
    val averageRating: Float,

    @GeoPointField
    val geoLocation: GeoPoint,

    @Field(type = FieldType.Nested)
    val address: Address,

    @Field(type = FieldType.Nested)
    val operatingHours: OperatingHours,

    @Field(type = FieldType.Nested)
    val photos: List<Photo> = emptyList(),

    @Field(type = FieldType.Nested)
    val reviews: List<Review> = emptyList(),

    @Field(type = FieldType.Nested)
    val createdBy: UserEntity
)
