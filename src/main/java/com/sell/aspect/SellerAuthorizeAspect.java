package com.sell.aspect;

import lombok.extern.slf4j.Slf4j;

/**
 * Crete by Marlon
 * Create Date: {DATE}
 * Class Describe
 **/
//@Aspect
//@Component
@Slf4j
public class SellerAuthorizeAspect {

//    @Autowired
//    private StringRedisTemplate redisTemplate;

//    @Pointcut("execution (public * com.sell.controller.Seller*.*(..))"
//                      + "&& !execution(public * com.sell.controller.SellerUserController.*(..))")
//    public void verify() {
//
//    }

//    @Before("verify()")
//    public void doVerify() {
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//        //查询cookie
//        Cookie cookie = CookieUtil.get(request, CookieConstant.TOKEN);
//        if (cookie == null) {
//            log.warn("【登录校验】 Cookie中查询不到token");
//            throw new SellerAuthorizeException();
//        }
//
//        //去redis里边查询
//        String tokenValue = redisTemplate.opsForValue().get(String.format(RedisConstant.TOKEN_PREFIX, cookie.getValue()));
//        if (StringUtils.isEmpty(tokenValue)) {
//            log.warn("【登录校验】 Redis里边查询不到token");
//            throw new SellerAuthorizeException();
//        }
//    }


}
