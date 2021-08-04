package com.kodilla.homework;

public class CashMachine {
    private int[] zrealizowaneTransakcje;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.zrealizowaneTransakcje = new int[0];
    }

    public void add(int transakcje) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transakcje, 0, newTab, 0, zrealizowaneTransakcje.length);
        newTab[this.size - 1] = transakcje;
        this.zrealizowaneTransakcje = newTab;
    }
    public int[] getZrealizowaneTransakcje() {
        return zrealizowaneTransakcje;
    }
}
