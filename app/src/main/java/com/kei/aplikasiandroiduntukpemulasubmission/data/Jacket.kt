package com.kei.aplikasiandroiduntukpemulasubmission.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Jacket (
    var image : Int = 0,
    var name : String = "",
    var desc : String = "",
    var price : String = ""
):Parcelable