package com.zwjk.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by Administrator on 30-04-2018.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Accessors(chain = true)
public class User implements Serializable{
    private Long userId;
    private String userName;
    private String userSex;
    private String dbSource;
    private String userPwd;
}