/**
 * Created by shixying on 15-11-27.
 * 通过闭包进行资源清理
 */
//不调用close或者flush方法无法进行文件写入
writter=new FileWriter("output.txt")
writter.write("我爱编程！")
//显示调用close方法,关闭资源
writter.close()

//通过闭包关闭资源,调用withwriter方法会自动调用flush（），close（）
new FileWriter("demo.txt").withWriter {writter-> writter.write("test")}

