package org.chainOfResponsibility.Approvers;

public class CEO extends Approver {
    final int limit = 20000;

    public CEO() {
        super("CEO");
    }


    @Override
    public boolean canApprove(int amt) {
        return amt <= limit;
    }
}
