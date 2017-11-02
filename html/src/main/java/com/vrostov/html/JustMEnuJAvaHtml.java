package com.vrostov.html;

import com.google.gwt.core.client.EntryPoint;
import playn.html.HtmlPlatform;
import com.vrostov.core.JustMEnuJAva;

public class JustMEnuJAvaHtml implements EntryPoint {

  @Override public void onModuleLoad () {
    HtmlPlatform.Config config = new HtmlPlatform.Config();
    // use config to customize the HTML platform, if needed
    HtmlPlatform plat = new HtmlPlatform(config);
    plat.assets().setPathPrefix("justmenu/");
    new JustMEnuJAva(plat);
    plat.start();
  }
}
