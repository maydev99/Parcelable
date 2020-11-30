package com.bombadu.parcelable

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//Using Parcelize Annotation, Parcelable code is not needed
@Parcelize
class Location(val city: String?, val state: String?) : Parcelable {

}