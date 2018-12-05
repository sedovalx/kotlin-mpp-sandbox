@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsQualifier("moment")
package moment

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface Locale {
    fun calendar(key: String? = definedExternally /* null */, m: Moment? = definedExternally /* null */, now: Moment? = definedExternally /* null */): String
    fun longDateFormat(key: dynamic /* String /* "LTS" */ | String /* "LT" */ | String /* "L" */ | String /* "LL" */ | String /* "LLL" */ | String /* "LLLL" */ | String /* "lts" */ | String /* "lt" */ | String /* "l" */ | String /* "ll" */ | String /* "lll" */ | String /* "llll" */ */): String
    fun invalidDate(): String
    fun ordinal(n: Number): String
    fun preparse(inp: String): String
    fun postformat(inp: String): String
    fun relativeTime(n: Number, withoutSuffix: Boolean, key: dynamic /* String /* "s" */ | String /* "ss" */ | String /* "m" */ | String /* "mm" */ | String /* "h" */ | String /* "hh" */ | String /* "d" */ | String /* "dd" */ | String /* "M" */ | String /* "MM" */ | String /* "y" */ | String /* "yy" */ */, isFuture: Boolean): String
    fun pastFuture(diff: Number, absRelTime: String): String
    fun set(config: Any)
    fun months(): Array<String>
    fun months(m: Moment, format: String? = definedExternally /* null */): String
    fun monthsShort(): Array<String>
    fun monthsShort(m: Moment, format: String? = definedExternally /* null */): String
    fun monthsParse(monthName: String, format: String, strict: Boolean): Number
    fun monthsRegex(strict: Boolean): RegExp
    fun monthsShortRegex(strict: Boolean): RegExp
    fun week(m: Moment): Number
    fun firstDayOfYear(): Number
    fun firstDayOfWeek(): Number
    fun weekdays(): Array<String>
    fun weekdays(m: Moment, format: String? = definedExternally /* null */): String
    fun weekdaysMin(): Array<String>
    fun weekdaysMin(m: Moment): String
    fun weekdaysShort(): Array<String>
    fun weekdaysShort(m: Moment): String
    fun weekdaysParse(weekdayName: String, format: String, strict: Boolean): Number
    fun weekdaysRegex(strict: Boolean): RegExp
    fun weekdaysShortRegex(strict: Boolean): RegExp
    fun weekdaysMinRegex(strict: Boolean): RegExp
    fun isPM(input: String): Boolean
    fun meridiem(hour: Number, minute: Number, isLower: Boolean): String
}
external interface StandaloneFormatSpec {
    var format: Array<String>
    var standalone: Array<String>
    var isFormat: RegExp? get() = definedExternally; set(value) = definedExternally
}
external interface WeekSpec {
    var dow: Number
    var doy: Number
}
external interface CalendarSpec {
    var sameDay: dynamic /* String | (m: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */ /*= null*/, now: Moment? /*= null*/) -> String */ get() = definedExternally; set(value) = definedExternally
    var nextDay: dynamic /* String | (m: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */ /*= null*/, now: Moment? /*= null*/) -> String */ get() = definedExternally; set(value) = definedExternally
    var lastDay: dynamic /* String | (m: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */ /*= null*/, now: Moment? /*= null*/) -> String */ get() = definedExternally; set(value) = definedExternally
    var nextWeek: dynamic /* String | (m: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */ /*= null*/, now: Moment? /*= null*/) -> String */ get() = definedExternally; set(value) = definedExternally
    var lastWeek: dynamic /* String | (m: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */ /*= null*/, now: Moment? /*= null*/) -> String */ get() = definedExternally; set(value) = definedExternally
    var sameElse: dynamic /* String | (m: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */ /*= null*/, now: Moment? /*= null*/) -> String */ get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(x: String): dynamic /* String | Unit | (m: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */ /*= null*/, now: Moment? /*= null*/) -> String */
    @nativeSetter
    operator fun set(x: String, value: String)
    @nativeSetter
    operator fun set(x: String, value: Unit)
    @nativeSetter
    operator fun set(x: String, value: (m: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */ /*= null*/, now: Moment? /*= null*/) -> String)
}
external interface RelativeTimeSpec {
    var future: dynamic /* String | (relTime: String) -> String */
    var past: dynamic /* String | (relTime: String) -> String */
    var s: dynamic /* String | (n: Number, withoutSuffix: Boolean, key: dynamic /* String /* "s" */ | String /* "ss" */ | String /* "m" */ | String /* "mm" */ | String /* "h" */ | String /* "hh" */ | String /* "d" */ | String /* "dd" */ | String /* "M" */ | String /* "MM" */ | String /* "y" */ | String /* "yy" */ */, isFuture: Boolean) -> String */
    var ss: dynamic /* String | (n: Number, withoutSuffix: Boolean, key: dynamic /* String /* "s" */ | String /* "ss" */ | String /* "m" */ | String /* "mm" */ | String /* "h" */ | String /* "hh" */ | String /* "d" */ | String /* "dd" */ | String /* "M" */ | String /* "MM" */ | String /* "y" */ | String /* "yy" */ */, isFuture: Boolean) -> String */
    var m: dynamic /* String | (n: Number, withoutSuffix: Boolean, key: dynamic /* String /* "s" */ | String /* "ss" */ | String /* "m" */ | String /* "mm" */ | String /* "h" */ | String /* "hh" */ | String /* "d" */ | String /* "dd" */ | String /* "M" */ | String /* "MM" */ | String /* "y" */ | String /* "yy" */ */, isFuture: Boolean) -> String */
    var mm: dynamic /* String | (n: Number, withoutSuffix: Boolean, key: dynamic /* String /* "s" */ | String /* "ss" */ | String /* "m" */ | String /* "mm" */ | String /* "h" */ | String /* "hh" */ | String /* "d" */ | String /* "dd" */ | String /* "M" */ | String /* "MM" */ | String /* "y" */ | String /* "yy" */ */, isFuture: Boolean) -> String */
    var h: dynamic /* String | (n: Number, withoutSuffix: Boolean, key: dynamic /* String /* "s" */ | String /* "ss" */ | String /* "m" */ | String /* "mm" */ | String /* "h" */ | String /* "hh" */ | String /* "d" */ | String /* "dd" */ | String /* "M" */ | String /* "MM" */ | String /* "y" */ | String /* "yy" */ */, isFuture: Boolean) -> String */
    var hh: dynamic /* String | (n: Number, withoutSuffix: Boolean, key: dynamic /* String /* "s" */ | String /* "ss" */ | String /* "m" */ | String /* "mm" */ | String /* "h" */ | String /* "hh" */ | String /* "d" */ | String /* "dd" */ | String /* "M" */ | String /* "MM" */ | String /* "y" */ | String /* "yy" */ */, isFuture: Boolean) -> String */
    var d: dynamic /* String | (n: Number, withoutSuffix: Boolean, key: dynamic /* String /* "s" */ | String /* "ss" */ | String /* "m" */ | String /* "mm" */ | String /* "h" */ | String /* "hh" */ | String /* "d" */ | String /* "dd" */ | String /* "M" */ | String /* "MM" */ | String /* "y" */ | String /* "yy" */ */, isFuture: Boolean) -> String */
    var dd: dynamic /* String | (n: Number, withoutSuffix: Boolean, key: dynamic /* String /* "s" */ | String /* "ss" */ | String /* "m" */ | String /* "mm" */ | String /* "h" */ | String /* "hh" */ | String /* "d" */ | String /* "dd" */ | String /* "M" */ | String /* "MM" */ | String /* "y" */ | String /* "yy" */ */, isFuture: Boolean) -> String */
    var M: dynamic /* String | (n: Number, withoutSuffix: Boolean, key: dynamic /* String /* "s" */ | String /* "ss" */ | String /* "m" */ | String /* "mm" */ | String /* "h" */ | String /* "hh" */ | String /* "d" */ | String /* "dd" */ | String /* "M" */ | String /* "MM" */ | String /* "y" */ | String /* "yy" */ */, isFuture: Boolean) -> String */
    var MM: dynamic /* String | (n: Number, withoutSuffix: Boolean, key: dynamic /* String /* "s" */ | String /* "ss" */ | String /* "m" */ | String /* "mm" */ | String /* "h" */ | String /* "hh" */ | String /* "d" */ | String /* "dd" */ | String /* "M" */ | String /* "MM" */ | String /* "y" */ | String /* "yy" */ */, isFuture: Boolean) -> String */
    var y: dynamic /* String | (n: Number, withoutSuffix: Boolean, key: dynamic /* String /* "s" */ | String /* "ss" */ | String /* "m" */ | String /* "mm" */ | String /* "h" */ | String /* "hh" */ | String /* "d" */ | String /* "dd" */ | String /* "M" */ | String /* "MM" */ | String /* "y" */ | String /* "yy" */ */, isFuture: Boolean) -> String */
    var yy: dynamic /* String | (n: Number, withoutSuffix: Boolean, key: dynamic /* String /* "s" */ | String /* "ss" */ | String /* "m" */ | String /* "mm" */ | String /* "h" */ | String /* "hh" */ | String /* "d" */ | String /* "dd" */ | String /* "M" */ | String /* "MM" */ | String /* "y" */ | String /* "yy" */ */, isFuture: Boolean) -> String */
}
external interface LongDateFormatSpec {
    var LTS: String
    var LT: String
    var L: String
    var LL: String
    var LLL: String
    var LLLL: String
    var lts: String? get() = definedExternally; set(value) = definedExternally
    var lt: String? get() = definedExternally; set(value) = definedExternally
    var l: String? get() = definedExternally; set(value) = definedExternally
    var ll: String? get() = definedExternally; set(value) = definedExternally
    var lll: String? get() = definedExternally; set(value) = definedExternally
    var llll: String? get() = definedExternally; set(value) = definedExternally
}
external interface LocaleSpecification {
    var months: dynamic /* Array<String> | StandaloneFormatSpec | (momentToFormat: Moment, format: String? /*= null*/) -> String */ get() = definedExternally; set(value) = definedExternally
    var monthsShort: dynamic /* Array<String> | StandaloneFormatSpec | (momentToFormat: Moment, format: String? /*= null*/) -> String */ get() = definedExternally; set(value) = definedExternally
    var weekdays: dynamic /* Array<String> | StandaloneFormatSpec | (momentToFormat: Moment, format: String? /*= null*/) -> String */ get() = definedExternally; set(value) = definedExternally
    var weekdaysShort: dynamic /* Array<String> | StandaloneFormatSpec | (momentToFormat: Moment) -> String */ get() = definedExternally; set(value) = definedExternally
    var weekdaysMin: dynamic /* Array<String> | StandaloneFormatSpec | (momentToFormat: Moment) -> String */ get() = definedExternally; set(value) = definedExternally
    var meridiemParse: RegExp? get() = definedExternally; set(value) = definedExternally
    var meridiem: ((hour: Number, minute: Number, isLower: Boolean) -> String)? get() = definedExternally; set(value) = definedExternally
    var isPM: ((input: String) -> Boolean)? get() = definedExternally; set(value) = definedExternally
    var longDateFormat: LongDateFormatSpec? get() = definedExternally; set(value) = definedExternally
    var calendar: CalendarSpec? get() = definedExternally; set(value) = definedExternally
    var relativeTime: RelativeTimeSpec? get() = definedExternally; set(value) = definedExternally
    var invalidDate: String? get() = definedExternally; set(value) = definedExternally
    var ordinal: ((n: Number) -> String)? get() = definedExternally; set(value) = definedExternally
    var ordinalParse: RegExp? get() = definedExternally; set(value) = definedExternally
    var week: WeekSpec? get() = definedExternally; set(value) = definedExternally
    @nativeGetter
    operator fun get(x: String): Any?
    @nativeSetter
    operator fun set(x: String, value: Any)
}
external interface MomentObjectOutput {
    var years: Number
    var months: Number
    var date: Number
    var hours: Number
    var minutes: Number
    var seconds: Number
    var milliseconds: Number
}
external interface Duration {
    fun clone(): Duration
    fun humanize(withSuffix: Boolean? = definedExternally /* null */): String
    fun abs(): Duration
    fun `as`(units: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ */): Number
    fun get(units: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ */): Number
    fun milliseconds(): Number
    fun asMilliseconds(): Number
    fun seconds(): Number
    fun asSeconds(): Number
    fun minutes(): Number
    fun asMinutes(): Number
    fun hours(): Number
    fun asHours(): Number
    fun days(): Number
    fun asDays(): Number
    fun weeks(): Number
    fun asWeeks(): Number
    fun months(): Number
    fun asMonths(): Number
    fun years(): Number
    fun asYears(): Number
    fun add(inp: String? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration
    fun add(inp: Number? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration
    fun add(inp: Unit? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration
    fun add(inp: Duration? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration
    fun add(inp: FromTo? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration
    fun add(inp: DurationInputObject? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration
    fun subtract(inp: String? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration
    fun subtract(inp: Number? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration
    fun subtract(inp: Unit? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration
    fun subtract(inp: Duration? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration
    fun subtract(inp: FromTo? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration
    fun subtract(inp: DurationInputObject? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration
    fun locale(): String
    fun locale(locale: String): Duration
    fun locale(locale: Boolean): Duration
    fun locale(locale: Moment): Duration
    fun locale(locale: Array<String>): Duration
    fun locale(locale: Duration): Duration
    fun localeData(): Locale
    fun toISOString(): String
    fun toJSON(): String
    fun lang(locale: String): Moment
    fun lang(locale: Boolean): Moment
    fun lang(locale: Moment): Moment
    fun lang(locale: Array<String>): Moment
    fun lang(locale: Duration): Moment
    fun lang(): Locale
    fun toIsoString(): String
    fun add(): Duration
    fun subtract(): Duration
}
external interface MomentRelativeTime {
    var future: Any
    var past: Any
    var s: Any
    var ss: Any
    var m: Any
    var mm: Any
    var h: Any
    var hh: Any
    var d: Any
    var dd: Any
    var M: Any
    var MM: Any
    var y: Any
    var yy: Any
}
external interface MomentLongDateFormat {
    var L: String
    var LL: String
    var LLL: String
    var LLLL: String
    var LT: String
    var LTS: String
    var l: String? get() = definedExternally; set(value) = definedExternally
    var ll: String? get() = definedExternally; set(value) = definedExternally
    var lll: String? get() = definedExternally; set(value) = definedExternally
    var llll: String? get() = definedExternally; set(value) = definedExternally
    var lt: String? get() = definedExternally; set(value) = definedExternally
    var lts: String? get() = definedExternally; set(value) = definedExternally
}
external interface MomentParsingFlags {
    var empty: Boolean
    var unusedTokens: Array<String>
    var unusedInput: Array<String>
    var overflow: Number
    var charsLeftOver: Number
    var nullInput: Boolean
    var invalidMonth: dynamic /* String | Unit */
    var invalidFormat: Boolean
    var userInvalidated: Boolean
    var iso: Boolean
    var parsedDateParts: Array<Any>
    var meridiem: dynamic /* String | Unit */
}
external interface MomentParsingFlagsOpt {
    var empty: Boolean? get() = definedExternally; set(value) = definedExternally
    var unusedTokens: Array<String>? get() = definedExternally; set(value) = definedExternally
    var unusedInput: Array<String>? get() = definedExternally; set(value) = definedExternally
    var overflow: Number? get() = definedExternally; set(value) = definedExternally
    var charsLeftOver: Number? get() = definedExternally; set(value) = definedExternally
    var nullInput: Boolean? get() = definedExternally; set(value) = definedExternally
    var invalidMonth: String? get() = definedExternally; set(value) = definedExternally
    var invalidFormat: Boolean? get() = definedExternally; set(value) = definedExternally
    var userInvalidated: Boolean? get() = definedExternally; set(value) = definedExternally
    var iso: Boolean? get() = definedExternally; set(value) = definedExternally
    var parsedDateParts: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var meridiem: String? get() = definedExternally; set(value) = definedExternally
}
external interface MomentBuiltinFormat {
    var __momentBuiltinFormatBrand: Any
}
external interface MomentInputObject {
    var years: Number? get() = definedExternally; set(value) = definedExternally
    var year: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var months: Number? get() = definedExternally; set(value) = definedExternally
    var month: Number? get() = definedExternally; set(value) = definedExternally
    var M: Number? get() = definedExternally; set(value) = definedExternally
    var days: Number? get() = definedExternally; set(value) = definedExternally
    var day: Number? get() = definedExternally; set(value) = definedExternally
    var d: Number? get() = definedExternally; set(value) = definedExternally
    var dates: Number? get() = definedExternally; set(value) = definedExternally
    var date: Number? get() = definedExternally; set(value) = definedExternally
    var D: Number? get() = definedExternally; set(value) = definedExternally
    var hours: Number? get() = definedExternally; set(value) = definedExternally
    var hour: Number? get() = definedExternally; set(value) = definedExternally
    var h: Number? get() = definedExternally; set(value) = definedExternally
    var minutes: Number? get() = definedExternally; set(value) = definedExternally
    var minute: Number? get() = definedExternally; set(value) = definedExternally
    var m: Number? get() = definedExternally; set(value) = definedExternally
    var seconds: Number? get() = definedExternally; set(value) = definedExternally
    var second: Number? get() = definedExternally; set(value) = definedExternally
    var s: Number? get() = definedExternally; set(value) = definedExternally
    var milliseconds: Number? get() = definedExternally; set(value) = definedExternally
    var millisecond: Number? get() = definedExternally; set(value) = definedExternally
    var ms: Number? get() = definedExternally; set(value) = definedExternally
}
external interface DurationInputObject : MomentInputObject {
    var quarters: Number? get() = definedExternally; set(value) = definedExternally
    var quarter: Number? get() = definedExternally; set(value) = definedExternally
    var Q: Number? get() = definedExternally; set(value) = definedExternally
    var weeks: Number? get() = definedExternally; set(value) = definedExternally
    var week: Number? get() = definedExternally; set(value) = definedExternally
    var w: Number? get() = definedExternally; set(value) = definedExternally
}
external interface MomentSetObject : MomentInputObject {
    var weekYears: Number? get() = definedExternally; set(value) = definedExternally
    var weekYear: Number? get() = definedExternally; set(value) = definedExternally
    var gg: Number? get() = definedExternally; set(value) = definedExternally
    var isoWeekYears: Number? get() = definedExternally; set(value) = definedExternally
    var isoWeekYear: Number? get() = definedExternally; set(value) = definedExternally
    var GG: Number? get() = definedExternally; set(value) = definedExternally
    var quarters: Number? get() = definedExternally; set(value) = definedExternally
    var quarter: Number? get() = definedExternally; set(value) = definedExternally
    var Q: Number? get() = definedExternally; set(value) = definedExternally
    var weeks: Number? get() = definedExternally; set(value) = definedExternally
    var week: Number? get() = definedExternally; set(value) = definedExternally
    var w: Number? get() = definedExternally; set(value) = definedExternally
    var isoWeeks: Number? get() = definedExternally; set(value) = definedExternally
    var isoWeek: Number? get() = definedExternally; set(value) = definedExternally
    var W: Number? get() = definedExternally; set(value) = definedExternally
    var dayOfYears: Number? get() = definedExternally; set(value) = definedExternally
    var dayOfYear: Number? get() = definedExternally; set(value) = definedExternally
    var DDD: Number? get() = definedExternally; set(value) = definedExternally
    var weekdays: Number? get() = definedExternally; set(value) = definedExternally
    var weekday: Number? get() = definedExternally; set(value) = definedExternally
    var e: Number? get() = definedExternally; set(value) = definedExternally
    var isoWeekdays: Number? get() = definedExternally; set(value) = definedExternally
    var isoWeekday: Number? get() = definedExternally; set(value) = definedExternally
    var E: Number? get() = definedExternally; set(value) = definedExternally
}
external interface FromTo {
    var from: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */
    var to: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */
}
external interface MomentCreationData {
    var input: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */
    var format: dynamic /* String | MomentBuiltinFormat | Array<dynamic /* String | MomentBuiltinFormat */> */ get() = definedExternally; set(value) = definedExternally
    var locale: Locale
    var isUTC: Boolean
    var strict: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface Moment : Any {
    fun format(format: String? = definedExternally /* null */): String
    fun startOf(unitOfTime: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */): Moment
    fun endOf(unitOfTime: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */): Moment
    fun add(amount: String? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Moment
    fun add(amount: Number? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Moment
    fun add(amount: Unit? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Moment
    fun add(amount: Duration? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Moment
    fun add(amount: FromTo? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Moment
    fun add(amount: DurationInputObject? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Moment
    fun add(unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */, amount: String): Moment
    fun add(unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */, amount: Number): Moment
    fun subtract(amount: String? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Moment
    fun subtract(amount: Number? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Moment
    fun subtract(amount: Unit? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Moment
    fun subtract(amount: Duration? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Moment
    fun subtract(amount: FromTo? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Moment
    fun subtract(amount: DurationInputObject? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Moment
    fun subtract(unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */, amount: String): Moment
    fun subtract(unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */, amount: Number): Moment
    fun calendar(time: String? = definedExternally /* null */, formats: CalendarSpec? = definedExternally /* null */): String
    fun calendar(time: Number? = definedExternally /* null */, formats: CalendarSpec? = definedExternally /* null */): String
    fun calendar(time: Unit? = definedExternally /* null */, formats: CalendarSpec? = definedExternally /* null */): String
    fun calendar(time: Moment? = definedExternally /* null */, formats: CalendarSpec? = definedExternally /* null */): String
    fun calendar(time: Date? = definedExternally /* null */, formats: CalendarSpec? = definedExternally /* null */): String
    fun calendar(time: Array<dynamic /* String | Number */>? = definedExternally /* null */, formats: CalendarSpec? = definedExternally /* null */): String
    fun calendar(time: MomentInputObject? = definedExternally /* null */, formats: CalendarSpec? = definedExternally /* null */): String
    fun clone(): Moment
    fun valueOf(): Number
    fun local(keepLocalTime: Boolean? = definedExternally /* null */): Moment
    fun isLocal(): Boolean
    fun utc(keepLocalTime: Boolean? = definedExternally /* null */): Moment
    fun isUTC(): Boolean
    fun isUtc(): Boolean
    fun parseZone(): Moment
    fun isValid(): Boolean
    fun invalidAt(): Number
    fun hasAlignedHourOffset(other: String? = definedExternally /* null */): Boolean
    fun hasAlignedHourOffset(other: Number? = definedExternally /* null */): Boolean
    fun hasAlignedHourOffset(other: Unit? = definedExternally /* null */): Boolean
    fun hasAlignedHourOffset(other: Moment? = definedExternally /* null */): Boolean
    fun hasAlignedHourOffset(other: Date? = definedExternally /* null */): Boolean
    fun hasAlignedHourOffset(other: Array<dynamic /* String | Number */>? = definedExternally /* null */): Boolean
    fun hasAlignedHourOffset(other: MomentInputObject? = definedExternally /* null */): Boolean
    fun creationData(): MomentCreationData
    fun parsingFlags(): MomentParsingFlags
    fun year(y: Number): Moment
    fun year(): Number
    fun years(y: Number): Moment
    fun years(): Number
    fun quarter(): Number
    fun quarter(q: Number): Moment
    fun quarters(): Number
    fun quarters(q: Number): Moment
    fun month(M: String): Moment
    fun month(M: Number): Moment
    fun month(): Number
    fun months(M: String): Moment
    fun months(M: Number): Moment
    fun months(): Number
    fun day(d: String): Moment
    fun day(d: Number): Moment
    fun day(): Number
    fun days(d: String): Moment
    fun days(d: Number): Moment
    fun days(): Number
    fun date(d: Number): Moment
    fun date(): Number
    fun dates(d: Number): Moment
    fun dates(): Number
    fun hour(h: Number): Moment
    fun hour(): Number
    fun hours(h: Number): Moment
    fun hours(): Number
    fun minute(m: Number): Moment
    fun minute(): Number
    fun minutes(m: Number): Moment
    fun minutes(): Number
    fun second(s: Number): Moment
    fun second(): Number
    fun seconds(s: Number): Moment
    fun seconds(): Number
    fun millisecond(ms: Number): Moment
    fun millisecond(): Number
    fun milliseconds(ms: Number): Moment
    fun milliseconds(): Number
    fun weekday(): Number
    fun weekday(d: Number): Moment
    fun isoWeekday(): Number
    fun isoWeekday(d: String): Moment
    fun isoWeekday(d: Number): Moment
    fun weekYear(): Number
    fun weekYear(d: Number): Moment
    fun isoWeekYear(): Number
    fun isoWeekYear(d: Number): Moment
    fun week(): Number
    fun week(d: Number): Moment
    fun weeks(): Number
    fun weeks(d: Number): Moment
    fun isoWeek(): Number
    fun isoWeek(d: Number): Moment
    fun isoWeeks(): Number
    fun isoWeeks(d: Number): Moment
    fun weeksInYear(): Number
    fun isoWeeksInYear(): Number
    fun dayOfYear(): Number
    fun dayOfYear(d: Number): Moment
    fun from(inp: String, suffix: Boolean? = definedExternally /* null */): String
    fun from(inp: Number, suffix: Boolean? = definedExternally /* null */): String
    fun from(inp: Unit, suffix: Boolean? = definedExternally /* null */): String
    fun from(inp: Moment, suffix: Boolean? = definedExternally /* null */): String
    fun from(inp: Date, suffix: Boolean? = definedExternally /* null */): String
    fun from(inp: Array<dynamic /* String | Number */>, suffix: Boolean? = definedExternally /* null */): String
    fun from(inp: MomentInputObject, suffix: Boolean? = definedExternally /* null */): String
    fun to(inp: String, suffix: Boolean? = definedExternally /* null */): String
    fun to(inp: Number, suffix: Boolean? = definedExternally /* null */): String
    fun to(inp: Unit, suffix: Boolean? = definedExternally /* null */): String
    fun to(inp: Moment, suffix: Boolean? = definedExternally /* null */): String
    fun to(inp: Date, suffix: Boolean? = definedExternally /* null */): String
    fun to(inp: Array<dynamic /* String | Number */>, suffix: Boolean? = definedExternally /* null */): String
    fun to(inp: MomentInputObject, suffix: Boolean? = definedExternally /* null */): String
    fun fromNow(withoutSuffix: Boolean? = definedExternally /* null */): String
    fun toNow(withoutPrefix: Boolean? = definedExternally /* null */): String
    fun diff(b: String, unitOfTime: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */, precise: Boolean? = definedExternally /* null */): Number
    fun diff(b: Number, unitOfTime: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */, precise: Boolean? = definedExternally /* null */): Number
    fun diff(b: Unit, unitOfTime: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */, precise: Boolean? = definedExternally /* null */): Number
    fun diff(b: Moment, unitOfTime: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */, precise: Boolean? = definedExternally /* null */): Number
    fun diff(b: Date, unitOfTime: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */, precise: Boolean? = definedExternally /* null */): Number
    fun diff(b: Array<dynamic /* String | Number */>, unitOfTime: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */, precise: Boolean? = definedExternally /* null */): Number
    fun diff(b: MomentInputObject, unitOfTime: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */, precise: Boolean? = definedExternally /* null */): Number
    fun toArray(): Array<Number>
    fun toDate(): Date
    fun toISOString(keepOffset: Boolean? = definedExternally /* null */): String
    fun inspect(): String
    fun toJSON(): String
    fun unix(): Number
    fun isLeapYear(): Boolean
    fun zone(): Number
    fun zone(b: String): Moment
    fun zone(b: Number): Moment
    fun utcOffset(): Number
    fun utcOffset(b: String, keepLocalTime: Boolean? = definedExternally /* null */): Moment
    fun utcOffset(b: Number, keepLocalTime: Boolean? = definedExternally /* null */): Moment
    fun isUtcOffset(): Boolean
    fun daysInMonth(): Number
    fun isDST(): Boolean
    fun zoneAbbr(): String
    fun zoneName(): String
    fun isBefore(inp: String? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isBefore(inp: Number? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isBefore(inp: Unit? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isBefore(inp: Moment? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isBefore(inp: Date? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isBefore(inp: Array<dynamic /* String | Number */>? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isBefore(inp: MomentInputObject? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isAfter(inp: String? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isAfter(inp: Number? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isAfter(inp: Unit? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isAfter(inp: Moment? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isAfter(inp: Date? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isAfter(inp: Array<dynamic /* String | Number */>? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isAfter(inp: MomentInputObject? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSame(inp: String? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSame(inp: Number? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSame(inp: Unit? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSame(inp: Moment? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSame(inp: Date? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSame(inp: Array<dynamic /* String | Number */>? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSame(inp: MomentInputObject? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSameOrAfter(inp: String? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSameOrAfter(inp: Number? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSameOrAfter(inp: Unit? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSameOrAfter(inp: Moment? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSameOrAfter(inp: Date? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSameOrAfter(inp: Array<dynamic /* String | Number */>? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSameOrAfter(inp: MomentInputObject? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSameOrBefore(inp: String? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSameOrBefore(inp: Number? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSameOrBefore(inp: Unit? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSameOrBefore(inp: Moment? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSameOrBefore(inp: Date? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSameOrBefore(inp: Array<dynamic /* String | Number */>? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isSameOrBefore(inp: MomentInputObject? = definedExternally /* null */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */): Boolean
    fun isBetween(a: String, b: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */, inclusivity: dynamic /* String? /* "()" */ | String? /* "[)" */ | String? /* "(]" */ | String? /* "[]" */ */ = definedExternally /* null */): Boolean
    fun isBetween(a: Number, b: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */, inclusivity: dynamic /* String? /* "()" */ | String? /* "[)" */ | String? /* "(]" */ | String? /* "[]" */ */ = definedExternally /* null */): Boolean
    fun isBetween(a: Unit, b: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */, inclusivity: dynamic /* String? /* "()" */ | String? /* "[)" */ | String? /* "(]" */ | String? /* "[]" */ */ = definedExternally /* null */): Boolean
    fun isBetween(a: Moment, b: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */, inclusivity: dynamic /* String? /* "()" */ | String? /* "[)" */ | String? /* "(]" */ | String? /* "[]" */ */ = definedExternally /* null */): Boolean
    fun isBetween(a: Date, b: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */, inclusivity: dynamic /* String? /* "()" */ | String? /* "[)" */ | String? /* "(]" */ | String? /* "[]" */ */ = definedExternally /* null */): Boolean
    fun isBetween(a: Array<dynamic /* String | Number */>, b: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */, inclusivity: dynamic /* String? /* "()" */ | String? /* "[)" */ | String? /* "(]" */ | String? /* "[]" */ */ = definedExternally /* null */): Boolean
    fun isBetween(a: MomentInputObject, b: dynamic /* String | Number | Unit | Moment | Date | Array<dynamic /* String | Number */> | MomentInputObject */, granularity: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ */ = definedExternally /* null */, inclusivity: dynamic /* String? /* "()" */ | String? /* "[)" */ | String? /* "(]" */ | String? /* "[]" */ */ = definedExternally /* null */): Boolean
    fun lang(language: String): Moment
    fun lang(language: Boolean): Moment
    fun lang(language: Moment): Moment
    fun lang(language: Array<String>): Moment
    fun lang(language: Duration): Moment
    fun lang(): Locale
    fun locale(): String
    fun locale(locale: String): Moment
    fun locale(locale: Boolean): Moment
    fun locale(locale: Moment): Moment
    fun locale(locale: Array<String>): Moment
    fun locale(locale: Duration): Moment
    fun localeData(): Locale
    fun isDSTShifted(): Boolean
    fun max(inp: String? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun max(inp: Number? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun max(inp: Unit? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun max(inp: Moment? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun max(inp: Date? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun max(inp: Array<dynamic /* String | Number */>? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun max(inp: MomentInputObject? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun max(inp: String? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun max(inp: Number? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun max(inp: Unit? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun max(inp: Moment? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun max(inp: Date? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun max(inp: Array<dynamic /* String | Number */>? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun max(inp: MomentInputObject? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun min(inp: String? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun min(inp: Number? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun min(inp: Unit? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun min(inp: Moment? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun min(inp: Date? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun min(inp: Array<dynamic /* String | Number */>? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun min(inp: MomentInputObject? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun min(inp: String? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun min(inp: Number? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun min(inp: Unit? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun min(inp: Moment? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun min(inp: Date? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun min(inp: Array<dynamic /* String | Number */>? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun min(inp: MomentInputObject? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment
    fun get(unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ | String /* "weekYear" */ | String /* "weekYears" */ | String /* "gg" */ | String /* "isoWeekYear" */ | String /* "isoWeekYears" */ | String /* "GG" */ | String /* "dayOfYear" */ | String /* "dayOfYears" */ | String /* "DDD" */ | String /* "weekday" */ | String /* "weekdays" */ | String /* "e" */ | String /* "isoWeekday" */ | String /* "isoWeekdays" */ | String /* "E" */ */): Number
    fun set(unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ | String /* "weekYear" */ | String /* "weekYears" */ | String /* "gg" */ | String /* "isoWeekYear" */ | String /* "isoWeekYears" */ | String /* "GG" */ | String /* "dayOfYear" */ | String /* "dayOfYears" */ | String /* "DDD" */ | String /* "weekday" */ | String /* "weekdays" */ | String /* "e" */ | String /* "isoWeekday" */ | String /* "isoWeekdays" */ | String /* "E" */ */, value: Number): Moment
    fun set(objectLiteral: MomentSetObject): Moment
    fun toObject(): MomentObjectOutput
    fun add(): Moment
    fun subtract(): Moment
    fun calendar(): String
    fun hasAlignedHourOffset(): Boolean
    fun isBefore(): Boolean
    fun isAfter(): Boolean
    fun isSame(): Boolean
    fun isSameOrAfter(): Boolean
    fun isSameOrBefore(): Boolean
    fun max(): Moment
    fun min(): Moment
}
external var version: String = definedExternally
external var fn: Moment = definedExternally
external fun utc(inp: String? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun utc(inp: Number? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun utc(inp: Unit? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun utc(inp: Moment? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun utc(inp: Date? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun utc(inp: Array<dynamic /* String | Number */>? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun utc(inp: MomentInputObject? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun utc(inp: String? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun utc(inp: Number? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun utc(inp: Unit? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun utc(inp: Moment? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun utc(inp: Date? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun utc(inp: Array<dynamic /* String | Number */>? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun utc(inp: MomentInputObject? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun unix(timestamp: Number): Moment = definedExternally
external fun invalid(flags: MomentParsingFlagsOpt? = definedExternally /* null */): Moment = definedExternally
external fun isMoment(m: Any): Boolean = definedExternally
external fun isDate(m: Any): Boolean = definedExternally
external fun isDuration(d: Any): Boolean = definedExternally
external fun lang(language: String? = definedExternally /* null */): String = definedExternally
external fun lang(language: String? = definedExternally /* null */, definition: Locale? = definedExternally /* null */): String = definedExternally
external fun locale(language: String? = definedExternally /* null */): String = definedExternally
external fun locale(language: Array<String>? = definedExternally /* null */): String = definedExternally
external fun locale(language: String? = definedExternally /* null */, definition: Unit? = definedExternally /* null */): String = definedExternally
external fun locale(language: String? = definedExternally /* null */, definition: LocaleSpecification? = definedExternally /* null */): String = definedExternally
external fun localeData(key: String? = definedExternally /* null */): Locale = definedExternally
external fun localeData(key: Array<String>? = definedExternally /* null */): Locale = definedExternally
external fun duration(inp: String? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration = definedExternally
external fun duration(inp: Number? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration = definedExternally
external fun duration(inp: Unit? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration = definedExternally
external fun duration(inp: Duration? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration = definedExternally
external fun duration(inp: FromTo? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration = definedExternally
external fun duration(inp: DurationInputObject? = definedExternally /* null */, unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ */ = definedExternally /* null */): Duration = definedExternally
external fun parseZone(inp: String? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun parseZone(inp: Number? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun parseZone(inp: Unit? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun parseZone(inp: Moment? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun parseZone(inp: Date? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun parseZone(inp: Array<dynamic /* String | Number */>? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun parseZone(inp: MomentInputObject? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun parseZone(inp: String? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun parseZone(inp: Number? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun parseZone(inp: Unit? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun parseZone(inp: Moment? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun parseZone(inp: Date? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun parseZone(inp: Array<dynamic /* String | Number */>? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun parseZone(inp: MomentInputObject? = definedExternally /* null */, format: dynamic /* String? | MomentBuiltinFormat? | Array<dynamic /* String | MomentBuiltinFormat */>? */ = definedExternally /* null */, language: String? = definedExternally /* null */, strict: Boolean? = definedExternally /* null */): Moment = definedExternally
external fun months(): Array<String> = definedExternally
external fun months(index: Number): String = definedExternally
external fun months(format: String): Array<String> = definedExternally
external fun months(format: String, index: Number): String = definedExternally
external fun monthsShort(): Array<String> = definedExternally
external fun monthsShort(index: Number): String = definedExternally
external fun monthsShort(format: String): Array<String> = definedExternally
external fun monthsShort(format: String, index: Number): String = definedExternally
external fun weekdays(): Array<String> = definedExternally
external fun weekdays(index: Number): String = definedExternally
external fun weekdays(format: String): Array<String> = definedExternally
external fun weekdays(format: String, index: Number): String = definedExternally
external fun weekdays(localeSorted: Boolean): Array<String> = definedExternally
external fun weekdays(localeSorted: Boolean, index: Number): String = definedExternally
external fun weekdays(localeSorted: Boolean, format: String): Array<String> = definedExternally
external fun weekdays(localeSorted: Boolean, format: String, index: Number): String = definedExternally
external fun weekdaysShort(): Array<String> = definedExternally
external fun weekdaysShort(index: Number): String = definedExternally
external fun weekdaysShort(format: String): Array<String> = definedExternally
external fun weekdaysShort(format: String, index: Number): String = definedExternally
external fun weekdaysShort(localeSorted: Boolean): Array<String> = definedExternally
external fun weekdaysShort(localeSorted: Boolean, index: Number): String = definedExternally
external fun weekdaysShort(localeSorted: Boolean, format: String): Array<String> = definedExternally
external fun weekdaysShort(localeSorted: Boolean, format: String, index: Number): String = definedExternally
external fun weekdaysMin(): Array<String> = definedExternally
external fun weekdaysMin(index: Number): String = definedExternally
external fun weekdaysMin(format: String): Array<String> = definedExternally
external fun weekdaysMin(format: String, index: Number): String = definedExternally
external fun weekdaysMin(localeSorted: Boolean): Array<String> = definedExternally
external fun weekdaysMin(localeSorted: Boolean, index: Number): String = definedExternally
external fun weekdaysMin(localeSorted: Boolean, format: String): Array<String> = definedExternally
external fun weekdaysMin(localeSorted: Boolean, format: String, index: Number): String = definedExternally
external fun min(moments: Array<Moment>): Moment = definedExternally
external fun min(vararg moments: Moment): Moment = definedExternally
external fun max(moments: Array<Moment>): Moment = definedExternally
external fun max(vararg moments: Moment): Moment = definedExternally
external fun now(): Number = definedExternally
external fun defineLocale(language: String, localeSpec: Unit): Locale = definedExternally
external fun defineLocale(language: String, localeSpec: LocaleSpecification): Locale = definedExternally
external fun updateLocale(language: String, localeSpec: Unit): Locale = definedExternally
external fun updateLocale(language: String, localeSpec: LocaleSpecification): Locale = definedExternally
external fun locales(): Array<String> = definedExternally
external fun normalizeUnits(unit: dynamic /* String /* "s" */ | String /* "m" */ | String /* "h" */ | String /* "d" */ | String /* "M" */ | String /* "y" */ | String /* "year" */ | String /* "years" */ | String /* "month" */ | String /* "months" */ | String /* "week" */ | String /* "weeks" */ | String /* "w" */ | String /* "day" */ | String /* "days" */ | String /* "hour" */ | String /* "hours" */ | String /* "minute" */ | String /* "minutes" */ | String /* "second" */ | String /* "seconds" */ | String /* "millisecond" */ | String /* "milliseconds" */ | String /* "ms" */ | String /* "quarter" */ | String /* "quarters" */ | String /* "Q" */ | String /* "isoWeek" */ | String /* "isoWeeks" */ | String /* "W" */ | String /* "date" */ | String /* "dates" */ | String /* "D" */ | String /* "weekYear" */ | String /* "weekYears" */ | String /* "gg" */ | String /* "isoWeekYear" */ | String /* "isoWeekYears" */ | String /* "GG" */ | String /* "dayOfYear" */ | String /* "dayOfYears" */ | String /* "DDD" */ | String /* "weekday" */ | String /* "weekdays" */ | String /* "e" */ | String /* "isoWeekday" */ | String /* "isoWeekdays" */ | String /* "E" */ */): String = definedExternally
external fun relativeTimeThreshold(threshold: String): dynamic /* Number | Boolean */ = definedExternally
external fun relativeTimeThreshold(threshold: String, limit: Number): Boolean = definedExternally
external fun relativeTimeRounding(fn: (num: Number) -> Number): Boolean = definedExternally
external fun relativeTimeRounding(): (num: Number) -> Number = definedExternally
external fun calendarFormat(m: Moment, now: Moment): String = definedExternally
external fun parseTwoDigitYear(input: String): Number = definedExternally
external var ISO_8601: MomentBuiltinFormat = definedExternally
external var RFC_2822: MomentBuiltinFormat = definedExternally
external var defaultFormat: String = definedExternally
external var defaultFormatUtc: String = definedExternally
external object HTML5_FMT {
    var DATETIME_LOCAL: String = definedExternally
    var DATETIME_LOCAL_SECONDS: String = definedExternally
    var DATETIME_LOCAL_MS: String = definedExternally
    var DATE: String = definedExternally
    var TIME: String = definedExternally
    var TIME_SECONDS: String = definedExternally
    var TIME_MS: String = definedExternally
    var WEEK: String = definedExternally
    var MONTH: String = definedExternally
}
external fun utc(): Moment = definedExternally
external fun lang(): String = definedExternally
external fun locale(): String = definedExternally
external fun localeData(): Locale = definedExternally
external fun duration(): Duration = definedExternally
external fun parseZone(): Moment = definedExternally
