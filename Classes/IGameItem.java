package Classes;

public interface IGameItem {
    /**
     * Abstract method to open new reward. 
     * Method is overriden in classes-inheritors (specifies reward name)
     */
    void open();
}