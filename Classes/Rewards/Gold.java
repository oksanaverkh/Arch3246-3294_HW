package Classes.Rewards;

import Classes.IGameItem;

public class Gold implements IGameItem{

    @Override
    public void open() {
        System.out.println("Gold");
    }
    
}
