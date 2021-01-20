package com.latifah.githubuserapp.api

import com.latifah.githubuserapp.data.model.DetailUserResponse
import com.latifah.githubuserapp.data.model.User
import com.latifah.githubuserapp.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.*

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 4366877b23518f4aea5fed8d3c6dd4e9b44a71eb")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 4366877b23518f4aea5fed8d3c6dd4e9b44a71eb")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("/users/{username}/followers")
    @Headers("Authorization: token 4366877b23518f4aea5fed8d3c6dd4e9b44a71eb")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("/users/{username}/following")
    @Headers("Authorization: token 4366877b23518f4aea5fed8d3c6dd4e9b44a71eb")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>

}