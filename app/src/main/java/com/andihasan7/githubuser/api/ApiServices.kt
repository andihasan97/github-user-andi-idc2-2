package com.andihasan7.githubuser.api

import com.andihasan7.githubuser.model.DetailResource
import com.andihasan7.githubuser.model.SearchUserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServices {

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getDetailUser(
        @Path("username")
        login: String
    ): Call<DetailResource>

    @GET("search/users")
    @Headers("Authorization: token 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")
    fun searchUsers(
        @Query("q")
        query: String
    ): Call<SearchUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getUserFollowers(
        @Path("username")
        login: String
    ): Call<List<DetailResource>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getUserFollowing(
        @Path("username")
        login: String
    ): Call<List<DetailResource>>

}
