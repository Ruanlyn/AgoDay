fun agoToText(seconds: Int): String {
    return when{
        seconds in 0..60 -> "был(а) только что"
        seconds in 61..3600 -> "${getMinutesText(seconds)} назад"
        seconds in 3601..86400 -> "${getHoursText(seconds)} назад"
        seconds in 86401..172800 -> "вчера"
        seconds in 172801..259200 -> "позавчера"
        else -> "давно"
    }
}

fun getMinutesText(seconds: Int): String {
    return when (seconds) {
        in 61..120 -> "2 минуты"
        in 121..300 -> "5 минут"
        in 301..660 -> "11 минут"
        in 661..1260 -> "21 минуту"
        in 1261..1500 -> "25 минут"
        else -> "${seconds / 60} минут"
    }
}

fun getHoursText(seconds: Int): String {
    var hours = seconds / 3600
    return when (hours) {
        1, 21 -> "$hours час"
        in 2..4, in 22..24 -> "$hours часа"
        else -> "$hours часов"
    }
}

fun main() {
    val seconds = 80000
    val text = agoToText(seconds)
    println(text)
}