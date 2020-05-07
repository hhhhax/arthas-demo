package com.hax.demo.domain.enums;


public enum ResponseEnums {


    /* 成功状态码 */
    SUCCESS_OPTION("0000", "成功"),
    /* 系统或参数错误 0001-0099 */
    SYSTEM_BUSY("0100", "系统繁忙，请稍后重试！"),
    SYSTEM_FAIL("0101", "系统故障，请稍后重试！"),
    CONNECTION_ERROR("0102", "通信异常，请稍后重试！"),
    PAY_ERROR("0103", "支付接出服务故障！错误编码[%s]，错误描述[%s]"),
    BAD_REQUEST("0104", "错误的请求参数！"),
    VALID_FIELD_ERROR("0105", "参数校验失败"),
    /* 数据库或缓存层面异常 0101-0199 */
    REDIS_ERROR("0104", "数据缓存异常，请联系系统管理员！"),
    DB_RESULT_ERROR("0105", "数据查询结果异常！"),
    DATABASE_ERROR("0106", "数据库操作异常，请联系系统管理员！"),
    DUPLICATE_KEY_ERROR("0107", "请勿重复提交表单！"),
    /* 用户层面错误 1001-1999 */
    TOKEN_ERROR("1101", "用户当前token错误或已失效，请重新授权！"),
    /* 未知错误 9999 */
    SYSTEM_ERROR("9999", "失败，未知错误！");

    private String code;
    private String msg;

    private ResponseEnums(String code, String msg) {

        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
