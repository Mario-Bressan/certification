package com.bressan.inheritance.interfaces.casting;

class Employee {}

interface Interviewer {
    public void conductInterview();
}

class HRExecutive extends Employee implements Interviewer {
    String[] specialization;
    public void conductInterview(){
        System.out.println("HRExecutive - conducting interview");
    }
}

class Manager implements Interviewer {
    int teamSize;
    public void conductInterview() {
        System.out.println("Manager - conducting interview");
    }
}

class OfficeWhyCasting {
    public static void main(String[] args) {
        Interviewer[] interviewers = new Interviewer[2];
        interviewers[0] = new Manager();
        interviewers[1] = new HRExecutive();
        for(Interviewer interviewer : interviewers) {
            if (interviewer instanceof  Manager) {
                int teamSize = ((Manager)interviewer).teamSize;
                if (teamSize > 10) {
                    interviewer.conductInterview();
                } else {
                    System.out.println("Mgr can't " +
                            "interview with team size less than 10");
                }
            } else if (interviewer instanceof HRExecutive) {
                interviewer.conductInterview();
            }
        }
    }
}
