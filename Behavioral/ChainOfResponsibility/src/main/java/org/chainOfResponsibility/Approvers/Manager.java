package org.chainOfResponsibility.Approvers;

public class Manager extends Approver {
    final int limit = 5000;

    public Manager() {
        super("Manager");
    }

    @Override
    public boolean canApprove(int amt) {
        return amt <= limit;
    }
}
