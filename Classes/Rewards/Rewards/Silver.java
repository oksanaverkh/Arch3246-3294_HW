package Classes.Rewards.Rewards;

import Classes.IGameItem;

public class Silver implements IGameItem{
    /**
    * Displays a reward name
    */
    @Override
    public void open() {
        System.out.println("Silver");
    }
}
