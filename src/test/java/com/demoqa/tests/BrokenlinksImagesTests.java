package com.demoqa.tests;

import com.demoqa.pages.BrokenlinksImagesPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenlinksImagesTests extends TestBase{

    @BeforeMethod
    public void preTestMethod(){
        new HomePage(driver).getElements();
        new SidePanel(driver).selectBrokenLinksImages();
    }

    //
    @Test
    public void checkBrokenLinksTest() {
        new BrokenlinksImagesPage(driver).checkBrokenLinks();
    }

    //
    @Test
    public void checkBrokenImagesTest() {
        new BrokenlinksImagesPage(driver).checkBrokenImages();
    }



}//class
