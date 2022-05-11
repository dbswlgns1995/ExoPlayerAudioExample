package com.jihoonyoon.exoplayeraudioexample.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("/v3/281fca43-1e33-4ffa-ad43-3921cdde1adc")
    fun listMusics() : Call<MusicDto>
}