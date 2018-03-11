package io.github.cs451.ge.telegram;


import com.jtelegram.api.events.inline.keyboard.CallbackQueryEvent;
import com.jtelegram.api.menu.MenuButton;
import com.jtelegram.api.user.User;
import io.github.cs451.ge.game.Checkers;
import io.github.cs451.ge.game.CheckersPlayer;
import io.github.cs451.ge.game.PlayerRegistry;

public class DrawButton extends MenuButton {
    private final Checkers checkers;

    public DrawButton(Checkers checkers) {
        this.checkers = checkers;
    }

    @Override
    public String getLabel() {
        return "Draw";
    }

    @Override
    public boolean onPress(CallbackQueryEvent callbackQueryEvent) {
        User user = callbackQueryEvent.getQuery().getFrom();
        CheckersPlayer player = PlayerRegistry.getPlayer(user);

        checkers.getCheckersDrawHandler().call(player);
        return true;
    }
}
