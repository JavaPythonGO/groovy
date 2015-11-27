/**
 * Created by shixying on 15-11-7.
 * coroutine（协同程序）闭包与函数协程处理
 * 函数与闭包进行交互
 */
def iterate(n,closure){
    1.upto(n){
        println "In iterate with value ${it}"
        closure(it)
    }
}

println "Calling iterate"
total=0
iterate(4){
    total+=it
    println "In closure total so far is ${total}"
}
println "Done"