package Classes.Rewards.Factories;

import Classes.IGameItem;
import Classes.ItemGenerator;
import Classes.Rewards.Rewards.Gold;

public class GoldFactory extends ItemGenerator{

    /**
     * Returns new reward
     */
    @Override
    public IGameItem createItem() {
        return new Gold();
    }
    
}
