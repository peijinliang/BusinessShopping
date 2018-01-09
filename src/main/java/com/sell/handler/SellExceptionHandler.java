package com.sell.handler;

import com.sell.VO.ResultVO;
import com.sell.config.ProjectUrlConfig;
import com.sell.exception.ResponseBankException;
import com.sell.exception.SellException;
import com.sell.exception.SellerAuthorizeException;
import com.sell.utils.ResultVOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
@ControllerAdvice
public class SellExceptionHandler {

    //拦截登录异常  然后进行跳转
    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerAuthorizeException() {
        return new ModelAndView("redirect:"
                                        .concat(projectUrlConfig.getWechatOpenAuthorize())
                                        .concat("/sell/wechat/qrAuthorize")
                                        .concat("?returnUrl=")
                                        .concat(projectUrlConfig.getSell())
                                        .concat("/sell/seller/login"));
    }


    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVO handlerSellerException(SellException e) {
        return ResultVOUtils.error(e.getCode(), e.getMessage());
    }


    //通过这个设置 对于具体的reponse的status进行修改
    @ExceptionHandler(value = ResponseBankException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void handlerResponseBankException() {

    }


}
