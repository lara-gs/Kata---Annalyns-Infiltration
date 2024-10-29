package org.factoriaf5.infiltration;

public class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        // Implement method
        return knightIsAwake == false;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // Implement method
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // Implement method
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
            boolean petDogIsPresent) {
        // Implement method
        if(petDogIsPresent){
            return !archerIsAwake;
        } else {
            return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
        }
    }

}
