import java.text.SimpleDateFormat
import java.util.*

fun main(vararg args: String) {
    val formater = SimpleDateFormat("ddMMMyyyy")

    val test2 = "16Mar2009(morestuff)"

    val date = formater.parse(test2)

    val cal = Calendar.getInstance()
    cal.time = date

    val day = cal.get(Calendar.DAY_OF_WEEK)

}