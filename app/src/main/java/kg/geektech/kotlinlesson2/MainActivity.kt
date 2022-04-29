package kg.geektech.kotlinlesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kg.geektech.kotlinlesson2.databinding.ActivityMainBinding
import kg.geektech.kotlinlesson2.extension.loadImage
import kg.geektech.kotlinlesson2.extension.showToast
import kg.geektech.kotlinlesson2.extension.validation
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

//List, ArrayList, LinkedList, HashMap, HashSet, Set - массивы/коллекции.

    private val imageList = arrayListOf<String>().apply {
        add(("https://www.personality-database.com/profile_images/817.png"))
        add(("https://i.pinimg.com/736x/db/ee/3e/dbee3e6cf80d5b21d693ef628af7193c.jpg"))
        add(("http://pm1.narvii.com/6419/34c2d5407cb5e8871f92ebb656e9169dec794412_00.jpg"))
        add(("https://www.meme-arsenal.com/memes/1298531aa453b2b4601a9dc415a11184.jpg"))
        add(("https://i.pinimg.com/originals/57/88/da/5788da1a3657a8fcfe2273eb3b71b77c.jpg"))
        add(("http://pm1.narvii.com/6563/93c720d9333e0a1aa834f6cb6335dad0b5d445e1_00.jpg"))
        add(("https://n1s1.hsmedia.ru/6e/66/e3/6e66e37e86f447f52ff6b1d9eb829e3c/599x600_1_4f558ccdd96a576f872d38547f760242@1046x1048_0xac120003_10053590031625076034.jpg"))
        add(("http://pm1.narvii.com/6496/8caf14639fa1c3dc9fcc586a8924b47a8c471953_00.jpg"))
        add(("https://i.pinimg.com/736x/ed/05/39/ed0539e509cba1abbf0201fadcb77449.jpg"))
        add(("https://i.pinimg.com/474x/bc/ff/8e/bcff8e360273416b996f06d2f7d91f08.jpg"))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        randomBtnSend()
        btnAdd()
    }

    private fun btnAdd() {
        binding.btnAdd.setOnClickListener(View.OnClickListener {
            if (binding.etLink.text.toString().isEmpty()) {
                showToast(R.string.error)
            } else {
                validation(binding.etLink.text.toString())
                binding.image.loadImage(binding.etLink.text.toString())
                imageList.add(binding.etLink.text.toString())

            }
        })
    }

    private fun randomBtnSend() {

        binding.btnRandom.setOnClickListener(View.OnClickListener {

            if (binding.etLink.text.toString().isEmpty()) {
                showToast(R.string.error)
            } else {
                val random = Random
                val index = random.nextInt(imageList.size)
                binding.image.loadImage(imageList[index])
            }

        })

    }


}