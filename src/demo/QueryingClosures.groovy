/**
 * Created by shixying on 15-11-27.
 * 动态闭包
 * 1、可以确定一个闭包是否提供，如果没有提供进行另外处理
 * 2、动态确定一个闭包期望的参数个数和类型
 */

def doSomething(colsure){
    //判断闭包是否存在
    if(colsure){
        //存在调用闭包方法
        colsure()
    }else{
        //否则提供默认实现
        println "This is defalut method!"
    }
}
//测试方法
//doSomething(){println "hello world!"}
//doSomething()

def compelteOrder(amount,taxComputer){
    tax=0
    //maximumNumberOfParameters获取闭包参数
    if(taxComputer.maximumNumberOfParameters==2){
        tax=taxComputer(amount,6.05)
    }else{
        tax=taxComputer(amount)
    }
    println "Sales tax is ${tax}"
}

compelteOrder(100){it * 0.0825}
compelteOrder(100){amount,rate-> amount*(rate/100)}

