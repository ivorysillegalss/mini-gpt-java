package com.gduf.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 进行权限验证或其他预处理操作
//        if (request.getHeader("token").isEmpty()) {
//            Result errorResponse = new Result("系统错误，请重新登录",SYSTEM_ERROR,null);
//            // 将自定义响应对象写入响应
//            response.getWriter().write(JSON.toJSONString(errorResponse));
//            response.setStatus(HttpStatus.FORBIDDEN.value());
//            return false; // 中止请求处理
//        }
        return true; // 允许请求继续处理
    }
}
