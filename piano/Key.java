import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String Keys;
    private String sound;
    private String upKey;
    private String downKey;
    /**
     * Do the action for this key.
     */
    public void act()
    {
        if ( !isDown && Greenfoot.isKeyDown(Keys))
        {
            setImage (downKey);
            isDown = true;
            play();
        }
        if ( isDown && !Greenfoot.isKeyDown(Keys))
        {
            setImage (upKey);
            isDown = false;
        }
    }
    
    /**
     * Play the note of this key.
     */
    public void play()
    {
        Greenfoot.playSound(sound);
    }
    
    /**
     * Create a new key linked to a givien keyboard key,
     * and with a given sound
     */
    public Key(String keyName, String soundFile, String upImage, String downImage)
    {
        Keys = keyName;
        sound = soundFile;
        upKey = upImage;
        downKey = downImage;
        setImage(upImage);
    }
}