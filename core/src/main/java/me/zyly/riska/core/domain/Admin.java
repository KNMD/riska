package me.zyly.riska.core.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by hanzhe on 2017/7/21.
 */
@Document
@CompoundIndexes({
    @CompoundIndex(name = "loginName", def = "{'loginName': 1}", unique = true),
    @CompoundIndex(name = "loginNameAndPassword", def = "{'loginName': 1, password: 1}", unique = true)
})
@Data
public class Admin implements Serializable{
    private String id;
    private String loginName;
    private String mail;
    private String phone;
    private String password;
    private Date createTime;
    private Date lastLoginTime;
    private int loginTimes;
}
