/**
 * Created by shixying on 15-11-27.
 * 通过闭包进行资源清理
 */
class Resource{
    def open(){println 'opened...'}
    def close(){println 'closed...'}
    def read(){println 'read ...'}
    def write(){println 'write...'}
    def static use(clourse){
        def r=new Resource()
        try{
            r.open()
            clourse(r)
        }finally{
            r.close()
        }
    }
}
//闭包的时语法
Resource.use{res-> res.read()
                   res.write()
}
n
