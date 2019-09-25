package com.volansys.bledata;

import android.content.Context;
import android.widget.Toast;

/**
 * @author Jagdish Bhavsar
 * @version 1.0
 * @created 25, September, 2019
 */
public class MainApp {

    public static void Toast(Context context)
    {
        Toast.makeText(context, "Message from Lib / SDK", Toast.LENGTH_SHORT).show();
    }
}
