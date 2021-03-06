package com.dashubio.app;

/**
 * 错误码
 *
 * @author Xinbin Zhang
 * @version 1.0
 * @since 2015.8.2
 */
public class ErrorCode {
    //成功
    public static final String SUCCESS = "success";

    //连接超时，或非法请求
    public static final int CONNECTION_TIMEOUT_OR_ILLEGAL_REQUEST = -11101;

    //参数错误
    public static final int PARAMETER_ERROE = -11102;

    //参数提交失败
    public static final int PARAMETER_COMMIT_FAILED = -11103;

    //数据为空
    public static final int DATA_EMPTY = -11104;

    //用户id不可为空
    public static final int USERID_CANNOT_EMPTY = -11201;

    //公司名称不可为空
    public static final int COMPANY_NAME_CANNOT_EMPYT = -11202;

    //用户姓名不可为空
    public static final int USERNAME_CANNOT_EMPYT = -11203;

    //联系电话不可为空
    public static final int CONTACT_PHONE_CANNOT_EMPYT = -11204;

    //省份不可为空
    public static final int PROVINCE_CANNOT_EMPYT = -11205;

    //城市不可为空
    public static final int CITY_CANNOT_EMPYT = -11206;

    //详细地址不可为空
    public static final int DETAIL_ADDRESS_CANNOT_EMPYT = -11207;

    //格式错误
    public static final int FORMAT_ERROR = -11208;

    //设备已注册
    public static final int DEVICE_HAS_BEEN_REGISTERED = -11301;

    //设备名不合法
    public static final int DEVICE_NAME_NOT_VALID = -11302;

    //手机号已被占用
    public static final int PHONE_HAS_BEEN_OCCUPIED = -11303;

    //密码长度不合法
    public static final int PASSWORD_LENGTH_NOT_VALID = -11304;

    //手机号不合法
    public static final int PHONE_NOT_LEGAL = -11305;

    //短信验证码错误
    public static final int SMS_VERIFICATION_CODE_ERROR = -11306;

    //用户不存在
    public static final int USER_NOT_EXIST = -11401;

    //密码错误
    public static final int PASSWORD_ERROR = -11402;

    //用户身份证已注册
    public static final int USER_ID_CARD_HAS_BEEN_REGISTERED = -11501;

    //用户身份证id不可为空
    public static final int USER_ID_CARD_CANNOT_EMPTY = -11502;

    //用户姓名不可为空
    public static final int USER_NAME_CANNOT_EMPTY = -11503;

    //用户性别不可为空
    public static final int USER_GENDER_CANNOT_EMPTY = -11504;

    //电话不可为空
    public static final int PHONE_CANNOT_EMPTY = -11505;
}
