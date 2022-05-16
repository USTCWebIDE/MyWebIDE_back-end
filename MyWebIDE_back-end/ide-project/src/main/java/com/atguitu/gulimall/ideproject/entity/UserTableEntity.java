package com.atguitu.gulimall.ideproject.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author ybf
 * @email ${email}
 * @date 2021-10-09 12:33:56
 */
@Data
@TableName("ide_user_table")
public class UserTableEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	private String username;
	/**
	 * 
	 */
	@TableId
	private Integer userId;
	/**
	 * 
	 */
	private String password;
	/**
	 * 
	 */
	private String mobile;
	/**
	 * 
	 */
	private Date createTime;

}
