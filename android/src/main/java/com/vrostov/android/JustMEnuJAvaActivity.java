package com.vrostov.android;

import playn.android.GameActivity;

import com.vrostov.core.JustMEnuJAva;

public class JustMEnuJAvaActivity extends GameActivity {

  @Override public void main () {
    new JustMEnuJAva(platform());
  }
}
