package com.qltc.quanlitieccuoi.utils;

import com.qltc.quanlitieccuoi.constants.MyConstants;
import com.qltc.quanlitieccuoi.domains.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class AuthenticationUtils {
    public static boolean middleWare(HttpServletRequest request){
        HttpSession session = request.getSession();
        User userAdmin = (User)session.getAttribute(MyConstants.SESSION_USER);
        if(userAdmin == null) {
            return false;
        }else {
            return true;
        }
    }

}
