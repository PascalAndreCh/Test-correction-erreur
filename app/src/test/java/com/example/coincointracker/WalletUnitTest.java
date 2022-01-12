package com.example.coincointracker;

import org.junit.Test;

import static org.junit.Assert.*;
import com.example.coincointracker.controller.AuthActivity;
import com.example.coincointracker.model.Wallet;
import static org.mockito.Mockito.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class WalletUnitTest {
    @Test
    public void testWalletIsCreated() throws Exception {
        Wallet wallet = new Wallet(42);
        assertEquals(42, wallet.getBalance(), 0.001);
    }

    @Test
    public void testDepositMonney() throws Exception {
        Wallet wallet = new Wallet(5);
        wallet.deposit(10);
        assertEquals(15, wallet.getBalance(), 0.001);
    }

    @Test
    public void withdrawMonney() throws Exception {
        Wallet wallet = new Wallet (40);
        wallet.withdraw(10);
        assertEquals(30, wallet.getBalance(), 0.001);
    }

    @Test
    public void testWalletContent() {
        AuthActivity authActivity = mock(AuthActivity.class);
        when(authActivity.getUserToken()).thenReturn("FakeToken");
        String token = authActivity.getUserToken();
    }

}

