import javakarol.Roboter;
import javakarol.Welt;

/**
 * Die Klasse RoboAufgabe
 */
public class RoboSteuerung extends Thread
{
    // Attribute
    private Roboter robo;

    // Konstruktor
    public RoboSteuerung(Roboter robo_)
    {
        robo = robo_;
    }

    // Methoden
    // Roboter läuft bis zur Wand und denkt manchmal nach
    public void run()
    {
       tanzen();
    }
    
    public void tanzen()
    {
        while(true)
        {
            vorsichtigerSchritt();
            robo.RechtsDrehen();
            robo.RechtsDrehen();
        }
    }
    
    public void vorsichtigerSchritt()
    {
        if(!robo.IstRoboter() && !robo.IstWand())
        {
            robo.Schritt();
        }
    }
}
