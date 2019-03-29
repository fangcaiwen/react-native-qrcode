package com.react_native_qrcode;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class QrImageView extends LinearLayout {

    private ImageView mImageView;
    private float scale = 1;

    public QrImageView(Context context) {
        super(context);
    }

    public QrImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.qr_image,this);
        mImageView = (ImageView) view.findViewById(R.id.mImageView);
        scale = context.getResources().getDisplayMetrics().density;
    }

    public QrImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setWidthAndHeight(int size){
        ViewGroup.LayoutParams lp = mImageView.getLayoutParams();
        lp.height = (int) (size*scale);
        lp.width = (int) (size*scale);
        mImageView.setLayoutParams(lp);
    }

    public void setImageBitmap(String mImageSrc){
        mImageView.setImageBitmap(QrHelper.generateBitmap(mImageSrc));
    }


}
