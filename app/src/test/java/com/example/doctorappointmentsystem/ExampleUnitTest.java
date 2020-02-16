package com.example.doctorappointmentsystem;

import com.example.doctorappointmentsystem.activity.bll.DoctorBLL;
import com.example.doctorappointmentsystem.activity.bll.LoginBLL;
import com.example.doctorappointmentsystem.activity.bll.SignupBLL;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }


    @Test

    public void login() {
         LoginBLL loginBLL = new LoginBLL();
        boolean result = loginBLL.login("xettri", "1234");
        assertEquals(true, result);
    }

@Test
    public void loginFail() {
        LoginBLL loginBLL = new LoginBLL();
        boolean result = loginBLL.login("bibekxettri", "123");
        assertEquals(false, result);
    }


    @Test
    public void signup() {
        SignupBLL signupBLL = new SignupBLL();
        boolean result = signupBLL.login("bibekxettri@gmail.com", "bibekdahal", "dahal", "12345", "bibek", "kathmandu", "bibek.png");
        assertEquals(true, result);
    }


    @Test
    public void Doctorlogin() {
        DoctorBLL doctorBLL = new DoctorBLL();
        boolean result = doctorBLL.login("doc1", "1234");
        assertEquals(true, result);
    }

    @Test
    public void DoctorloginFail() {
        DoctorBLL doctorBLL = new DoctorBLL();
        boolean result = doctorBLL.login("bibekxettri", "123");
        assertEquals(false, result);
    }




}
