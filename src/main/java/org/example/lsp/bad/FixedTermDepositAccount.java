package org.example.lsp.bad;

public class FixedTermDepositAccount implements IAccount {

    @Override
    public void deposit(final Double amount) {
        // Deposit to account.
    }

    @Override
    public void withdraw(final Double amount) {
        throw new UnsupportedOperationException("Withdraw not supported for this account type.");
    }
}
