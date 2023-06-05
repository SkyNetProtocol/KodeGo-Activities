package com.example.logintestapplication.uiLayer.dataclass

import android.os.Parcel
import android.os.Parcelable


data class Grocery(val grocery1:String, val grocery2:String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(grocery1)
        parcel.writeString(grocery2)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Grocery> {
        override fun createFromParcel(parcel: Parcel): Grocery {
            return Grocery(parcel)
        }

        override fun newArray(size: Int): Array<Grocery?> {
            return arrayOfNulls(size)
        }
    }

}
