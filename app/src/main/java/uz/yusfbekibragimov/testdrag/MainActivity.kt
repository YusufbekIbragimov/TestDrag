package uz.yusfbekibragimov.testdrag

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import uz.yusfbekibragimov.testdrag.MainActivity.Companion.level
import uz.yusfbekibragimov.testdrag.MainActivity.Companion.level_1
import uz.yusfbekibragimov.testdrag.MainActivity.Companion.level_2
import uz.yusfbekibragimov.testdrag.MainActivity.Companion.level_3
import uz.yusfbekibragimov.testdrag.MainActivity.Companion.level_4
import uz.yusfbekibragimov.testdrag.MainActivity.Companion.level_5
import uz.yusfbekibragimov.testdrag.MainActivity.Companion.level_6
import uz.yusfbekibragimov.testdrag.MainActivity.Companion.level_7
import uz.yusfbekibragimov.testdrag.MainActivity.Companion.level_8
import uz.yusfbekibragimov.testdrag.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    companion object {
        const val level_1 = "6,+, ,+, ,=,18,+,+,+,8,+,1,-, ,=,6,+,-,+, ,+,4,+, ,=,15,=,=,=,16,4,17"
        const val level_2 =
            " ,+,8,-, ,=,12,+,+,+, ,+,9,+,4,=,20,+,+,+, ,+, ,+,6,=,11,=,=,=,15,19,11"
        const val level_3 = "6,-, ,+, ,=,9,+,+,+, ,+,3,-, ,=,5,-,-,-, ,+, ,+,9,=,17,=,=,=,3,7,1"
        const val level_4 = "7,-, ,+, ,=,11,+,+,+, ,+,6,+, ,=,12,+,-,+, ,+, ,+,8,=,12,=,=,=,10,8,21"
        const val level_5 =
            " ,+, ,+, ,=,12,+,+,+, ,+,4,+, ,=,21,+,+,+, ,+, ,+, ,=,12,=,=,=,12,12,21"
        const val level_6 = " ,-, ,-, ,=,3,+,+,+, ,+,2,+, ,=,13,+,-,-, ,+, ,+, ,=,17,=,=,=,19,3,3"
        const val level_7 = " ,+, ,+, ,=,20,-,+,+, ,+, ,+, ,=,12,+,+,-, ,+, ,+, ,=,13,=,=,=,8,13,12"
        const val level_8 = " ,-, ,-, ,=,0,+,+,+, ,+, ,+, ,=,22,+,+,+, ,-, ,+, ,=,5,=,=,=,21,10,14"

        var level: Int? = null
    }

    private var binding: ActivityMainBinding? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        level = intent.extras?.getInt("level") ?: 1
        setData(binding!!, this, level)

        binding!!.actionBar.text = "Daraja $level"

    }

}

fun setRes(mainActivity: MainActivity, levelGame: Int) {
    val intent = mainActivity.intent
    mainActivity.overridePendingTransition(0, 0)
    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
    intent.putExtra("level", levelGame)
    mainActivity.finish()
    mainActivity.overridePendingTransition(0, 0)
    mainActivity.startActivity(intent)
}

fun setData(binding: ActivityMainBinding, mainActivity: MainActivity, level: Int?) {
    val levelGame = level ?: 0
    var arr = listOf<String>()
    when (levelGame) {
        1 -> {
            arr = level_1.split(',')
        }
        2 -> {
            arr = level_2.split(',')
        }
        3 -> {
            arr = level_3.split(',')
        }
        4 -> {
            arr = level_4.split(',')
        }
        5 -> {
            arr = level_5.split(',')
        }
        6 -> {
            arr = level_6.split(',')
        }
        7 -> {
            arr = level_7.split(',')
        }
        8 -> {
            arr = level_8.split(',')
        }
    }

    with(binding) {
        cir11.text = arr[0]
        if (arr[0] != " ") {
            cir11.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir11, this, mainActivity)
            cir11.setBackgroundResource(R.drawable.back_gray)
        }
        cir12.text = arr[2]
        if (arr[2] != " ") {
            cir12.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir12, this, mainActivity)
            cir12.setBackgroundResource(R.drawable.back_gray)
        }
        cir13.text = arr[4]
        if (arr[4] != " ") {
            cir13.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir13, this, mainActivity)
            cir13.setBackgroundResource(R.drawable.back_gray)
        }
        cir14.text = arr[6]
        if (arr[6] != " ") {
            cir14.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir14, this, mainActivity)
            cir14.setBackgroundResource(R.drawable.back_gray)
        }
        cir21.text = arr[10]
        if (arr[10] != " ") {
            cir21.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir21, this, mainActivity)
            cir21.setBackgroundResource(R.drawable.back_gray)
        }
        cir22.text = arr[12]
        if (arr[12] != " ") {
            cir22.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir22, this, mainActivity)
            cir22.setBackgroundResource(R.drawable.back_gray)
        }
        cir23.text = arr[14]
        if (arr[14] != " ") {
            cir23.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir23, this, mainActivity)
            cir23.setBackgroundResource(R.drawable.back_gray)
        }
        cir24.text = arr[16]
        if (arr[16] != " ") {
            cir24.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir24, this, mainActivity)
            cir24.setBackgroundResource(R.drawable.back_gray)
        }
        cir31.text = arr[20]
        if (arr[20] != " ") {
            cir31.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir31, this, mainActivity)
            cir31.setBackgroundResource(R.drawable.back_gray)
        }
        cir32.text = arr[22]
        if (arr[22] != " ") {
            cir32.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir32, this, mainActivity)
            cir32.setBackgroundResource(R.drawable.back_gray)
        }
        cir33.text = arr[24]
        if (arr[24] != " ") {
            cir33.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir33, this, mainActivity)
            cir33.setBackgroundResource(R.drawable.back_gray)
        }
        cir34.text = arr[26]
        if (arr[26] != " ") {
            cir34.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir34, this, mainActivity)
            cir34.setBackgroundResource(R.drawable.back_gray)
        }
        cir41.text = arr[30]
        if (arr[30] != " ") {
            cir41.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir41, this, mainActivity)
            cir41.setBackgroundResource(R.drawable.back_gray)
        }
        cir42.text = arr[31]
        if (arr[31] != " ") {
            cir42.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir42, this, mainActivity)
            cir42.setBackgroundResource(R.drawable.back_gray)
        }
        cir43.text = arr[32]
        if (arr[32] != " ") {
            cir43.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir43, this, mainActivity)
            cir43.setBackgroundResource(R.drawable.back_gray)
        }

        act11.text = arr[1]
        act12.text = arr[3]
        act011.text = arr[7]
        act012.text = arr[8]
        act013.text = arr[9]
        act21.text = arr[11]
        act22.text = arr[13]
        act021.text = arr[17]
        act022.text = arr[18]
        act023.text = arr[19]
        act31.text = arr[21]
        act32.text = arr[23]

        initView2(this.num1)
        initView2(this.num2)
        initView2(this.num3)
        initView2(this.num4)
        initView2(this.num5)
        initView2(this.num6)
        initView2(this.num7)
        initView2(this.num8)
        initView2(this.num9)

        num1.setBackgroundResource(R.drawable.back_blue)
        num2.setBackgroundResource(R.drawable.back_blue)
        num3.setBackgroundResource(R.drawable.back_blue)
        num4.setBackgroundResource(R.drawable.back_blue)
        num5.setBackgroundResource(R.drawable.back_blue)
        num6.setBackgroundResource(R.drawable.back_blue)
        num7.setBackgroundResource(R.drawable.back_blue)
        num8.setBackgroundResource(R.drawable.back_blue)
        num9.setBackgroundResource(R.drawable.back_blue)

    }

}

fun enableItem(text: String, binding: ActivityMainBinding, mainActivity: MainActivity) {
    when (text) {
        "1" -> {
            binding.num1.setBackgroundResource(R.drawable.back_gray)
            binding.num1.setOnLongClickListener { false }
        }
        "2" -> {
            binding.num2.setBackgroundResource(R.drawable.back_gray)
            binding.num2.setOnLongClickListener { false }
        }
        "3" -> {
            binding.num3.setBackgroundResource(R.drawable.back_gray)
            binding.num3.setOnLongClickListener { false }
        }
        "4" -> {
            binding.num4.setBackgroundResource(R.drawable.back_gray)
            binding.num4.setOnLongClickListener { false }
        }
        "5" -> {
            binding.num5.setBackgroundResource(R.drawable.back_gray)
            binding.num5.setOnLongClickListener { false }
        }
        "6" -> {
            binding.num6.setBackgroundResource(R.drawable.back_gray)
            binding.num6.setOnLongClickListener { false }
        }
        "7" -> {
            binding.num7.setBackgroundResource(R.drawable.back_gray)
            binding.num7.setOnLongClickListener { false }
        }
        "8" -> {
            binding.num8.setBackgroundResource(R.drawable.back_gray)
            binding.num8.setOnLongClickListener { false }
        }
        "9" -> {
            binding.num9.setBackgroundResource(R.drawable.back_gray)
            binding.num9.setOnLongClickListener { false }
            checkFillFields(binding, mainActivity)
        }
    }
}

fun checkFillFields(binding: ActivityMainBinding, mainActivity: MainActivity) {
    with(binding) {
        moveView(cir11, num1)
        moveView(cir12, num2)
        moveView(cir13, num3)
        moveView(cir21, num4)
        moveView(cir22, num5)
        moveView(cir23, num6)
        moveView(cir31, num7)
        moveView(cir32, num8)
        moveView(cir33, num9)
    }
    val countDownTimer = object : CountDownTimer(1000, 1000) {
        override fun onTick(p0: Long) {}
        override fun onFinish() {
            val levelGame = level ?: 1
            setRes(mainActivity, (levelGame + 1))
        }
    }
    countDownTimer.start()
}

fun checkAnswer() {

}