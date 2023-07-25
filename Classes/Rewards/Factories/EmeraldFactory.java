package Classes.Rewards.Factories;

import Classes.IGameItem;
import Classes.ItemGenerator;
import Classes.Rewards.Rewards.Emerald;

public class EmeraldFactory extends ItemGenerator{
    
    /**
     * Returns new reward
     */
    @Override
    public IGameItem createItem() {
        return new Emerald();
    }
}
