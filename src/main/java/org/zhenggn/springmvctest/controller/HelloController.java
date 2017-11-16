package org.zhenggn.springmvctest.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * <p>Title: SpringMVCTest</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: www.jd.com</p>
 *
 * @author zhengguinan
 * @version 1.0
 * @date 2017/11/16
 */
public class HelloController implements Controller{

    private static final Log logger = LogFactory.getLog(HelloController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        logger.info("handleRequest 被调用");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","Hello World!");
        mv.setViewName("/WEB-INF/content/welcome.jsp");
        return mv;
    }
}
