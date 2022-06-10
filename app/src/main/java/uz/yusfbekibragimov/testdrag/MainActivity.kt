package uz.yusfbekibragimov.testdrag

import android.content.ClipData
import android.os.Bundle
import android.view.DragEvent
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import uz.yusfbekibragimov.testdrag.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        setData()

    }

    val setData = {

        val rootView1 = binding!!.linear1
        val size1 = rootView1.childCount

        for (i: Int in 0 until size1) {
            val view = rootView1.getChildAt(i) as TextView
            initView1(view)
        }

        val rootView2 = binding!!.linear2
        val size2 = rootView2.childCount

        for (i: Int in 0 until size2) {
            val view = rootView2.getChildAt(i) as TextView
            initView2(view)
        }

    }

}

private fun initView1(view: TextView) {
    view.setOnDragListener(object : View.OnDragListener {
        override fun onDrag(v: View, event: DragEvent): Boolean {
            when (event.action) {
                DragEvent.ACTION_DRAG_STARTED -> {
                    return true
                }
                DragEvent.ACTION_DRAG_ENTERED -> {
                    v.setBackgroundResource(R.drawable.back_gray)
                    return true
                }
                DragEvent.ACTION_DRAG_LOCATION -> {
                    return true
                }
                DragEvent.ACTION_DRAG_EXITED -> {
                    return true
                }
                DragEvent.ACTION_DROP -> {
                    val dragVal = event.clipData.getItemAt(0).text.toString().toInt()
                    val viewVal = (v as TextView).text.toString().toInt()
                    if (dragVal == viewVal) {
                        v.setBackgroundResource(R.drawable.back_blue)
                        return true
                    }
                    return false
                }
                DragEvent.ACTION_DRAG_ENDED -> {
                    return true
                }
                else -> {

                }
            }
            return false
        }
    })

}

private fun initView2(view: TextView) {
    view.setOnDragListener(object : View.OnDragListener {
        override fun onDrag(v: View, event: DragEvent): Boolean {
            when (event.action) {
                DragEvent.ACTION_DRAG_STARTED -> {
                    return true
                }
                DragEvent.ACTION_DRAG_ENTERED -> {
                    v.setBackgroundResource(R.drawable.back_blue)
                    return true
                }
                DragEvent.ACTION_DRAG_LOCATION -> {
                    v.setBackgroundResource(R.drawable.back_gray)
                    return true
                }
                DragEvent.ACTION_DRAG_EXITED -> {
                    v.setBackgroundResource(R.drawable.back_gray)
                    return true
                }
                DragEvent.ACTION_DROP -> {
                    return false
                }
                DragEvent.ACTION_DRAG_ENDED -> {
                    return true
                }
                else -> {}
            }
            return false
        }
    })

    view.setOnLongClickListener { v ->
        val data = ClipData.newPlainText("value", view.text)
        view.startDrag(data, View.DragShadowBuilder(v), null, 0)
        true
    }

}