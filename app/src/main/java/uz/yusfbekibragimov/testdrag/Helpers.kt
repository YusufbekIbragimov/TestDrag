package uz.yusfbekibragimov.testdrag

import android.animation.Animator
import android.annotation.SuppressLint
import android.content.ClipData
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.DragEvent
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import uz.yusfbekibragimov.testdrag.databinding.ActivityMainBinding

/**
 * Created by Ibragimov Yusufbek
 * Date: 22/06/2022
 * Project: TestDrag
 **/

@SuppressLint("ObjectAnimatorBinding")
fun moveView(viewToBeMoved: View, targetView: View) {

    val x = viewToBeMoved.x
    val y = viewToBeMoved.y
    val targetX: Float = targetView.x + targetView.width / 2 - viewToBeMoved.width / 2
    val targetY: Float = targetView.y + targetView.height / 2 - viewToBeMoved.height / 2

    viewToBeMoved.animate()
        .x(targetX)
        .y(targetY)
        .setListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(p0: Animator?) {}
            override fun onAnimationEnd(p0: Animator?) {
                viewToBeMoved.animate().x(x).y(y).setDuration(0L).start()
            }

            override fun onAnimationCancel(p0: Animator?) {}
            override fun onAnimationRepeat(p0: Animator?) {}
        })
        .setDuration(1000)
        .start()

}

fun calculateTwo(oneItem: String, twoItem: String, amal: String): Double? {
    val one = oneItem.toDouble()
    val two = twoItem.toDouble()
    when (amal) {
        "+" -> {
            return one + two
        }
        "-" -> {
            return one - two
        }
        "*" -> {
            return one * two
        }
        "/" -> {
            return one / two
        }
    }
    return null
}

fun initView1(
    view: TextView,
    activityMainBinding: ActivityMainBinding,
    mainActivity: MainActivity, level: Int, layoutInflater: LayoutInflater
) {

    view.setOnDragListener(object : View.OnDragListener {
        @SuppressLint("ClickableViewAccessibility")
        override fun onDrag(v: View, event: DragEvent): Boolean {
            when (event.action) {
                DragEvent.ACTION_DROP -> {
                    if ((v as TextView).text.toString() == " ") {
                        val dragVal = event.clipData.getItemAt(0).text.toString()
                        v.setBackgroundResource(R.drawable.back_blue)
                        (v as TextView).text = dragVal
                        v.setOnTouchListener { p0, p1 ->
                            when (dragVal.toInt()) {
                                1 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num1.text
                                    )
                                    activityMainBinding.num1.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                2 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num2.text
                                    )
                                    activityMainBinding.num2.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                3 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num3.text
                                    )
                                    activityMainBinding.num3.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                4 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num4.text
                                    )
                                    activityMainBinding.num4.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                5 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num5.text
                                    )
                                    activityMainBinding.num5.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                6 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num6.text
                                    )
                                    activityMainBinding.num6.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                7 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num7.text
                                    )
                                    activityMainBinding.num7.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                8 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num8.text
                                    )
                                    activityMainBinding.num8.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                9 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num9.text
                                    )
                                    activityMainBinding.num9.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                            }
                            true
                        }
                        enableItem(
                            v,
                            dragVal,
                            activityMainBinding,
                            mainActivity,
                            level,
                            layoutInflater
                        )
                        return true
                    } else return false
                }
                DragEvent.ACTION_DRAG_STARTED -> return true
                DragEvent.ACTION_DRAG_ENTERED -> return false
                DragEvent.ACTION_DRAG_LOCATION -> {
                    v.setBackgroundResource(R.drawable.back_gray)
                    return true
                }
                DragEvent.ACTION_DRAG_EXITED -> return true
                DragEvent.ACTION_DRAG_ENDED -> {
                    if ((v as TextView).text.toString() == " ") {
                        v.setBackgroundResource(R.drawable.back_gray)
                    } else {
                        v.setBackgroundResource(R.drawable.back_blue)
                    }
                    return true
                }
                else -> {}
            }
            return false
        }
    })

}

fun initView01(
    view: TextView,
    activityMainBinding: ActivityMainBinding,
    mainActivity: MainActivity, level: Int, layoutInflater: LayoutInflater
) {

    view.setOnDragListener(object : View.OnDragListener {
        @SuppressLint("ClickableViewAccessibility")
        override fun onDrag(v: View, event: DragEvent): Boolean {
            when (event.action) {
                DragEvent.ACTION_DROP -> {
                    val dragVal = event.clipData.getItemAt(0).text.toString()
                    if ((v as TextView).text.toString() == dragVal) {
                        v.setBackgroundResource(R.drawable.back_blue)
                        v.setOnTouchListener { p0, p1 ->
                            when (dragVal.toInt()) {
                                1 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num1.text
                                    )
                                    activityMainBinding.num1.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                2 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num2.text
                                    )
                                    activityMainBinding.num2.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                3 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num3.text
                                    )
                                    activityMainBinding.num3.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                4 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num4.text
                                    )
                                    activityMainBinding.num4.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                5 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num5.text
                                    )
                                    activityMainBinding.num5.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                6 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num6.text
                                    )
                                    activityMainBinding.num6.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                7 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num7.text
                                    )
                                    activityMainBinding.num7.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                8 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num8.text
                                    )
                                    activityMainBinding.num8.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                                9 -> {
                                    val data = ClipData.newPlainText(
                                        "value",
                                        activityMainBinding.num9.text
                                    )
                                    activityMainBinding.num9.startDrag(
                                        data,
                                        View.DragShadowBuilder(p0),
                                        null,
                                        0
                                    )
                                }
                            }
                            true
                        }
                        func2(activityMainBinding, mainActivity, dragVal, layoutInflater)
                        return true
                    } else return false
                }
                DragEvent.ACTION_DRAG_STARTED -> return true
                DragEvent.ACTION_DRAG_ENTERED -> return false
                DragEvent.ACTION_DRAG_LOCATION -> return true
                DragEvent.ACTION_DRAG_EXITED -> return true
                DragEvent.ACTION_DRAG_ENDED -> return true
                else -> {}
            }
            return false
        }
    })

}

@SuppressLint("ClickableViewAccessibility")
fun initView2(view: TextView?, binding: ActivityMainBinding,mainActivity: MainActivity) {

    view?.setOnDragListener(object : View.OnDragListener {
        override fun onDrag(v: View, event: DragEvent): Boolean {
            when (event.action) {
                DragEvent.ACTION_DRAG_STARTED -> {
                    return true
                }
                DragEvent.ACTION_DRAG_ENTERED -> {
                    if ((v as TextView).background == mainActivity.getResources().getDrawable( R.drawable.back_blue )) {
                        v.setBackgroundResource(R.drawable.back_blue)
                    } else {
                        v.setBackgroundResource(R.drawable.back_gray)
                    }
                    return true
                }
                DragEvent.ACTION_DRAG_LOCATION -> {
                    return true
                }
                DragEvent.ACTION_DRAG_EXITED -> {
                    if ((v as TextView).background == mainActivity.getResources().getDrawable( R.drawable.back_blue )) {
                        v.setBackgroundResource(R.drawable.back_blue)
                    } else {
                        v.setBackgroundResource(R.drawable.back_gray)
                    }
                    return true
                }
                DragEvent.ACTION_DROP -> return false
                DragEvent.ACTION_DRAG_ENDED -> {
                    v.setBackgroundResource(R.drawable.back_blue)
                    return true
                }
                else -> {}
            }
            return false
        }
    })

    view?.setOnTouchListener { p0, p1 ->
        val data = ClipData.newPlainText("value", view.text)
        view.startDrag(data, View.DragShadowBuilder(view), null, 0)
        true
    }

}

fun getNumbers(arr: List<String>): ArrayList<Int> {

    val listOne = arrayListOf<Int>()

    listOne.add(
        if (arr[0] == " ") 0 else arr[0].toInt()
    )
    listOne.add(
        if (arr[2] == " ") 0 else arr[2].toInt()
    )
    listOne.add(
        if (arr[4] == " ") 0 else arr[4].toInt()
    )
    listOne.add(
        if (arr[10] == " ") 0 else arr[10].toInt()
    )
    listOne.add(
        if (arr[12] == " ") 0 else arr[12].toInt()
    )
    listOne.add(
        if (arr[14] == " ") 0 else arr[14].toInt()
    )
    listOne.add(
        if (arr[20] == " ") 0 else arr[20].toInt()
    )
    listOne.add(
        if (arr[22] == " ") 0 else arr[22].toInt()
    )
    listOne.add(
        if (arr[24] == " ") 0 else arr[24].toInt()
    )

    listOne.sortBy { it }

    return listOne
}