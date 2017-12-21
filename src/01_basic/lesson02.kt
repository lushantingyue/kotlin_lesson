//package `01_basic`

/**
 * 惯用写法
 */

fun main(args: Array<String>) {

    println("=== 数据类 ===")

    var user = User("johnson", "kotlin@163.com")
    println(user.name + " " + user.email + " " + user.hashCode())

    println("=== 带默认参数的函数 ===")
    foo(1, "abc")

    println("=== 过滤 ===")

    var list = listOf("apple","banana","orange")
    // 过滤 .filter{ 条件 }
    var positives = list.filter { x -> x.length > 5 }
    positives.map { println(it) }

    println("=== String内嵌模板字符串 ===")
    var name = "I like kotlin!"
    println("Name: $name")

    println("=== 类型判断 ===")
    var x = "Hello"
    if (x is String) println("is String.") else println("other Type.")

    println("=== 遍历Map/Pair(键值对) ===")
    val map = hashMapOf("foo" to 1, "bar" to 2)
    for ((k,v)in map) {
        println("$k -> $v")
    }

    println("=== 使用区间 ===")
    // a..b
    //    闭区间
    for (i in 5..10) {
        print(i)
        print(" ")
    }
    println("\n")
    // 半开区间, 左闭右开
    for (i in 5 until 10) {
        print(i)
        print(" ")
    }
    println("\n")
    // 步进
    for (i in 2..10 step 2) {
        print(i)
        print(" ")
    }
    println("\n")

    // 倒数
    for (i in 10 downTo 1) {
        print(i)
        print(" ")
    }
    println("\n")

    println("=== 只读list ===")
    val readOnlyList = listOf("a","b","c")
    println(readOnlyList.get(0))

    println("=== 只读map ===")
    val readOnlyMap = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(readOnlyMap["b"])

    println("=== 访问map ===")
    println(readOnlyMap["c"])

    println("=== 延迟属性 ===")
//    val p:String? by lazy {
//
//    }

    println("=== 扩展函数 ===")
    
}

/**
 * 创建数据类 DTO
 */
data class User(val name:String, val email: String)

/**
 * 带默认参数的函数
 */
fun foo(a: Int = 0, b: String = "") {
    println(a)
    println(b)
}

