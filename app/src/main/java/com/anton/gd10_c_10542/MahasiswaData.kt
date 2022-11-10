package com.anton.gd10_c_10542

import com.google.gson.annotations.SerializedName

data class MahasiswaData(
    @SerializedName("mhsnobp") val nim:String,
    @SerializedName("mhsnama") val nama:String,
    @SerializedName("mhsalamat") val alamat:String,
    @SerializedName("prodinama") val prodi:String,
    @SerializedName("mhstgllhr") val tgllhr:String,
)