package com.teachmeskills.hw14.exercise01.option02;

class BreakfastRunnable implements Runnable {
    private String name;
    private String actionDescription;
    private int sleepTime;
    private int repetitions;

    public BreakfastRunnable(String name, String actionDescription, int sleepTime, int repetitions) {
        this.name = name;
        this.actionDescription = actionDescription;
        this.sleepTime = sleepTime;
        this.repetitions = repetitions;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.repetitions; i++) {
            System.out.println(this.name + " : " + this.actionDescription);
            try {
                Thread.sleep(this.sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
