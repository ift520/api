package com.ift.api.security.controller;

import com.ift.api.common.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 安全相关接口
 *
 * @author liufei
 * @since 2019/8/28
 */
@RestController
@RequestMapping("/authentication")
public class SecurityController {

    @GetMapping("/login")
    public Result login(HttpServletRequest request) {
        request.getSession().setAttribute("IP", request.getRemoteAddr());
        return Result.isSuccess(request.getSession().getId() + "===" + request.getSession().getAttribute("IP"));
    }
}
