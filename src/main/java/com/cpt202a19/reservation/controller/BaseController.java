package com.cpt202a19.reservation.controller;

import com.cpt202a19.reservation.controller.ex.*;
import com.cpt202a19.reservation.service.ex.*;
import com.cpt202a19.reservation.until.JsonResult;
<<<<<<< HEAD

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8

import javax.servlet.http.HttpSession;

/** Base class for controller class */
@Controller
@ResponseBody
public class BaseController {
<<<<<<< HEAD

=======
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    /** Status code for successful operation */
    public static final int OK = 200;

    /** 
     * Method to handle exceptions occurs in the JsonResult
     * @param e thrown exception object
     * @return the result of handled exception
     * @exception/throws ServiceException, FileUploadIOException
     */
<<<<<<< HEAD
    @ExceptionHandler({ServiceException.class,FileUploadIOException.class}) 
=======
    @ExceptionHandler({ServiceException.class,FileUploadIOException.class})
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    // @ExceptionHandler is used to uniformly handle exceptions thrown by methods
    public JsonResult<Void>handleException (Throwable e) {
        JsonResult<Void> result = new JsonResult<Void>(e);
        if (e instanceof UsernameDuplicateException) {
            result.setState(4000);
            result.setMessage("用户名已被占用");
        } else if (e instanceof InsertException) {
            result.setState(5000);
            result.setMessage("未知异常");   
<<<<<<< HEAD
        } else if (e instanceof UserNotFoundException) {
            result.setState(5001);
            result.setMessage("User data not exitsts");   
        } else if (e instanceof PasswordNotMatchException) {
            result.setState(5002);
            result.setMessage("User's password error");   
        } else if (e instanceof UpdateException) {
            result.setState(5003);
            result.setMessage("User changee password unknowen error");  
        } else if (e instanceof FileEmptyException) {
=======
         }else if (e instanceof UserNotFoundException) {
            result.setState(5001);
            result.setMessage("User data not exitsts");   
         }else if (e instanceof PasswordNotMatchException) {
            result.setState(5002);
            result.setMessage("User's password error");   
         }else if (e instanceof UpdateException) {
            result.setState(5003);
            result.setMessage("User changee password unknowen error");  
         }else if (e instanceof FileEmptyException) {
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
            result.setState(6000);
        } else if (e instanceof FileSizeException) {
            result.setState(6001);
        } else if (e instanceof FileTypeException) {
            result.setState(6002);
        } else if (e instanceof FileStateException) {
            result.setState(6003);
        } else if (e instanceof FileUploadIOException) {
            result.setState(6004);
<<<<<<< HEAD
        } else if (e instanceof InformationCountLimitException) {
=======
        }else if (e instanceof InformationCountLimitException) {
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
            result.setState(4003);
            result.setMessage("用户的创建超出上限异常");
        } else if (e instanceof InformationNotFoundException) {
            result.setState(4004);
            result.setMessage("用户创建数据不存在");
        } else if (e instanceof AccessDeniedException) {
            result.setState(4005);
            result.setMessage("用户创建数据非法访问的异常");
        }

<<<<<<< HEAD
        return result;
    }

    /**
=======

         return result;
    }
         /**
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
     * Get the current login uid
     * @param session
     * @return the uid
     */
<<<<<<< HEAD
    protected final Integer getuidFromSession(HttpSession session){
        return Integer.valueOf(session.getAttribute("uid").toString());
    }

=======
     protected final Integer getuidFromSession(HttpSession session){
        return Integer.valueOf(session.getAttribute("uid").toString());
    }
    
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    /**
     * Get the username of the currently logged in user
     * @param session
     * @return the username
     */
    protected final String getUsernameFromSession(HttpSession session){
        return session.getAttribute("username").toString();
    }
<<<<<<< HEAD
    
}
=======
}
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
