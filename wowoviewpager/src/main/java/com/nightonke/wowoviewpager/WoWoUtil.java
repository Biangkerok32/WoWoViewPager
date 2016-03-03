package com.nightonke.wowoviewpager;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;

/**
 * Created by Weiping on 2016/3/3.
 */
public class WoWoUtil {

    public static int getScreenWidth(Context context) {
        Display display = ((Activity)context).getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size.x;
    }

    public static int getScreenHeight(Context context) {
        Display display = ((Activity)context).getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        return size.y;
    }

    public static int dp2px(int dp, Context mContext) {
        DisplayMetrics displayMetrics = mContext.getResources().getDisplayMetrics();
        int px = Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
        return px;
    }

    private static WoWoUtil ourInstance = new WoWoUtil();

    public static WoWoUtil getInstance() {
        return ourInstance;
    }

    private WoWoUtil() {
    }
}
