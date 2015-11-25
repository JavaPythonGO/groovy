//在groovy文件中可以自由的编写代码，与建立groovy class不一样，如果建立的是class那么方式与java一致。

class Demo{
    def test(){
        println 'hello'
    }
}

def demo=new Demo()
demo.test()