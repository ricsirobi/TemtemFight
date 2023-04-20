package Models;

public class GamePlay {
    private Player player1;
    private Player player2;
    private boolean gameRunning;

    public GamePlay(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.gameRunning = true;
    }

    public void runGame() {
        while (gameRunning) {
            // Kérjük be mindkét játékostól az Action-t
            Action player1Action = getPlayerAction(player1);
            Action player2Action = getPlayerAction(player2);

            // Végrehajtjuk az Action-t mindkét Temtem-en
            player1Action.execute();
            player2Action.execute();

            // Ellenőrizzük, hogy mindkét játékosnak van-e még élő Temtem-je
            if (!player1.hasLiveTemtem() || !player2.hasLiveTemtem()) {
                gameRunning = false;
                break;
            }
        }

        // Kiírjuk a győztest
        if (player1.hasLiveTemtem()) {
            System.out.println("Player 1 won!");
        } else {
            System.out.println("Player 2 won!");
        }
    }

    private Action getPlayerAction(Player player) {
        // Kérjük be az Action-t
        // ...

        // Hozzuk létre az Action-t
        Action action = new Action(player.getSelectedTemtem(), ActionType.ATTACK, player.getSelectedTemtem().getAbilities().get(0));

        return action;
    }
}
