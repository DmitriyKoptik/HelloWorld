package com.example.helloworld

import android.net.Uri
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.net.URI

@Parcelize
data class GameDetailsMode (
    val title: String,
    val img: String
): Parcelable


