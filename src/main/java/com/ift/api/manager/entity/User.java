package com.ift.api.manager.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * <p>
 * 用户信息
 * </p>
 *
 * @author ift
 * @since 2019-08-27
 */
@Data
@TableName("ift_user")
public class User extends Model<User> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 是否删除：1：已删除，0：未删除
     */
    @TableLogic
    private String deleted;

    private Integer datainsuser;

    private LocalDateTime datainstime;

    private Integer dataupuser;

    private LocalDateTime datauptime;
}
