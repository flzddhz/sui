package entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor      //无参构造
@Data                   // get and  set
public class User implements Serializable {         //在公共类设置实体   抽离实体解耦  如有变可以继承该类
    private Integer id;
    private String name;
    private String loginuser;
    private String password;
}
