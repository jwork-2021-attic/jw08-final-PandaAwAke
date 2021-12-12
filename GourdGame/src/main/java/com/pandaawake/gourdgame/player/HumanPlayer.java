package com.pandaawake.gourdgame.player;

import com.pandaawake.gourdgame.Config;
import com.pandaawake.gourdgame.sprites.Bomb;
import com.pandaawake.gourdgame.sprites.Calabash;
import com.pandaawake.gourdgame.utils.Direction;

public class HumanPlayer extends Player {

    public HumanPlayer(Calabash calabash, int id, String name) {
        super(calabash, id, name);
    }

    public Calabash getCalabash() {
        return (Calabash) sprite;
    }

    @Override
    public void OnUpdate(float timestep) {
        if (Config.ReplayMode) {
            return;
        }
    }

    @Override
    public void doMove(Direction direction) {
        sprite.doMove(direction);
    }

    @Override
    public void setBomb() {
        sprite.setNewBomb();
    }

    @Override
    public void explodeBomb() {
        for (Bomb bomb : sprite.getBombs()) {
            bomb.setExplodeImmediately();
        }
    }
}
