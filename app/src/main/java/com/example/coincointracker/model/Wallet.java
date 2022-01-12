package com.example.coincointracker.model;


public class Wallet {
    private double mSomme;
    private static final double MAX = 60;

    public Wallet(double mMontant) {
        mSomme = mMontant;
    }

    public double getBalance() {
        return mSomme;
    }

    public void deposit(double mAjout) throws Exception {
        if ((mSomme + mAjout) > MAX) {
            throw new Exception("Pas assez de place dans le porte-monnaie");
        }
        mSomme = mSomme + mAjout;
    }

    public void withdraw(double mRetrait) throws Exception {
        if (mRetrait > mSomme) {
            throw new Exception("Pas assez de sous");
        }
        mSomme = mSomme - mRetrait;
    }
}
