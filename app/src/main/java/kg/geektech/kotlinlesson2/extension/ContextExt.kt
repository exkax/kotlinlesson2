package kg.geektech.kotlinlesson2.extension

import android.content.Context
import android.widget.Toast

fun Context.showToast(message: Int){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

}