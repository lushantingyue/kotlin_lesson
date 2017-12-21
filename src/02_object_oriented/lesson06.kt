//package `02_object_oriented`

/**
 * 创建数据类
 */

fun main(args: Array<String>) {

    var user = EmailUser("johnson", "kotlin@163.com")
    println(user.name + " " + user.email + " " + user.hashCode())

    user = EmailUser()
    println(user.name + " " + user.email + " " + user.hashCode())
}

/**
 * 最简写法
 */
data class Object(val name:String, val email: String)

/**
 * 创建数据对象(带默认值)
 */
data class EmailUser(val name:String="sohu", val email: String="sohu.com")