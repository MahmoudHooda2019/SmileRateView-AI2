package me.aemo.smilerateview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;

public class BackgroundDrawable {


    public static Drawable white_background(Context context) {
        // Create a GradientDrawable
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(GradientDrawable.RECTANGLE);

        // Set the corner radius
        int cornerRadiusInPixels = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                30f,
                context.getResources().getDisplayMetrics()
        );
        gradientDrawable.setCornerRadius(cornerRadiusInPixels);

        // Set the background color
        gradientDrawable.setColor(ColorStateList.valueOf(Color.WHITE));

        // Create a RippleDrawable (optional, for touch feedback)
        Drawable rippleDrawable;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(Color.WHITE), gradientDrawable, null);
        } else {
            rippleDrawable = gradientDrawable; // For devices before Lollipop, use the gradientDrawable directly
        }

        // Wrap the drawable in a LayerDrawable to set padding
        int paddingInDp = 5;
        int paddingInPixels = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                paddingInDp,
                context.getResources().getDisplayMetrics()
        );

        Drawable[] layers = new Drawable[1];
        layers[0] = rippleDrawable;

        LayerDrawable layerDrawable = new LayerDrawable(layers);
        layerDrawable.setLayerInset(0, paddingInPixels, paddingInPixels, paddingInPixels, paddingInPixels);

        return layerDrawable;
    }


    public static Drawable yellow_background(Context context) {
        // Define the corner radius in dp
        float cornerRadiusInDp = 30f;

        // Convert corner radius dp to pixels
        int cornerRadiusInPixels = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                cornerRadiusInDp,
                context.getResources().getDisplayMetrics()
        );

        // Create a GradientDrawable
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(GradientDrawable.RECTANGLE);

        // Set the corner radius
        gradientDrawable.setCornerRadius(cornerRadiusInPixels);

        // Set the background color to yellow
        gradientDrawable.setColor(ColorStateList.valueOf(Color.parseColor("#feef50"))); // Color.YELLOW


        // Create a RippleDrawable (optional, for touch feedback)
        Drawable rippleDrawable;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(Color.parseColor("#DDDDDD")), gradientDrawable, null);
        } else {
            rippleDrawable = gradientDrawable; // For devices before Lollipop, use the gradientDrawable directly
        }


        // Convert padding dp to pixels
        int paddingInDp = 5;
        int padding = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                paddingInDp,
                context.getResources().getDisplayMetrics()
        );

        Drawable[] layers = new Drawable[1];
        layers[0] = rippleDrawable;

        LayerDrawable layerDrawable = new LayerDrawable(layers);
        layerDrawable.setLayerInset(0, padding, padding, padding, padding);

        return layerDrawable;
    }
}
