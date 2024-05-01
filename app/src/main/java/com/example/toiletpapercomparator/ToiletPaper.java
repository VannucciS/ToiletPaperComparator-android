package com.example.toiletpapercomparator;

public class ToiletPaper {

    String name;
    int rolls, ply, sheets;
    Double eachSheetWidth, eachSheetHeight, price;


    public double CalculatePaperPrice(){
        return rolls * ply * sheets * price * eachSheetHeight * eachSheetWidth;
    }

}
