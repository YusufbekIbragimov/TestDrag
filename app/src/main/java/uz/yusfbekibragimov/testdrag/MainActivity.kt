package uz.yusfbekibragimov.testdrag

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import uz.yusfbekibragimov.testdrag.MainActivity.Companion.level
import uz.yusfbekibragimov.testdrag.databinding.ActivityMainBinding
import uz.yusfbekibragimov.testdrag.model.*

class MainActivity : AppCompatActivity() {

    companion object {
        var level: Int = 1
    }

    private var binding: ActivityMainBinding? = null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        level = intent.extras?.getInt("level") ?: 1
        setData(binding!!, this, layoutInflater)

        binding!!.actionBar.text = "Daraja $level"

    }

}

fun setRes(
    layoutInflater: LayoutInflater,
    mainActivity: MainActivity,
) {
    val binding2 = ActivityMainBinding.inflate(layoutInflater)
    mainActivity.setContentView(binding2.root)

    setData(binding2, mainActivity, layoutInflater)

    binding2.actionBar.text = "Daraja $level"
}

fun setData(
    binding: ActivityMainBinding,
    mainActivity: MainActivity,
    layoutInflater: LayoutInflater
) {
    val levelGame = level
    var arr = listOf<String>()

    when (levelGame) {
        0 -> {
            level = 1
            binding.actionBar.text = "Daraja $level"
            arr = level_1.split(',')
        }
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
        else -> {
            arr = level_1.split(',')
        }
    }

    with(binding) {
        cir11.text = arr[0]
        if (arr[0] != " ") {
            cir11.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir11, this, mainActivity, level, layoutInflater)
            cir11.setBackgroundResource(R.drawable.back_gray)
        }
        cir12.text = arr[2]
        if (arr[2] != " ") {
            cir12.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir12, this, mainActivity, level, layoutInflater)
            cir12.setBackgroundResource(R.drawable.back_gray)
        }
        cir13.text = arr[4]
        if (arr[4] != " ") {
            cir13.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir13, this, mainActivity, level, layoutInflater)
            cir13.setBackgroundResource(R.drawable.back_gray)
        }
        cir14.text = arr[6]
        if (arr[6] != " ") {
            cir14.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir14, this, mainActivity, level, layoutInflater)
            cir14.setBackgroundResource(R.drawable.back_gray)
        }
        cir21.text = arr[10]
        if (arr[10] != " ") {
            cir21.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir21, this, mainActivity, level, layoutInflater)
            cir21.setBackgroundResource(R.drawable.back_gray)
        }
        cir22.text = arr[12]
        if (arr[12] != " ") {
            cir22.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir22, this, mainActivity, level, layoutInflater)
            cir22.setBackgroundResource(R.drawable.back_gray)
        }
        cir23.text = arr[14]
        if (arr[14] != " ") {
            cir23.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir23, this, mainActivity, level, layoutInflater)
            cir23.setBackgroundResource(R.drawable.back_gray)
        }
        cir24.text = arr[16]
        if (arr[16] != " ") {
            cir24.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir24, this, mainActivity, level, layoutInflater)
            cir24.setBackgroundResource(R.drawable.back_gray)
        }
        cir31.text = arr[20]
        if (arr[20] != " ") {
            cir31.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir31, this, mainActivity, level, layoutInflater)
            cir31.setBackgroundResource(R.drawable.back_gray)
        }
        cir32.text = arr[22]
        if (arr[22] != " ") {
            cir32.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir32, this, mainActivity, level, layoutInflater)
            cir32.setBackgroundResource(R.drawable.back_gray)
        }
        cir33.text = arr[24]
        if (arr[24] != " ") {
            cir33.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir33, this, mainActivity, level, layoutInflater)
            cir33.setBackgroundResource(R.drawable.back_gray)
        }
        cir34.text = arr[26]
        if (arr[26] != " ") {
            cir34.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir34, this, mainActivity, level, layoutInflater)
            cir34.setBackgroundResource(R.drawable.back_gray)
        }
        cir41.text = arr[30]
        if (arr[30] != " ") {
            cir41.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir41, this, mainActivity, level, layoutInflater)
            cir41.setBackgroundResource(R.drawable.back_gray)
        }
        cir42.text = arr[31]
        if (arr[31] != " ") {
            cir42.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir42, this, mainActivity, level, layoutInflater)
            cir42.setBackgroundResource(R.drawable.back_gray)
        }
        cir43.text = arr[32]
        if (arr[32] != " ") {
            cir43.setBackgroundResource(R.drawable.back_blue)
        } else {
            initView1(cir43, this, mainActivity, level, layoutInflater)
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

        initView2(num1,binding,mainActivity)
        initView2(num2,binding,mainActivity)
        initView2(num3,binding,mainActivity)
        initView2(num4,binding,mainActivity)
        initView2(num5,binding,mainActivity)
        initView2(num6,binding,mainActivity)
        initView2(num7,binding,mainActivity)
        initView2(num8,binding,mainActivity)
        initView2(num9,binding,mainActivity)

        getNumbers(arr).forEachIndexed { index, s ->
            if (s != 0) {
                when (s) {
                    1 -> {
                        num1.setOnDragListener(null)
                        num1.setOnTouchListener { _, _ -> false }
                        num1.setBackgroundResource(
                            R.drawable.back_gray
                        )
                    }
                    2 -> {
                        num2.setOnDragListener(null)
                        num2.setOnTouchListener { _, _ -> false }
                        num2.setBackgroundResource(
                            R.drawable.back_gray
                        )
                    }
                    3 -> {
                        num3.setOnDragListener(null)
                        num3.setOnTouchListener { _, _ -> false }
                        num3.setBackgroundResource(
                            R.drawable.back_gray
                        )
                    }
                    4 -> {
                        num4.setOnDragListener(null)
                        num4.setOnTouchListener { _, _ -> false }
                        num4.setBackgroundResource(
                            R.drawable.back_gray
                        )
                    }
                    5 -> {
                        num5.setOnDragListener(null)
                        num5.setOnTouchListener { _, _ -> false }
                        num5.setBackgroundResource(
                            R.drawable.back_gray
                        )
                    }
                    6 -> {
                        num6.setOnDragListener(null)
                        num6.setOnTouchListener { _, _ -> false }
                        num6.setBackgroundResource(
                            R.drawable.back_gray
                        )
                    }
                    7 -> {
                        num7.setOnDragListener(null)
                        num7.setOnTouchListener { _, _ -> false }
                        num7.setBackgroundResource(
                            R.drawable.back_gray
                        )
                    }
                    8 -> {
                        num8.setOnDragListener(null)
                        num8.setOnTouchListener { _, _ -> false }
                        num8.setBackgroundResource(
                            R.drawable.back_gray
                        )
                    }
                    9 -> {
                        num9.setOnDragListener(null)
                        num9.setOnTouchListener { _, _ -> false }
                        num9.setBackgroundResource(
                            R.drawable.back_gray
                        )
                    }
                }
            }
        }

    }

}

@SuppressLint("ClickableViewAccessibility")
fun func(
    binding: ActivityMainBinding,
    mainActivity: MainActivity,
    text: String,
    v: TextView,
    layoutInflater: LayoutInflater
) {
    with(binding) {
        if (text == cir11.text.toString()) {
            if ((cir11 != v)) {
                binding.cir11.setBackgroundResource(R.drawable.back_gray)
                binding.cir11.text = " "
                binding.cir11.setOnTouchListener { _, _ -> false }
                initView1(binding.cir11, binding, mainActivity, level, layoutInflater)
            }
        }
        if (text == cir12.text.toString()) {
            if ((cir12 != v)) {
                binding.cir12.setBackgroundResource(R.drawable.back_gray)
                binding.cir12.text = " "
                binding.cir12.setOnTouchListener { _, _ -> false }
                initView1(binding.cir12, binding, mainActivity, level, layoutInflater)
            }
        }
        if (text == cir13.text.toString()) {
            if ((cir13 != v)) {
                binding.cir13.setBackgroundResource(R.drawable.back_gray)
                binding.cir13.text = " "
                binding.cir13.setOnTouchListener { _, _ -> false }
                initView1(binding.cir13, binding, mainActivity, level, layoutInflater)
            }
        }
        if (text == cir21.text.toString()) {
            if ((cir21 != v)) {
                binding.cir21.setBackgroundResource(R.drawable.back_gray)
                binding.cir21.text = " "
                binding.cir21.setOnTouchListener { _, _ -> false }
                initView1(binding.cir21, binding, mainActivity, level, layoutInflater)
            }
        }
        if (text == cir22.text.toString()) {
            if ((cir22 != v)) {
                binding.cir22.setBackgroundResource(R.drawable.back_gray)
                binding.cir22.text = " "
                binding.cir22.setOnTouchListener { _, _ -> false }
                initView1(binding.cir22, binding, mainActivity, level, layoutInflater)
            }
        }
        if (text == cir23.text.toString()) {
            if ((cir23 != v)) {
                binding.cir23.setBackgroundResource(R.drawable.back_gray)
                binding.cir23.text = " "
                binding.cir23.setOnTouchListener { _, _ -> false }
                initView1(binding.cir23, binding, mainActivity, level, layoutInflater)
            }
        }
        if (text == cir31.text.toString()) {
            if ((cir31 != v)) {
                binding.cir31.setBackgroundResource(R.drawable.back_gray)
                binding.cir31.text = " "
                binding.cir31.setOnTouchListener { _, _ -> false }
                initView1(binding.cir31, binding, mainActivity, level, layoutInflater)
            }
        }
        if (text == cir32.text.toString()) {
            if ((cir32 != v)) {
                binding.cir32.setBackgroundResource(R.drawable.back_gray)
                binding.cir32.text = " "
                binding.cir32.setOnTouchListener { _, _ -> false }
                initView1(binding.cir32, binding, mainActivity, level, layoutInflater)
            }
        }
        if (text == cir33.text.toString()) {
            if ((cir33 != v)) {
                binding.cir33.setBackgroundResource(R.drawable.back_gray)
                binding.cir33.text = " "
                binding.cir33.setOnTouchListener { _, _ -> false }
                initView1(binding.cir33, binding, mainActivity, level, layoutInflater)
            }
        }
    }
}

@SuppressLint("ClickableViewAccessibility")
fun func2(
    binding: ActivityMainBinding,
    mainActivity: MainActivity,
    text: String,
    layoutInflater: LayoutInflater
) {
    with(binding) {
        if (text == cir11.text.toString()) {
            binding.cir11.setBackgroundResource(R.drawable.back_gray)
            binding.cir11.text = " "
            binding.cir11.setOnTouchListener { _, _ -> false }
            initView1(binding.cir11, binding, mainActivity, level, layoutInflater)
        }
        if (text == cir12.text.toString()) {
            binding.cir12.setBackgroundResource(R.drawable.back_gray)
            binding.cir12.text = " "
            binding.cir12.setOnTouchListener { _, _ -> false }
            initView1(binding.cir12, binding, mainActivity, level, layoutInflater)
        }
        if (text == cir13.text.toString()) {
            binding.cir13.setBackgroundResource(R.drawable.back_gray)
            binding.cir13.text = " "
            binding.cir13.setOnTouchListener { _, _ -> false }
            initView1(binding.cir13, binding, mainActivity, level, layoutInflater)
        }
        if (text == cir21.text.toString()) {
            binding.cir21.setBackgroundResource(R.drawable.back_gray)
            binding.cir21.text = " "
            binding.cir21.setOnTouchListener { _, _ -> false }
            initView1(binding.cir21, binding, mainActivity, level, layoutInflater)
        }
        if (text == cir22.text.toString()) {
            binding.cir22.setBackgroundResource(R.drawable.back_gray)
            binding.cir22.text = " "
            binding.cir22.setOnTouchListener { _, _ -> false }
            initView1(binding.cir22, binding, mainActivity, level, layoutInflater)
        }
        if (text == cir23.text.toString()) {
            binding.cir23.setBackgroundResource(R.drawable.back_gray)
            binding.cir23.text = " "
            binding.cir23.setOnTouchListener { _, _ -> false }
            initView1(binding.cir23, binding, mainActivity, level, layoutInflater)
        }
        if (text == cir31.text.toString()) {
            binding.cir31.setBackgroundResource(R.drawable.back_gray)
            binding.cir31.text = " "
            binding.cir31.setOnTouchListener { _, _ -> false }
            initView1(binding.cir31, binding, mainActivity, level, layoutInflater)
        }
        if (text == cir32.text.toString()) {
            binding.cir32.setBackgroundResource(R.drawable.back_gray)
            binding.cir32.text = " "
            binding.cir32.setOnTouchListener { _, _ -> false }
            initView1(binding.cir32, binding, mainActivity, level, layoutInflater)
        }
        if (text == cir33.text.toString()) {
            binding.cir33.setBackgroundResource(R.drawable.back_gray)
            binding.cir33.text = " "
            binding.cir33.setOnTouchListener { _, _ -> false }
            initView1(binding.cir33, binding, mainActivity, level, layoutInflater)
        }
    }
}

@SuppressLint("ClickableViewAccessibility")
fun enableItem(
    v: TextView,
    text: String,
    binding: ActivityMainBinding,
    mainActivity: MainActivity,
    level1: Int,
    layoutInflater: LayoutInflater
) {
    when (text) {
        "1" -> {
            binding.num1.setBackgroundResource(R.drawable.back_gray)
            binding.num1.setOnTouchListener { _, _ -> false }
            func(binding, mainActivity, text, v, layoutInflater)
            initView01(binding.num1, binding, mainActivity, level1, layoutInflater)
        }
        "2" -> {
            binding.num2.setBackgroundResource(R.drawable.back_gray)
            binding.num2.setOnTouchListener { _, _ -> false }
            func(binding, mainActivity, text, v, layoutInflater)
            initView01(binding.num2, binding, mainActivity, level1, layoutInflater)
        }
        "3" -> {
            binding.num3.setBackgroundResource(R.drawable.back_gray)
            binding.num3.setOnTouchListener { _, _ -> false }
            func(binding, mainActivity, text, v, layoutInflater)
            initView01(binding.num3, binding, mainActivity, level1, layoutInflater)
        }
        "4" -> {
            binding.num4.setBackgroundResource(R.drawable.back_gray)
            binding.num4.setOnTouchListener { _, _ -> false }
            func(binding, mainActivity, text, v, layoutInflater)
            initView01(binding.num4, binding, mainActivity, level1, layoutInflater)
        }
        "5" -> {
            binding.num5.setBackgroundResource(R.drawable.back_gray)
            binding.num5.setOnTouchListener { _, _ -> false }
            func(binding, mainActivity, text, v, layoutInflater)
            initView01(binding.num5, binding, mainActivity, level1, layoutInflater)
        }
        "6" -> {
            binding.num6.setBackgroundResource(R.drawable.back_gray)
            binding.num6.setOnTouchListener { _, _ -> false }
            initView01(binding.num6, binding, mainActivity, level1, layoutInflater)
            func(binding, mainActivity, text, v, layoutInflater)
        }
        "7" -> {
            binding.num7.setBackgroundResource(R.drawable.back_gray)
            binding.num7.setOnTouchListener { _, _ -> false }
            func(binding, mainActivity, text, v, layoutInflater)
            initView01(binding.num7, binding, mainActivity, level1, layoutInflater)
        }
        "8" -> {
            binding.num8.setBackgroundResource(R.drawable.back_gray)
            binding.num8.setOnTouchListener { _, _ -> false }
            func(binding, mainActivity, text, v, layoutInflater)
            initView01(binding.num8, binding, mainActivity, level1, layoutInflater)
        }
        "9" -> {
            binding.num9.setBackgroundResource(R.drawable.back_gray)
            binding.num9.setOnTouchListener { _, _ -> false }
            func(binding, mainActivity, text, v, layoutInflater)
            initView01(binding.num9, binding, mainActivity, level1, layoutInflater)
        }
    }
    if (readyToCheck(binding)) {
        if (localChecking(binding) == true) {
            checkFillFields(binding, mainActivity, level1, layoutInflater)
        } else {
            binding.lottie2.visibility = View.VISIBLE
            binding.lottie2.playAnimation()
            val countDownTimer = object : CountDownTimer(1500, 1500) {
                override fun onTick(p0: Long) {}
                override fun onFinish() {
                    setRes(layoutInflater, mainActivity)
                }
            }
            countDownTimer.start()
        }
    }
}

fun localChecking(binding: ActivityMainBinding): Boolean? {

    with(binding) {

        var horizontalOne = false
        var horizontalTwo = false
        var horizontalThree = false

        var verticalOne = false
        var verticalTwo = false
        var verticalThree = false

        // Horizontal
        val d1 = calculateTwo(
            calculateTwo(
                cir11.text.toString(),
                cir12.text.toString(),
                act11.text.toString()
            ).toString(), cir13.text.toString(), act12.text.toString()
        )
        horizontalOne = d1 == cir14.text.toString().toDouble()

        val d2 = calculateTwo(
            calculateTwo(
                cir21.text.toString(),
                cir22.text.toString(),
                act21.text.toString()
            ).toString(), cir23.text.toString(), act22.text.toString()
        )
        horizontalTwo = d2 == cir24.text.toString().toDouble()

        val d3 = calculateTwo(
            calculateTwo(
                cir31.text.toString(),
                cir32.text.toString(),
                act31.text.toString()
            ).toString(), cir33.text.toString(), act32.text.toString()
        )
        horizontalThree = d3 == cir34.text.toString().toDouble()

        // Vertical
        val v1 = calculateTwo(
            calculateTwo(
                cir11.text.toString(),
                cir21.text.toString(),
                act011.text.toString()
            ).toString(), cir31.text.toString(), act021.text.toString()
        )
        verticalOne = v1 == cir41.text.toString().toDouble()
        val v2 = calculateTwo(
            calculateTwo(
                cir12.text.toString(),
                cir22.text.toString(),
                act012.text.toString()
            ).toString(), cir32.text.toString(), act022.text.toString()
        )
        verticalTwo = v2 == cir42.text.toString().toDouble()
        val v3 = calculateTwo(
            calculateTwo(
                cir13.text.toString(),
                cir23.text.toString(),
                act013.text.toString()
            ).toString(), cir33.text.toString(), act023.text.toString()
        )
        verticalThree = v3 == cir43.text.toString().toDouble()

        Log.d("TAGTAG", "localCheck: ${horizontalOne}")
        Log.d("TAGTAG", "localCheck: ${verticalOne}")
        Log.d("TAGTAG", "localCheck: ${horizontalTwo}")
        Log.d("TAGTAG", "localCheck: ${horizontalThree}")
        Log.d("TAGTAG", "localCheck: ${verticalTwo}")
        Log.d("TAGTAG", "localCheck: ${verticalThree}")
        return horizontalOne && horizontalTwo && horizontalThree && verticalThree && verticalTwo && verticalOne
    }
    return null
}

fun checkFillFields(
    binding: ActivityMainBinding,
    mainActivity: MainActivity,
    level: Int,
    layoutInflater: LayoutInflater
) {

    binding.lottie.visibility = View.VISIBLE
    binding.lottie.playAnimation()

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
    val countDownTimer = object : CountDownTimer(1200, 1200) {
        override fun onTick(p0: Long) {}
        override fun onFinish() {
            MainActivity.level += 1
            setRes(layoutInflater, mainActivity)
        }
    }
    countDownTimer.start()
}

fun readyToCheck(binding: ActivityMainBinding): Boolean {
    var num = 0
    with(binding) {
        if (cir11.text != " ") num += 1
        if (cir12.text != " ") num += 1
        if (cir13.text != " ") num += 1
        if (cir21.text != " ") num += 1
        if (cir22.text != " ") num += 1
        if (cir23.text != " ") num += 1
        if (cir31.text != " ") num += 1
        if (cir32.text != " ") num += 1
        if (cir33.text != " ") num += 1
    }
    Log.d("TAGTAG", "readyToCheck: ${9 == num}")
    return num == 9
}