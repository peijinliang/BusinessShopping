package com.sell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe  为了测试我可能需要用来点货的 一些资料来帮我完善企业的开发者账号
 **/
@RestController
@RequestMapping("/weixin")
@Slf4j
public class WeixinController {


    @GetMapping("/auth")
    public void auth(@RequestParam("code") String code) {
        log.info("-------------------------------微信获取code");
        log.info("code={}", code);
        log.info("-------------------------------微信获取code");
//      String url = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx8229adca6c3515be&redirect_uri=http://testopenapi.natapp1.cc/sell/weixin/auth&response_type=code&scope=snsapi_base&state=STATE#wechat_redirect";
//      log.info("-----------------", url);
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx8229adca6c3515be&secret=a20e910c266d358274aceca102d97b97&code=" + code + "&grant_type=authorization_code";
        RestTemplate restTemplate = new RestTemplate();
        String reponse = restTemplate.getForObject(url, String.class);
        log.info(reponse);
    }


    @GetMapping("/test")
    public String test(@RequestParam("signature") String signature, @RequestParam("timestamp") String timestamp, @RequestParam("echostr") String echostr, @RequestParam("nonce") String nonce) {
        log.info("-------------------------------微信认证方法");
        log.info("signature={}", signature);
        log.info("timestamp={}", timestamp);
        log.info("nonce={}", nonce);
        log.info("echostr={}", echostr);
        log.info("-------------------------------微信认证成功");
        return echostr;
    }




}
