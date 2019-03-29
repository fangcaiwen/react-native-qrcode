package com.react_native_qrcode;

import android.app.Activity;
import android.content.Intent;

import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public  class QrcodeModule extends ReactContextBaseJavaModule implements ActivityEventListener {

    private ReactContext mReactContext;

    private Callback mCallBack = null;

    public QrcodeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        reactContext.addActivityEventListener(this);
        mReactContext = reactContext;
    }

    @Override
    public String getName() {
        return "QrcodeModule";
    }

    // 开始扫描
    @ReactMethod
    public void startScan(Callback callback) {
        mCallBack = callback;
        QrHelper qrHelper = new QrHelper(mReactContext.getCurrentActivity());
        qrHelper.startScan();
    }

    @Override
    public void onActivityResult(Activity activity, final int requestCode, final int resultCode, final Intent data) {
        //扫码结果
        IntentResult intentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (intentResult != null) {
            if (intentResult.getContents() == null) {
                //扫码失败
            } else {
                String result = intentResult.getContents();//返回值
                if(mCallBack!=null){
                    mCallBack.invoke(result);
                }
            }
        }
    }

    @Override
    public void onNewIntent(Intent intent) {

    }

}
