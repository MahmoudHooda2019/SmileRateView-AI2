package me.aemo.smilerateview;

import android.content.Context;
import android.content.res.AssetManager;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.ReplForm;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;

import java.io.*;

public class SmileRateView extends AndroidNonvisibleComponent {

    private ComponentContainer container;
    private SmileView sv;

    private boolean companion;

    public SmileRateView(ComponentContainer container) {
        super(container.$form());
        this.container = container;
        this.companion = form instanceof ReplForm;
    }

    /////////////////////////////////////////////////////////////////////////
    public void CopyFileAsset(String fileName, String dest) throws Exception {
        InputStream stream = null;
        OutputStream output = null;

        stream = openFile(fileName);
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
    public String GetAsdPath() {
        if (!container.$context().getExternalFilesDir(null).exists()) {
            container.$context().getExternalFilesDir(null).mkdirs();
        }
        return container.$context().getExternalFilesDir(null).getAbsolutePath();
    }


    public InputStream openFile(String filename) throws IOException {
        InputStream inputStream = null;
        if (companion) {
            final String pkgName = container.$context().getPackageName();
            final String originalPath = "/storage/emulated/0/Android/data/" + pkgName + "/files/AppInventor/assets/external_comps/" + filename;
            final String assetsPath = "/assets/";

            // Find the last occurrence of the directory separator '/'
            int lastIndex = originalPath.lastIndexOf('/');

            // Extract the file name
            String fileName = originalPath.substring(lastIndex + 1);

            // Extract the directory path before the file name
            String directoryPath = originalPath.substring(0, lastIndex + 1);

            // Create the new path by combining the directory path, "assets", and the file name
            String newPath = directoryPath + assetsPath + fileName;

            inputStream = new FileInputStream(newPath);
        } else {
            final AssetManager am = container.$context().getAssets();
            inputStream = am.open(filename);
        }

        return inputStream;
    }


    private void SetUpAssets() throws Exception {
        if (companion) {
            Copy(GetAsdPath(), "companion");
        } else {
            Copy(GetAsdPath(), "not companion");
        }
    }

    private void Copy(String path, String type) {
        try {
            // dislike assets // 9
            CopyFileAsset("me.aemo.smilerateview/dislike_1.png", path + "/dislike_1.png");
            CopyFileAsset("me.aemo.smilerateview/dislike_2.png", path + "/dislike_2.png");
            CopyFileAsset("me.aemo.smilerateview/dislike_3.png", path + "/dislike_3.png");
            CopyFileAsset("me.aemo.smilerateview/dislike_4.png", path + "/dislike_4.png");
            CopyFileAsset("me.aemo.smilerateview/dislike_5.png", path + "/dislike_5.png");
            CopyFileAsset("me.aemo.smilerateview/dislike_6.png", path + "/dislike_6.png");
            CopyFileAsset("me.aemo.smilerateview/dislike_7.png", path + "/dislike_7.png");
            CopyFileAsset("me.aemo.smilerateview/dislike_8.png", path + "/dislike_8.png");
            CopyFileAsset("me.aemo.smilerateview/dislike_9.png", path + "/dislike_9.png");

            // like assets // 29
            CopyFileAsset("me.aemo.smilerateview/like_1.png", path + "/like_1.png");
            CopyFileAsset("me.aemo.smilerateview/like_2.png", path + "/like_2.png");
            CopyFileAsset("me.aemo.smilerateview/like_2_1.png", path + "/like_2_1.png");
            CopyFileAsset("me.aemo.smilerateview/like_2_2.png", path + "/like_2_2.png");
            CopyFileAsset("me.aemo.smilerateview/like_2_3.png", path + "/like_2_3.png");
            CopyFileAsset("me.aemo.smilerateview/like_3.png", path + "/like_3.png");
            CopyFileAsset("me.aemo.smilerateview/like_3_1.png", path + "/like_3_1.png");
            CopyFileAsset("me.aemo.smilerateview/like_4.png", path + "/like_4.png");
            CopyFileAsset("me.aemo.smilerateview/like_4_1.png", path + "/like_4_1.png");
            CopyFileAsset("me.aemo.smilerateview/like_4_2.png", path + "/like_4_2.png");
            CopyFileAsset("me.aemo.smilerateview/like_4_3.png", path + "/like_4_3.png");
            CopyFileAsset("me.aemo.smilerateview/like_5.png", path + "/like_5.png");
            CopyFileAsset("me.aemo.smilerateview/like_6.png", path + "/like_6.png");
            CopyFileAsset("me.aemo.smilerateview/like_6_1.png", path + "/like_6_1.png");
            CopyFileAsset("me.aemo.smilerateview/like_6_2.png", path + "/like_6_2.png");
            CopyFileAsset("me.aemo.smilerateview/like_6_3.png", path + "/like_6_3.png");
            CopyFileAsset("me.aemo.smilerateview/like_7.png", path + "/like_7.png");
            CopyFileAsset("me.aemo.smilerateview/like_7_1.png", path + "/like_7_1.png");
            CopyFileAsset("me.aemo.smilerateview/like_7_2.png", path + "/like_7_2.png");
            CopyFileAsset("me.aemo.smilerateview/like_7_3.png", path + "/like_7_3.png");
            CopyFileAsset("me.aemo.smilerateview/like_8.png", path + "/like_8.png");
            CopyFileAsset("me.aemo.smilerateview/like_8_1.png", path + "/like_8_1.png");
            CopyFileAsset("me.aemo.smilerateview/like_8_2.png", path + "/like_8_2.png");
            CopyFileAsset("me.aemo.smilerateview/like_8_3.png", path + "/like_8_3.png");
            CopyFileAsset("me.aemo.smilerateview/like_9.png", path + "/like_9.png");
            CopyFileAsset("me.aemo.smilerateview/like_9_1.png", path + "/like_9_1.png");
            CopyFileAsset("me.aemo.smilerateview/like_9_2.png", path + "/like_9_2.png");
            CopyFileAsset("me.aemo.smilerateview/like_9_3.png", path + "/like_9_3.png");
            CopyFileAsset("me.aemo.smilerateview/like_10.png", path + "/like_10.png");
        } catch (Exception e) {
            throw new YailRuntimeError(e.getMessage() + " ~~ " + type, type);
        }

    }


    @SimpleFunction
    public void Initialize(AndroidViewComponent view) throws Exception {
        SetUpAssets();
        sv = new SmileView((Context) container);
        sv.setNum(70, 30);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        // Set the layout rule to align the view to the parent bottom
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        sv.setLayoutParams(layoutParams);


        ViewGroup vg = (ViewGroup) view.getView();
        vg.addView(sv, new ViewGroup.LayoutParams(-1, -1));
    }

    @SimpleFunction
    public void Number(int like, int dislike) {
        sv.setNum(like, dislike);
    }


    @SimpleFunction
    public void NotifyChange() {
        sv.notifyChange();
    }

    @SimpleFunction
    public void AnimBack() {
        sv.animBack();
    }

    @SimpleFunction
    public void BackUp() {
        sv.setBackUp();
    }


    @SimpleProperty
    public void Like(int l) {
        if (sv != null) {
            sv.setLike(l);
        }
    }

    @SimpleProperty
    public void Dislike(int dis) {
        if (sv != null) {
            sv.setDisLike(dis);
        }
    }

    @SimpleProperty
    public void DefaultBottom(int db) {
        if (sv != null) {
            sv.setDefaultBottom(db);
        }
    }

    @SimpleProperty
    public void DefaultGravity(int gravity) {
        if (sv != null) {
            sv.setDefaultGravity(gravity);
        }
    }


    @SimpleProperty
    public void DefaultDislike(String disText) {
        if (sv != null) {
            sv.setDefaultDis(disText);
        }
    }

    @SimpleProperty
    public void DefaultLike(String likeText) {
        if (sv != null) {
            sv.setDefaultLike(likeText);
        }
    }

    @SimpleProperty
    public void DividerMargin(int dm) {
        if (sv != null) {
            sv.setDividerMargin(dm);
        }
    }

    @SimpleProperty
    public void DefaultSize(int ds) {
        if (sv != null) {
            sv.setDefaultSize(ds);
        }
    }

}
