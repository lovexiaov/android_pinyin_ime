package com.android.inputmethod.pinyin.skb;

import android.graphics.drawable.Drawable;

public class SoftKeyType {
  public static final int KEYTYPE_ID_NORMAL_KEY = 0;

  public int mKeyTypeId;
  public Drawable mKeyBg;
  public Drawable mKeyHlBg;
  public int mColor;
  public int mColorHl;
  public int mColorBalloon;

  SoftKeyType(int id, Drawable bg, Drawable hlBg) {
    mKeyTypeId = id;
    mKeyBg = bg;
    mKeyHlBg = hlBg;
  }

  public void setColors(int color, int colorHl, int colorBalloon) {
    mColor = color;
    mColorHl = colorHl;
    mColorBalloon = colorBalloon;
  }
}
