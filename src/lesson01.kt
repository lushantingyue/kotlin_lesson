import com.sun.org.apache.bcel.internal.generic.INSTANCEOF
import java.util.*

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
     * val, var
     */
    val a: Int = 1    // 立即赋值
    val b = 2           // 自动推导
    val c:Int           // 未初始化的值, 类型不能忽略
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