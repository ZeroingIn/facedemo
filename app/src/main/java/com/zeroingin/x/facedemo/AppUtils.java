package com.zeroingin.x.facedemo;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

import java.util.List;

/**
 * Created by 清蒸小沐 on 2017/10/4.
 */

public class AppUtils {

    /**
     * 判断某个意图是否存在
     */
    public static boolean isHaveCame(String intentName) {
        PackageManager packageManager = Application.mContext.getPackageManager();
        Intent intent = new Intent(intentName);
        List<ResolveInfo> list = packageManager.queryIntentActivities(intent, PackageManager.MATCH_DEFAULT_ONLY);
        return list.size() > 0;
    }
}
