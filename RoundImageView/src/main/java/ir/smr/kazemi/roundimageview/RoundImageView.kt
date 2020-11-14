package ir.smr.kazemi.roundimageview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import kotlin.math.min

/**
 * By the grace of Allah, Created by Sayed-MohammadReza Kazemi
 * on 11/13/20.
 */
class RoundImageView(context: Context, attr: AttributeSet) : AppCompatImageView(context, attr) {

    companion object {
        const val circle: String = "cir"
        const val rectangle = "rect"

    }

    private var type = ""
    private var radius = 0f
    private lateinit var rect: RectF
    private val path = Path()

    init {

        scaleType = ScaleType.CENTER

        val ta = context.obtainStyledAttributes(attr, R.styleable.RoundImageView)

        type = ta.getString(R.styleable.RoundImageView_type) ?: circle
        radius = ta.getDimension(R.styleable.RoundImageView_radius, 0f)

        ta.recycle()

    }

    override fun onDraw(canvas: Canvas) {


        rect = RectF(0f, 0f, width.toFloat(), height.toFloat())

        if (type == circle) {
            path.addCircle(
                (width / 2).toFloat(),
                (height / 2).toFloat(),
                calculateRadius(width, height),
                Path.Direction.CW
            )

        } else if (type == rectangle) {
            path.addRoundRect(rect, radius, radius, Path.Direction.CW)
        }

        canvas.clipPath(path)

        super.onDraw(canvas)
    }

    private fun calculateRadius(width: Int, height: Int): Float {

        return if (radius == 0f) {

            (min(width, height) / 2.1).toFloat()

        } else {

            radius

        }

    }


}