package arcmonitizeads;

import android.util.Log;

import com.arcadio.arcmonitizeadsmodule.BuildConfig;


public class VLog {

    public static void w(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.w(tag, msg);
        }

    }

    public static void w(String msg) {
        if (BuildConfig.DEBUG){
            Log.w("arcmonitizelog ", msg);
        }

    }
}
