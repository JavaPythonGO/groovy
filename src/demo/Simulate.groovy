package demo
/**
 * Created by shixying on 15-11-25.
 * 这是一个必包的测试学习实例
 */
class Equipment{
    def calculator
    //构造方法接受一个闭包参数，缓存到calculator
    Equipment(calc){
        calculator=calc
    }
    def simulate(){
        println 'Running simulation'
        calculator()
    }
}
def eq1=new Equipment({println "calculator1"})
def aCalculator={println 'Calculator2'}
def eq2=new Equipment(aCalculator)
def eq3=new Equipment(aCalculator)

eq1.simulate()
eq2.simulate()
eq3.simulate()