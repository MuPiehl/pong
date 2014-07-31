package org.coopmobil.pong.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Matthias.Piehl on 31.07.2014.
 */
public class PlayGroundView extends View
{
    private Paint mOuterCirclePaint;
    private Paint mFilledCirclePaint;

    public PlayGroundView(Context c)
    {
        this(c, null);
    }

    public PlayGroundView(Context c, AttributeSet attrs)
    {
        super(c, attrs);

        mOuterCirclePaint = new Paint();
        mOuterCirclePaint.setColor(Color.BLACK);
        mOuterCirclePaint.setStyle(Paint.Style.STROKE);
        mOuterCirclePaint.setStrokeWidth(10f);

        mFilledCirclePaint = new Paint();
        mFilledCirclePaint.setColor(Color.RED);

        mFilledCirclePaint.setStyle(Paint.Style.FILL);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

        Position pos = new Position(canvas.getWidth() / 2, canvas.getHeight() / 2);
        int radius = Math.min(canvas.getWidth(), canvas.getHeight()) / 10;


        canvas.drawCircle(pos.x, pos.y, radius, mOuterCirclePaint);
        canvas.drawCircle(pos.x, pos.y, radius, mFilledCirclePaint);
    }


}
