package com.hax.demo.domain.vo;

import lombok.Data;

/**
 * 获取微信授权返回信息
 * @Author: hax
 * @Date: 2020/1/14
 * @company: yoe
 */
@Data
public class WxUserInfo {

    String token;

    String openid;

    String nickname;

    String headimgurl;



}
