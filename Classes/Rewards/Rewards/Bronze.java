package Classes.Rewards.Rewards;

import Classes.IGameItem;

public class Bronze implements IGameItem{

    /**
    * Displays a reward name
    */
    @Override
    public void open() {
        System.out.println("Bronze");
    }
    
}
