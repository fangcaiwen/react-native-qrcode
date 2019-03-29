package com.react_native_qrcode;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class QrImageViewManager extends SimpleViewManager<QrImageView> {

    private static final String QRIMAGEVIEW = "QrImageView";

    @Override
    public String getName() {
        return QRIMAGEVIEW;
    }

    @Override
    protected QrImageView createViewInstance(ThemedReactContext reactContext) {
        QrImageView  mImageView = new QrImageView(reactContext,null);
        return mImageView;
    }


    @ReactProp(name = "size")
    public void setWidthAndHeight(final QrImageView mImageView, final int size){
        mImageView.setWidthAndHeight(size);
    }

    @ReactProp(name = "imageSrc")
    public void setImageSrc(final QrImageView mImageView, final String mImageSrc){
        mImageView.setImageBitmap(mImageSrc);
    }
}
