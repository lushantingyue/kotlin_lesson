/**
 * lesson01 基本语法
 */
package `01_basic`  // 定义包名

import java.awt.Rectangle

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
    val c: Int           // 未初始化的值, 类型不能忽略
    c = 3                   // 明确赋值
    //c = 5   // 再次赋值会报错

    var x = 5   // 自动推断为 Int类型
    x += 1
    println("var变量: " + x)

    /**
     * 注释的使用： 与Java一样，多出了“块注释级联”
     **/

    /**
     * 字符串模板,类似于php和es6
     */
    var aa = 111
    var s1 = "aa is $aa"
    aa = 222
    println("字符串模板: " + s1)
    val s2 = "${s1.replace("is","was")},but now is $aa"
    println(s2)

    /**
     * 可空变量与空值检查
     * 当某个变量可以为null时，必须声明类型后添加？来标识该引用可为空
     */
    println("======= 可空变量与空值检查 ======")
    var ab = "ab"
    var cd = "12"
    // fun parseInt(str: String): Int? 返回值可为null
    var x2 = parseInt(ab)
    var x3 = parseInt(cd)
    println(x2)
    println(x3)

    /**
     * 类型检测及自动类型转换
     * is 运算符检测一个表达式是否某类型的一个实例
     */
    println("====== 类型检测及自动类型转换 ======")
    println("String Length:" + getStringLength("kotlin_lesson"))

    /**
     * for循环
     */
    val items = listOf("apple","banana","kiwi")
    println("循环01\n======")
    for (item in items){
        println(item)
    }

    println("循环02\n======")
    for (index in items.indices){
        println("item at $index is ${items[index]}")
    }

    /**
     * while循环
     */
    println("While循环\n======")
    var index = 0
    while (index < items.size){
        println("item at $index is ${items[index]}")
        index++
    }

    /**
     * when 表达式
     */
    println("\n" + "when表达式\n======")
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

    /**
     * ranges区间操作
     * in操作符
     */
    // 1.范围检查
    println("\n"+"ranges操作\n======")

    println("\n"+"范围")
    val x1 = 10
    val y1 = 9
    if (x1 in 1..y1+1) {
        println("$x1 fits in range")
    }
    // 2.迭代
    println("迭代")
    for (x in 1..5) {
        print(x)
    }
    // 3.步进
    println("\n" + "步进")
    for (x in 1..10 step 2){
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3){
        print(x)
    }

    /**
     * 集合操作
     */
    // 1.遍历迭代
    println("\n" + "集合操作\n======")
    for (item in items) {
        println(item)
    }
    // 2.in操作符检查集合
    val items1 = setOf("apple","banana","kiwi")
    when {
        "orange" in items1 -> println("juicy")
        "apple" in items1 -> println("apple is fine too")
    }
    // 3.lambda表达式 过滤和映射集合
    val fruits = listOf("banana","avocado","apple","kiwi")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it)}

    /**
     * 创建基本类及其实例
     * 不需要new关键字
     */
    var x11 = 5
    var y11 = 2
    val rectangle = Rectangle(x11,y11)
    println("rectangle size: " + rectangle.size)
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

// 返回值可为空
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}
// is String判断类型
fun getStringLength(obj: Any): Int? {
    if (obj !is String) return null

    // `obj` 在这一分支自动转换为 `String`
    return obj.length
}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a String"
            else -> "Unknown"
        }