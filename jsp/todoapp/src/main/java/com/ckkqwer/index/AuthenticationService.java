package com.ckkqwer.index;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService
{
    public boolean authenticate(String username, String password)
    {
        //name: false if
        //<3 char
        //
        //pw: false if
        //<6 char
        boolean pass = true;
        if (username.length() < 3)
            pass = false;

        if (password.length() < 6)
            pass = false;

        return pass;
    }
}
