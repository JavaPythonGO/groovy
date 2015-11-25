/**
 * Created by shixying on 15-11-26.
 * 向闭包传递两个参数
 */

def tellFortune(closure){
    closure new Date("09/20/2012"),"your day is filed with ceremory"
}

tellFortune(){date,forune->println "Fortune for ${date} is ${forune}"}

