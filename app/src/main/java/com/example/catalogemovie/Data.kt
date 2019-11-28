package com.example.catalogemovie

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data (
    var title : String?,
    var description : String?,
    var genre : String?,
    var runtime : String?,
    var realese : String?,
    var companies : String?,
    var photo : Int?

) : Parcelable
