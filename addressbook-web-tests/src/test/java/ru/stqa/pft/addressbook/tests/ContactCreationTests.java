package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase2 {

    @Test
    public void testContactCreation() {
        initContactCreation();
        fillContactForm(new ContactData("olga", "shahova", "krasnoyarsk", "sonsib@mai.ru"));
        submitContactCreation();
        returnToHomePage();
    }

}
