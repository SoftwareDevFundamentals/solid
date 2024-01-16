package org.example.lsp.correct;

import java.util.ArrayList;
import java.util.List;

public final class WithdrawProgram {

    private static final double AMOUNT_TO_WITHDRAW = 100.0;

    private WithdrawProgram() {
        // Default constructor.
    }

    public static void main(final String[] args) {
        // Creates a list of accounts.
        List<IWithDrawableAccount> accounts = new ArrayList<>();

        // Since fixed term deposit account does not support withdraw actions, the current implementation  is
        // breaking the LSP, it's necessary to re-design the abstraction classes.
        accounts.add(new SavingAccount());
        //accounts.add(new FixedTermDepositAccount());
        accounts.add(new CurrentAccount());

        // Loops over the accounts to perform a withdrawal action.
        for (IWithDrawableAccount account : accounts) {
            account.withDraw(AMOUNT_TO_WITHDRAW);
        }
    }
}
