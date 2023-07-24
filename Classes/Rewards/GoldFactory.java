package Classes.Rewards;

import Classes.IGameItem;
import Classes.ItemGenerator;

public class GoldFactory extends ItemGenerator{

    @Override
    public IGameItem createItem() {
        return new Gold();
    }
    
}
