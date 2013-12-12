package com.example.crashexample;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import hugo.weaving.DebugLog;

public class Example extends View {
 
    public Example(Context context) {
        super(context);
 
        synchronized (Boolean.TRUE) {
        }
    }
 
    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        draw(canvas, null);
    }
 
    private boolean draw(Canvas canvas, Object o) {
        return false;
    }
 
    @DebugLog
    public void test() {
 
    }
}