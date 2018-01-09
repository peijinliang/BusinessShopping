package com.sell.utils;

import com.sell.VO.ResultVO;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
public class ResultVOUtils {


    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setMsg("成功");
        resultVO.setCode(0);
        return resultVO;
    }


    public static ResultVO success() {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(null);
        resultVO.setMsg("成功");
        resultVO.setCode(0);
        return resultVO;
    }


    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(null);
        resultVO.setMsg(msg);
        resultVO.setCode(code);
        return resultVO;
    }

}
