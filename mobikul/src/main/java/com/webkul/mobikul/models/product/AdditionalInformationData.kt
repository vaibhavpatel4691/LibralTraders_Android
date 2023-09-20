/*
 * Webkul Software.
 *
 * Kotlin
 *
 * @author Webkul <support@webkul.com>
 * @category Webkul
 * @package com.webkul.mobikul
 * @copyright 2010-2018 Webkul Software Private Limited (https://webkul.com)
 * @license https://store.webkul.com/license.html ASL Licence
 * @link https://store.webkul.com/license.html
 */

package com.webkul.mobikul.models.product

import android.os.Parcel
import android.os.Parcelable
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class AdditionalInformationData() : Parcelable {

    @JsonProperty("label")

    var label: String ?= ""

    @JsonProperty("value")

    var value: String ?= ""

    constructor(parcel: Parcel) : this() {
        label = parcel.readString()
        value = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(label)
        parcel.writeString(value)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<AdditionalInformationData> {
        override fun createFromParcel(parcel: Parcel): AdditionalInformationData {
            return AdditionalInformationData(parcel)
        }

        override fun newArray(size: Int): Array<AdditionalInformationData?> {
            return arrayOfNulls(size)
        }
    }
}