package `01_basic`

/**
 * 空安全
 * 旨在解决空指针异常
 */

fun main(args: Array<String>) {

    /**
     * 定义变量: 不允许为空
     */
    var aa:String = "abc"
//    aa = null     // 报错

    /**
     * 定义变量: 允许为空
     */
    var bb:String? = "abc"
    bb = null

    /**
     * 传统方式, 在条件中检查
     */
//     if (b != null) return b.length else return -1
    var b = null
    println("====== 传统方式, 在条件中检查 ======")
    printLength(b)

    /**
     * 安全调用操作符 ?.
     *      先判断, 非空则操作
     */
    println("====== 安全运算操作符 ?. ======")

    val listWithNull = listOf("apple","banana", null)
    for (item in listWithNull) {
        item?.let { println(it) }   // 输出并忽略null
    }

    /**
     * Elvis操作符, 表示else...操作
     * 判断如果引用为空, 则返回一个非空值
     */
    println("====== Elvis操作符?: ======")

    Elvis(listWithNull)

    /**
     * 安全的类型转换
     * 如果尝试转换不成功则返回 null
     */
    println("====== 安全的类型转换 as? ======")

    var a = "abc"
    val aInt:Int? = a as?Int
    println("类型转换: "+ aInt)

    /**
     * 如果你有一个可空类型元素的集合，并且想要过滤非空元素, 可使用filterNotNull实现
     */
    println("====== 集合的非空元素过滤 .filterNotNull() ======")

    println(listWithNull.filterNotNull())

    /**
     * !! 非空断言运算符, 如果为空抛出空指针异常
     */
    println("====== 非空断言运算符 !! ======")

    NPE_function(listWithNull)
}

fun Elvis(listWithNull: List<String?>) {
    for (item in listWithNull) {
        var length = item?.length ?: -1
        println(length)
    }
}

fun NPE_function(listWithNull: List<String?>) {
    var i = 0
    for (item in listWithNull) {
        var leng = item!!.length    // 运行至第三次抛出 NullPointerException异常
        i++
        println(i.toString()+" === "+leng)
    }
}

fun printLength(b:String?):Unit {
    if (b != null) println(b.length) else println(-1)
}
