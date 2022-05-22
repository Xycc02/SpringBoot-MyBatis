package com.xuyuchao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: xuyuchao
 * @Date: 2022-05-20-21:52
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String sId;
    private String sName;
    private String sBirth;
    private String sSex;
}
