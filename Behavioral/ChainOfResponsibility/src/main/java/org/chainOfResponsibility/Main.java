package org.chainOfResponsibility;

import org.chainOfResponsibility.Approvers.CEO;
import org.chainOfResponsibility.Approvers.Director;
import org.chainOfResponsibility.Approvers.Manager;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();
        Director director = new Director();
        CEO ceo = new CEO();

        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        manager.approve(100);

        manager.approve(9000);

        manager.approve(12000);

        manager.approve(500000);
    }
}