package Classes.Rewards.Rewards;

import Classes.IGameItem;

public class Gold implements IGameItem {

    /**
    * Displays a reward name
    */
    @Override
    public void open() {
        System.out.println("Gold");
    }

}
