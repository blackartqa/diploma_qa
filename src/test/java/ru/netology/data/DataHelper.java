package ru.netology.data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataHelper {
    private static Faker faker = new Faker(new Locale("en"));

    private DataHelper() {
    }

    public static String getFirstCardNumber() {
        return "4444 4444 4444 4441";
    }

    public static String getFirstCardExpectedStatus() {
        return "APPROVED";
    }

    public static String getSecondCardNumber() {
        return "4444 4444 4444 4442";
    }

    public static String getSecondCardExpectedStatus() {
        return "DECLINED";
    }

    public static String getCardNumberDifferent() {
        return faker.business().creditCardNumber();
    }

    public static String getCardNumberEmpty() {
        return "";
    }

    public static String getValidMonth() {
        return "03";
    }

    public static String getInvalidMonth() {
        return "23";
    }

    public static String getEmptyMonth() {
        return "";
    }

    public static String getWrongMonth() {
        return "00";
    }

    public static String getValidYear() {
        return "25";
    }

    public static String getInvalidYear() {
        return "20";
    }

    public static String getEmptyYear() {
        return "";
    }

    public static String getValidOwner() {
        return faker.name().fullName();
    }

    public static String getInvalidOwner() {
        return "AR67&^ Cher768%^&";
    }
    public static String getCyrillicOwner() {
        return "Артем Чернышов";
    }

    public static String getEmptyOwner() {
        return "";
    }

    public static String getValidCvc() {
        return "987";
    }

    public static String getInvalidCvc() {
        return "0";
    }

    public static String getEmptyCvc() {
        return "";
    }
    public static String getZeroCvc() {
        return "000";
    }
}
