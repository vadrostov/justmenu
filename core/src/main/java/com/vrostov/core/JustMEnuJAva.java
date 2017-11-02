package com.vrostov.core;

import playn.core.Image;
import playn.core.Platform;
import playn.scene.ImageLayer;
import playn.scene.Pointer;
import playn.scene.SceneGame;
import tripleplay.game.ScreenStack;

public class JustMEnuJAva extends SceneGame {


  public static SceneGame game;

  public final ScreenStack screenStack=new ScreenStack(this,rootLayer);


  public JustMEnuJAva (Platform plat) {
    super(plat, 33); // update our "simulation" 33ms (30 times per second)
    game=this;
    new Pointer(plat, rootLayer, true);
    screenStack.push(new JustMenuScreen());

  }
}
