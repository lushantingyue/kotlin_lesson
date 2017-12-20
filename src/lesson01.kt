/**
 * lesson01 基本语法
 */
//package my.demo // 定义包名

fun main(args: Array<String>) {
    println("hello world.\n")
    println("function output: " + sum(2, 3))

    println("返回值自动推导:\n" + func02(2, 3))

    println("空返回的函数: ")
    func03(2, 3)
    func03Void(5, 6)

    /**
     * 变量
     * val: cannot be reassigned  val标识的变量只能一次赋值,
     * var: 可多次赋值
     * val, var 共同点, 类型不可变, 说明kotlin 是强类型特性
     */
    val a: Int = 1    // 立即赋值
    val b = 2           // 自动推断为Int类型
    val c:Int           // 未初始化的值, 类型不能忽略
    c = 3                   // 明确赋值
    //c = 5   // 再次赋值会报错

    var x = 5   // 自动推断为 Int类型
    x += 1
    println("var变量: " + x)

    /**
     * 字符串模板,类似于php和es6
     */
    var aa = 111
    var s1 = "aa is $aa"
    aa = 222
    println("字符串模板: " + s1)
    val s2 = "${s1.replace("is","was")},but now is $aa"
    println(s2)
}

/**
 * 函数function
 * 格式:fun function_name (a: Type, b: Type) {returnType}
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun func02(a: Int, b: Int) = a + b
/**
 * 相当于返回void值的过程
 */
fun func03(a: Int, b: Int): Unit {
    println(a + b)
}

// Unit声明省略后的写法
fun func03Void(a: Int, b: Int) {
    println(a + b)
}