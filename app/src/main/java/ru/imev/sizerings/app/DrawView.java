package ru.imev.sizerings.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by e.mihaylov on 03.04.2014.
 */
public class DrawView extends View {

    private Paint p;

    public DrawView(Context context) {
        super(context);
        p = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(100, 200, 50, p);
    }
}
