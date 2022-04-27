package kg.geektech.kotlinlesson2.extension

import android.widget.ImageView
import com.bumptech.glide.Glide
import java.net.URL

fun ImageView.loadImage(url: String){
    Glide.with(this).load(url).centerCrop().into(this)
}