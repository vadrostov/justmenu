package com.vrostov.java;

import playn.java.JavaPlatform;
import playn.java.LWJGLPlatform;

import com.vrostov.core.JustMEnuJAva;

public class JustMEnuJAvaJava {

  public static void main (String[] args) {
    LWJGLPlatform.Config config = new LWJGLPlatform.Config();
    config.width=800;
    config.height=600;
    JavaPlatform plat = new LWJGLPlatform(config);

    new JustMEnuJAva(plat);
    plat.start();
  }
}
