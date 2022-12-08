package com.tcss559.asset.service;

import com.tcss559.asset.models.LoginForm;
import com.tcss559.asset.models.Response;
import com.tcss559.asset.models.User;
import com.tcss559.asset.models.dto.ResponseDto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description: login service
 */
public interface LoginService {

    /**
     * login
     *
     * @param request
     * @param response
     * @param user
     * @return
     */
    Response login(LoginForm form);

    /**
     * register
     *
     * @param user
     * @return
     */
    ResponseDto register(User user);

    /**
     * logout
     *
     * @param request
     * @return
     */
    ResponseDto logout(HttpServletRequest request);


}
