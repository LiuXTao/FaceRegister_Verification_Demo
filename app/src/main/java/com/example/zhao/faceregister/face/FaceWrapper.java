package com.example.zhao.faceregister.face;

import android.graphics.Bitmap;

import org.opencv.core.Rect;

public class FaceWrapper {
    public Bitmap faceBitmap;
    public Rect faceRect;

    public FaceWrapper(Bitmap faceBitmap, Rect faceRect) {
        this.faceBitmap = faceBitmap;
        this.faceRect = faceRect;
    }

    public Bitmap getFaceBitmap() {
        return faceBitmap;
    }

    public Rect getFaceRect() {
        return faceRect;
    }
}
