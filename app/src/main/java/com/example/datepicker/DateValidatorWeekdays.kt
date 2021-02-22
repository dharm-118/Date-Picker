package com.tvacstudio.materialdatepicker
import android.os.Parcel
import android.os.Parcelable
import com.google.android.material.datepicker.CalendarConstraints.DateValidator
import java.util.Arrays
import java.util.Calendar
import java.util.TimeZone
/** A {@link DateValidator} that only allows dates from a given point onward to be clicked. */
class DateValidatorWeekdays internal constructor():DateValidator {
    private val utc = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
    override fun isValid(date:Long):Boolean {
        utc.setTimeInMillis(date)
        val dayOfWeek = utc.get(Calendar.DAY_OF_WEEK)
        return dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY
    }
    override fun describeContents():Int {
        return 0
    }
    override fun writeToParcel(dest:Parcel, flags:Int) {}
    public override fun equals(other: Any?): Boolean {
        val o = null
        if (this === o)
        {
            return true
        }
        if (!(o is DateValidatorWeekdays))
        {
            return false
        }
        return true
    }
    public override fun hashCode():Int {
        val hashedFields = arrayOf<Any>()
        return Arrays.hashCode(hashedFields)
    }
    companion object {
        @JvmField val CREATOR: Parcelable.Creator<DateValidatorWeekdays> = object: Parcelable.Creator<DateValidatorWeekdays> {
            override fun createFromParcel(source:Parcel):DateValidatorWeekdays {
                return DateValidatorWeekdays()
            }
            override fun newArray(size:Int): Array<DateValidatorWeekdays?> {
                return arrayOfNulls<DateValidatorWeekdays>(size)

            }
        }
    }
}