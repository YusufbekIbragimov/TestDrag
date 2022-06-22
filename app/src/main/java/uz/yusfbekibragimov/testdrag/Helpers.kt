package uz.yusfbekibragimov.testdrag

import android.animation.Animator
import android.annotation.SuppressLint
import android.content.ClipData
import android.view.DragEvent
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


fun initView1(view: TextView, activityMainBinding: ActivityMainBinding,mainActivity: MainActivity) {

    view.setOnDragListener(object : View.OnDragListener {
        override fun onDrag(v: View, event: DragEvent): Boolean {
            when (event.action) {
                DragEvent.ACTION_DROP -> {
                    val dragVal = event.clipData.getItemAt(0).text.toString()
                    v.setBackgroundResource(R.drawable.back_blue)
                    (v as TextView).text = dragVal
                    v.setOnDragListener { _, _ ->
                        false
                    }
                    enableItem(dragVal, activityMainBinding, mainActivity)
                    return true
                }
                DragEvent.ACTION_DRAG_STARTED -> return true
                DragEvent.ACTION_DRAG_ENTERED -> return true
                DragEvent.ACTION_DRAG_LOCATION -> return true
                DragEvent.ACTION_DRAG_EXITED -> return true
                DragEvent.ACTION_DRAG_ENDED -> return true
                else -> {}
            }
            return false
        }
    })

}

fun initView2(view: TextView?) {

    view?.setOnDragListener(object : View.OnDragListener {
        override fun onDrag(v: View, event: DragEvent): Boolean {
            when (event.action) {
                DragEvent.ACTION_DRAG_STARTED -> return true
                DragEvent.ACTION_DRAG_ENTERED -> return true
                DragEvent.ACTION_DRAG_LOCATION -> return true
                DragEvent.ACTION_DRAG_EXITED -> return true
                DragEvent.ACTION_DROP -> return false
                DragEvent.ACTION_DRAG_ENDED -> return true
                else -> {}
            }
            return false
        }
    })

    view?.setOnLongClickListener { v ->
        val data = ClipData.newPlainText("value", view.text)
        view.startDrag(data, View.DragShadowBuilder(v), null, 0)
        true
    }

}