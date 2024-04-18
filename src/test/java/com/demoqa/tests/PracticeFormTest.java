package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm();
    }

    @Test
    public void createStudentAccountTest() {
        new PracticeFormPage(driver).hideIframes();//убирает рекламу
        //enter personal data
        new PracticeFormPage(driver)
                .enterPersonalData("Jack", "Sparrow", "jack@gm.com", "1234567890")
                //select gender(radio button) //выбираем тока 1 кнопку из вариантов
                .selectGender("Male")
                //enter birthday
                .enterBirthDay("16 August 1987")
                //enter subjects
                .enterSubjects(new String[]{"Maths", "Chemistry"})
                //select hobby(check box) // выбираем от 1 до 3 кнопки из вариантов
                .selectHobby(new String[]{"Sport", "Reading"})
                .uploadFile("C:/Tools/MyLogo_3.jpg")
                //select state
                .selectState("NCR")
                //select city
                .selectCity("Delhi")
                //click on submit button
                .clickOnSubmit()
                //assert student form is appears
                .verifySuccessTitle("Thanks for submitting the form");
    }


}//class
