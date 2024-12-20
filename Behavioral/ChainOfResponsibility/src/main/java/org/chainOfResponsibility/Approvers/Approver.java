package org.chainOfResponsibility.Approvers;

public abstract class Approver {
    public Approver nextApprover;
    public String role;

    Approver(String role) {
        this.role = role;
    }

    public boolean approve(int amt) {
        if(canApprove(amt)) {
            System.out.println("Amount "+amt+" approved by "+role);
            return true;
        } else if(nextApprover != null) {
            System.out.println(role+ " cannot approve, Sending request to "+nextApprover.getRole());
            return nextApprover.approve(amt);
        } else {
            System.out.println("Sorry !! Request cannot be approved");
            return false;
        }
    }

    public String getRole() {
        return role;
    }

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
  ;  }

    abstract public boolean canApprove(int amt);
}
