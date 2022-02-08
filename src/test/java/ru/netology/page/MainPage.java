package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    private SelenideElement buttonBuy = $$(".button").find(exactText("Купить"));
    private SelenideElement buttonBuyByCredit = $$(".button").find(exactText("Купить в кредит"));


    public PaymentPage buyWithoutCredit() {
        buttonBuy.click();
        return new PaymentPage();
    }

    public PaymentPage buyWithCredit() {
        buttonBuyByCredit.click();
        return new PaymentPage();
    }
}
