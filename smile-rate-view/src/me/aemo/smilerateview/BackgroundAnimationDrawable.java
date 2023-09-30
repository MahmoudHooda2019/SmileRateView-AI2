package me.aemo.smilerateview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BackgroundAnimationDrawable {

    private static Context mcontext;

    public static Drawable animation_dislike(Context context) throws Exception {
        mcontext = context;
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.setOneShot(true);

//        CopyFileAsset("me.aemo.smilerateview/dislike_1.png", GetAsdPath() + "/dislike_1.png");
//        CopyFileAsset("me.aemo.smilerateview/dislike_2.png", GetAsdPath() + "/dislike_2.png");
//        CopyFileAsset("me.aemo.smilerateview/dislike_3.png", GetAsdPath() + "/dislike_3.png");
//        CopyFileAsset("me.aemo.smilerateview/dislike_4.png", GetAsdPath() + "/dislike_4.png");
//        CopyFileAsset("me.aemo.smilerateview/dislike_5.png", GetAsdPath() + "/dislike_5.png");
//        CopyFileAsset("me.aemo.smilerateview/dislike_6.png", GetAsdPath() + "/dislike_6.png");
//        CopyFileAsset("me.aemo.smilerateview/dislike_7.png", GetAsdPath() + "/dislike_7.png");
//        CopyFileAsset("me.aemo.smilerateview/dislike_8.png", GetAsdPath() + "/dislike_8.png");
//        CopyFileAsset("me.aemo.smilerateview/dislike_9.png", GetAsdPath() + "/dislike_9.png");

        // Drawables
        Drawable dislike_1 = decodeFile(GetAsdPath() + "/dislike_1.png");
        Drawable dislike_2 = decodeFile(GetAsdPath() + "/dislike_2.png");
        Drawable dislike_3 = decodeFile(GetAsdPath() + "/dislike_3.png");
        Drawable dislike_4 = decodeFile(GetAsdPath() + "/dislike_4.png");
        Drawable dislike_5 = decodeFile(GetAsdPath() + "/dislike_5.png");
        Drawable dislike_6 = decodeFile(GetAsdPath() + "/dislike_6.png");
        Drawable dislike_7 = decodeFile(GetAsdPath() + "/dislike_7.png");
        Drawable dislike_8 = decodeFile(GetAsdPath() + "/dislike_8.png");
        Drawable dislike_9 = decodeFile(GetAsdPath() + "/dislike_9.png");


        // 9 frame
        animationDrawable.addFrame(dislike_1, 30);
        animationDrawable.addFrame(dislike_2, 30);
        animationDrawable.addFrame(dislike_3, 30);
        animationDrawable.addFrame(dislike_4, 30);
        animationDrawable.addFrame(dislike_5, 30);
        animationDrawable.addFrame(dislike_6, 30);
        animationDrawable.addFrame(dislike_7, 30);
        animationDrawable.addFrame(dislike_8, 30);
        animationDrawable.addFrame(dislike_9, 30);

        return animationDrawable;
    }

    public static Drawable animation_like(Context context) throws Exception {
        mcontext = context;
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.setOneShot(true);


//        CopyFileAsset("me.aemo.smilerateview/like_1.png", GetAsdPath() + "/like_1.png");
//        CopyFileAsset("me.aemo.smilerateview/like_2.png", GetAsdPath() + "/like_2.png");
//        CopyFileAsset("me.aemo.smilerateview/like_2_1.png", GetAsdPath() + "/like_2_1.png");
//        CopyFileAsset("me.aemo.smilerateview/like_2_2.png", GetAsdPath() + "/like_2_2.png");
//        CopyFileAsset("me.aemo.smilerateview/like_2_3.png", GetAsdPath() + "/like_2_3.png");
//        CopyFileAsset("me.aemo.smilerateview/like_3.png", GetAsdPath() + "/like_3.png");
//        CopyFileAsset("me.aemo.smilerateview/like_3_1.png", GetAsdPath() + "/like_3_1.png");
//        CopyFileAsset("me.aemo.smilerateview/like_4.png", GetAsdPath() + "/like_4.png");
//        CopyFileAsset("me.aemo.smilerateview/like_4_1.png", GetAsdPath() + "/like_4_1.png");
//        CopyFileAsset("me.aemo.smilerateview/like_4_2.png", GetAsdPath() + "/like_4_2.png");
//        CopyFileAsset("me.aemo.smilerateview/like_4_3.png", GetAsdPath() + "/like_4_3.png");
//        CopyFileAsset("me.aemo.smilerateview/like_5.png", GetAsdPath() + "/like_5.png");
//        CopyFileAsset("me.aemo.smilerateview/like_6.png", GetAsdPath() + "/like_6.png");
//        CopyFileAsset("me.aemo.smilerateview/like_6_1.png", GetAsdPath() + "/like_6_1.png");
//        CopyFileAsset("me.aemo.smilerateview/like_6_2.png", GetAsdPath() + "/like_6_2.png");
//        CopyFileAsset("me.aemo.smilerateview/like_6_3.png", GetAsdPath() + "/like_6_3.png");
//        CopyFileAsset("me.aemo.smilerateview/like_7.png", GetAsdPath() + "/like_7.png");
//        CopyFileAsset("me.aemo.smilerateview/like_7_1.png", GetAsdPath() + "/like_7_1.png");
//        CopyFileAsset("me.aemo.smilerateview/like_7_2.png", GetAsdPath() + "/like_7_2.png");
//        CopyFileAsset("me.aemo.smilerateview/like_7_3.png", GetAsdPath() + "/like_7_3.png");
//        CopyFileAsset("me.aemo.smilerateview/like_8.png", GetAsdPath() + "/like_8.png");
//        CopyFileAsset("me.aemo.smilerateview/like_8_1.png", GetAsdPath() + "/like_8_1.png");
//        CopyFileAsset("me.aemo.smilerateview/like_8_2.png", GetAsdPath() + "/like_8_2.png");
//        CopyFileAsset("me.aemo.smilerateview/like_8_3.png", GetAsdPath() + "/like_8_3.png");
//        CopyFileAsset("me.aemo.smilerateview/like_9.png", GetAsdPath() + "/like_9.png");
//        CopyFileAsset("me.aemo.smilerateview/like_9_1.png", GetAsdPath() + "/like_9_1.png");
//        CopyFileAsset("me.aemo.smilerateview/like_9_2.png", GetAsdPath() + "/like_9_2.png");
//        CopyFileAsset("me.aemo.smilerateview/like_9_3.png", GetAsdPath() + "/like_9_3.png");
//        CopyFileAsset("me.aemo.smilerateview/like_10.png", GetAsdPath() + "/like_10.png");

        // Drawables
        Drawable like_1 = decodeFile(GetAsdPath()   + "/like_1.png");
        Drawable like_2 = decodeFile(GetAsdPath()   + "/like_2.png");
        Drawable like_2_1 = decodeFile(GetAsdPath() + "/like_2_1.png");
        Drawable like_2_2 = decodeFile(GetAsdPath() + "/like_2_2.png");
        Drawable like_2_3 = decodeFile(GetAsdPath() + "/like_2_3.png");
        Drawable like_3 = decodeFile(GetAsdPath()   + "/like_3.png");
        Drawable like_3_1 = decodeFile(GetAsdPath() + "/like_3_1.png");
        Drawable like_4 = decodeFile(GetAsdPath()   + "/like_4.png");
        Drawable like_4_1 = decodeFile(GetAsdPath() + "/like_4_1.png");
        Drawable like_4_2 = decodeFile(GetAsdPath() + "/like_4_2.png");
        Drawable like_4_3 = decodeFile(GetAsdPath() + "/like_4_3.png");
        Drawable like_5 = decodeFile(GetAsdPath()   + "/like_5.png");
        Drawable like_6 = decodeFile(GetAsdPath()   + "/like_6.png");
        Drawable like_6_1 = decodeFile(GetAsdPath() + "/like_6_1.png");
        Drawable like_6_2 = decodeFile(GetAsdPath() + "/like_6_2.png");
        Drawable like_6_3 = decodeFile(GetAsdPath() + "/like_6_3.png");
        Drawable like_7 = decodeFile(GetAsdPath()   + "/like_7.png");
        Drawable like_7_1 = decodeFile(GetAsdPath() + "/like_7_1.png");
        Drawable like_7_2 = decodeFile(GetAsdPath() + "/like_7_2.png");
        Drawable like_7_3 = decodeFile(GetAsdPath() + "/like_7_3.png");
        Drawable like_8 = decodeFile(GetAsdPath()   + "/like_8.png");
        Drawable like_8_1 = decodeFile(GetAsdPath() + "/like_8_1.png");
        Drawable like_8_2 = decodeFile(GetAsdPath() + "/like_8_2.png");
        Drawable like_8_3 = decodeFile(GetAsdPath() + "/like_8_3.png");
        Drawable like_9 = decodeFile(GetAsdPath()   + "/like_9.png");
        Drawable like_9_1 = decodeFile(GetAsdPath() + "/like_9_1.png");
        Drawable like_9_2 = decodeFile(GetAsdPath() + "/like_9_2.png");
        Drawable like_9_3 = decodeFile(GetAsdPath() + "/like_9_3.png");
        Drawable like_10 = decodeFile(GetAsdPath()  + "/like_10.png");

        // 29 frame
        animationDrawable.addFrame(like_1, 30);
        animationDrawable.addFrame(like_2, 30);
        animationDrawable.addFrame(like_2_1, 30);
        animationDrawable.addFrame(like_2_2, 30);
        animationDrawable.addFrame(like_2_3, 30);
        animationDrawable.addFrame(like_3, 30);
        animationDrawable.addFrame(like_3_1, 30);
        animationDrawable.addFrame(like_4, 30);
        animationDrawable.addFrame(like_4_1, 30);
        animationDrawable.addFrame(like_4_2, 30);
        animationDrawable.addFrame(like_4_3, 30);
        animationDrawable.addFrame(like_5, 30);
        animationDrawable.addFrame(like_6, 30);
        animationDrawable.addFrame(like_6_1, 30);
        animationDrawable.addFrame(like_6_2, 30);
        animationDrawable.addFrame(like_6_3, 30);
        animationDrawable.addFrame(like_7, 30);
        animationDrawable.addFrame(like_7_1, 30);
        animationDrawable.addFrame(like_7_2, 30);
        animationDrawable.addFrame(like_7_3, 30);
        animationDrawable.addFrame(like_8, 30);
        animationDrawable.addFrame(like_8_1, 30);
        animationDrawable.addFrame(like_8_2, 30);
        animationDrawable.addFrame(like_8_3, 30);
        animationDrawable.addFrame(like_9, 30);
        animationDrawable.addFrame(like_9_1, 30);
        animationDrawable.addFrame(like_9_2, 30);
        animationDrawable.addFrame(like_9_3, 30);
        animationDrawable.addFrame(like_10, 30);

        return animationDrawable;
    }

    // Drawable decode file
    public static Drawable decodeFile(String filePath) {
        // Decode the file into a Bitmap
        Bitmap bitmap = BitmapFactory.decodeFile(filePath);

        if (bitmap != null) {
            // Convert the Bitmap into a Drawable
            return new BitmapDrawable(mcontext.getResources(), bitmap);
        } else {
            return null;
        }
    }




    /////////////////////////////////////////////////////////////////////////
    public static void CopyFileAsset(String fileName, String dest) throws Exception {
        InputStream stream = null;
        OutputStream output = null;

        stream = mcontext.getAssets().open(fileName);
        output = new BufferedOutputStream(new FileOutputStream(dest));

        byte data[] = new byte[1024];
        int count;

        while ((count = stream.read(data)) != -1) {
            output.write(data, 0, count);
        }

        output.close();
        stream.close();
    }

    //////////////////////////////// GET ASD PATH ///////////
    // https://www.programcreek.com/java-api-examples/?class=android.content.Context&method=getExternalFilesDir
    public static String GetAsdPath() {
        if (!mcontext.getExternalFilesDir(null).exists()) {
            mcontext.getExternalFilesDir(null).mkdirs();
        }
        return mcontext.getExternalFilesDir(null).getAbsolutePath();
    }


}
