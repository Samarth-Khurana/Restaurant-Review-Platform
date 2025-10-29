package com.samarth.restaurant.repositories

import com.samarth.restaurant.domain.entities.Restaurant
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository
import org.springframework.stereotype.Repository

@Repository
interface RestaurantRepository : ElasticsearchRepository<Restaurant, String>