package kg.geektech.kotlinlesson2.extension

import android.content.Context
import android.net.Uri
import android.util.Patterns

fun Context.validation(uri: String): Boolean{
    if (isFullPath(Uri.parse(uri)).equals("image")){
        return true
    }
    return false
}

fun Context.isFullPath(potentialUrl: Uri): Boolean {
    return  Patterns.WEB_URL.matcher(potentialUrl.toString()).matches()


}