package com.company;

public class Main {


    public static void main(String[] args) {
        växt laura=new palm(5,"Laura");
        växt meatLoaf=new köttätande(0.7,"Meatloaf");
        växt igge=new kaktus(0.2,"Igge");
        växt putte=new palm(1,"Putte");
        //Polymorfism
        System.out.println(meatLoaf.mängd_näring()+"\n"
                + laura.mängd_näring()+"\n"
                +igge.mängd_näring()+"\n"
                +putte.mängd_näring());

    }
}