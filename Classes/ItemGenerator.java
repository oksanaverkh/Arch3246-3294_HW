package Classes;

public abstract class ItemGenerator {
    /**
    * Openning a new created reward
    */
    public void openReward() {
        IGameItem gameItem = createItem();
        gameItem.open();
    }
    
    /**
     * Abstract method to create new reward. 
     * Method is overriden in classes-inheritors (returns new reward)
     */

    public abstract IGameItem createItem();
}
