/**
 * Created by shixying on 15-11-27.
 *科利华闭包，闭包可能不接受任何形参，也可能接受多个形参。
 * 如果在多次调用之间，有一个或多个实参是相同的可以采取科利华闭包
 * 带有约定绑定形参的闭包叫科利华闭包。
 * 科利华是一种变换，将一个接受多个形参的函数变成了一个接受
 * 较少形参的函数。
 */
def tellFortunes(closure){
    Date date=new Date("2015/11/27")
    //实现date的科利华
    postFortune=closure.curry(date)
    //后续调用中不需date
    postFortune "Your day is filled with cermony"
    postFortune "They are features,not bugs"

}

tellFortunes(){date,fortune ->
    println "Fortune for '${date}' is '${fortune}"
}
