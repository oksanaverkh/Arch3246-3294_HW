package Classes.Rewards.Factories;

import Classes.IGameItem;
import Classes.ItemGenerator;
import Classes.Rewards.Rewards.Silver;

public class SilverFactory extends ItemGenerator{
    /**
     * Returns new reward
     */
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}
