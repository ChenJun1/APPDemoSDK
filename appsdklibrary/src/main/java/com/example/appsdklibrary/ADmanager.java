package com.example.appsdklibrary;

public class ADmanager {
    private static ADmanager aDmanager = new ADmanager();

    public static ADmanager getInstance() {
        return aDmanager;
    }

    private double getAdcout() {
        return 2;
    }
}
