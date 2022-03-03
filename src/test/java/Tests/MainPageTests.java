package Tests;

import org.junit.Test;
import PageComponenets.MainPageComponents;

public class MainPageTests extends BaseTests{

    MainPageComponents mainPageComponents = new MainPageComponents();


    @Test
    public void helpFormE2ETest(){
        mainPageComponents.fillHelpForm("Ofir","Ofir@gmail.com","0527036811");
    }

}
