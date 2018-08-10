package Tests;

import Help.BaseTest;
import Help.HelperMethods;
import Screens.TransilvanicaHomepage;
import org.junit.Before;
import org.junit.Test;

public class Tests extends BaseTest {
    public HelperMethods functions;

    @Before
    public void initiate() {
        functions = new HelperMethods(driver);
    }

    @Test
    public void doneazaCuCardBancar() {
        TransilvanicaHomepage homepage = new TransilvanicaHomepage(driver);
        homepage.goToDoneazaSumaPage()
                .goToFormPage()
                .nrSumCheckboxes()
                .fillFormCardBancar();
    }
    @Test
    public void doneazaCuPaypal(){
        TransilvanicaHomepage homepage = new TransilvanicaHomepage(driver);
        homepage.goToDoneazaSumaPage()
                .goToFormPage()
                .nrSumCheckboxes()
                .fillFormPaypal();

    }
    @Test
    public void achizitioneazaBornacCuCardBancar(){
        TransilvanicaHomepage homepage = new TransilvanicaHomepage(driver);
        homepage.goToDoneazaSumaPage()
                .goToBornaPage()
                .completeazaCampuriCardBancar( );
    }
    @Test
    public void achizitioneazaBornacuPaypal(){
        TransilvanicaHomepage homepage = new TransilvanicaHomepage(driver);
        homepage.goToDoneazaSumaPage()
                .goToBornaPage()
                .completeazaCampuricuPaypal();
    }
}
