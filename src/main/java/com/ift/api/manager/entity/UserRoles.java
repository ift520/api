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
 * 用户角色关系
 * </p>
 *
 * @author ift
 * @since 2019-08-27
 */
@Data
@TableName("ift_user_roles")
public class UserRoles extends Model<UserRoles> {

    private static final long serialVersionUID = -3745354843711721398L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户表主键
     */
    private Integer userid;

    /**
     * 角色表主键
     */
    private Integer roleid;

    /**
     * 是否删除：1：已删除，0：未删除
     */
    @TableLogic
    private String deleted;

    /**
     * 数据新增人
     */
    private Integer datainsuer;

    /**
     * 数据新增时间
     */
    private LocalDateTime datainstime;

    /**
     * 数据修改人
     */
    private Integer dataupuser;

    /**
     * 数据修改时间
     */
    private LocalDateTime datauptime;
}
