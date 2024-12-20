package org.chainOfResponsibility.Approvers;

public class Director extends Approver {
    final int limit = 10000;

    public Director() {
        super("Director");
    }


    @Override
    public boolean canApprove(int amt) {
        return amt <= limit;
    }
}
