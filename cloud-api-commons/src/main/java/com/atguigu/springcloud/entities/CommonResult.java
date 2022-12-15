package com.atguigu.springcloud.entities;
//entities.CommonResult
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//返回前端的类型类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;//200表示走正常逻辑，非200走异常逻辑
    private String message;//返回前端人员查询的信息
    private T data;        //返回前端的数据json串进行封装

    //当data数据为null时
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

}
