package org.example.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
@Schema(description = "用户信息实体类")
public class Account {
    @Schema(description = "用户编号")
    int id;
    @Schema(description = "用户名称")
    String name;
    @Schema(description = "用户邮箱")
    String email;
    @Schema(description = "用户密码")
    String password;
}