package Classes.Rewards.Factories;

import Classes.IGameItem;
import Classes.ItemGenerator;
import Classes.Rewards.Rewards.Bronze;

public class BronzeFactory extends ItemGenerator{

    /**
     * Returns new reward
     */
    @Override
    public IGameItem createItem() {
        return new Bronze();
    }
    
}
