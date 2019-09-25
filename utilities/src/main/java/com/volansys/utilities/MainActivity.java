package com.volansys.utilities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity {

    public static void ViewToast(Context context)
    {
        Toast.makeText(context,"Toast",Toast.LENGTH_SHORT).show();
    }
}
