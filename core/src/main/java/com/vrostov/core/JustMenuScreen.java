package com.vrostov.core;

import playn.core.Game;
import playn.core.Platform;
import tripleplay.game.ScreenStack;

public class JustMenuScreen extends ScreenStack.UIScreen{

    public JustMenuScreen(ScreenStack stack) {
        super(JustMEnuJAva.game.plat);
    }

    @Override
    public void wasAdded() {
        super.wasAdded();
    }

    @Override
    public void wasRemoved() {
        super.wasRemoved();
    }

    @Override
    public Game game() {
        return JustMEnuJAva.game;
    }
}
