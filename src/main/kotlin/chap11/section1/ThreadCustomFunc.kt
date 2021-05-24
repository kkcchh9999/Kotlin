package chap11.section1

public fun thread(start: Boolean = true, isDaemon: Boolean = false
    ,contextClassLoader: ClassLoader? = null, name: String? = null
    ,priority: Int = -1, block:() -> Unit) : Thread{
    val thread = object : Thread(){
        public override fun run() {
            block()
        }
    }
    if(isDaemon)    //백그라운드 실행 여부
        thread.isDaemon = true
    if(priority > 0)    //우선순위, 10(높음) ~ -10(낮음)
        thread.priority = priority
    if(name != null)    //이름
        thread.name = name
    if(contextClassLoader != null)
        thread.contextClassLoader = contextClassLoader
    if(start)
        thread.start()
    return thread
}

fun main() {
    thread(start = true){
        println("Current Threads(Custom function): ${Thread.currentThread()}")
        println("Priority: ${Thread.currentThread().priority}")
        println("Name: ${Thread.currentThread().name}")
        println("Name: ${Thread.currentThread().isDaemon}")
    }
}