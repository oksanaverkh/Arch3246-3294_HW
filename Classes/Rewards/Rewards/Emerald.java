package Classes.Rewards.Rewards;

import Classes.IGameItem;

public class Emerald implements IGameItem{
    /**
    * Displays a reward name
    */
    @Override
    public void open() {
        System.out.println("Emerald");
    }
}
