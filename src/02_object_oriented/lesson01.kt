package `02_object_oriented`

// 类和继承
//在 Kotlin 中的一个类可以有一个主构造函数和一个或多个次构造函数。
fun main(args: Array<String>) {

    class Person constructor(firstName: String) {

    }
    // 如果主构造函数没有任何注解或者可见性修饰符，可以省略这个 constructor 关键字。
    // 省略后
    class PersonOne(firstName: String) { }

    // 在实例初始化期间，初始化块按照它们出现在类体中的顺序执行，与属性初始化器交织在一起:
    class InitOrderDemo(name: String) {
        val firstProperty = "First property: $name".also(::println)

        init {
            println("第一个初始化块: ${name}")
        }

        val secondProperty = "Second property: ${name.length}".also(::println)

        init {
            println("第二个初始化块: ${name.length}")
        }

        fun say() {
            println(this.firstProperty)
            println(this.secondProperty)
        }
    }

    var sayhello = InitOrderDemo("hello")
    sayhello.say()

    // 类的继承
    open class Base(p: Int)

    class Dervied(p: Int) : Base(p)
}
