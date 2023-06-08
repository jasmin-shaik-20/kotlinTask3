fun main(args: Array<String>) {
    var s: String? = "Jasmin"
    println(s)
    if (s != null) {
        println("String of length ${s.length}")
    } else {
        println("Null string")
    }
    // assign null
    s = null
    println(s)
    if (s != null) {
        println("String of length ${s.length}")
    } else {
        println("Null String")
    }

    //Safe operator(?.)
    var firstName: String? = "Praveen"
    var lastName: String? = null
    println("${firstName?.length}")
    println("${lastName?.length}")

    //Safe Call with let(?.let)

    firstName?.let {
        println("${firstName?.length}")
    }
    lastName?.let {
        println("${lastName?.length}")
    }


    //Elvis Operator(?:)
    val flen=firstName?.length?:"-1"
    val slen=lastName?.length?:"-1"
    println(flen)
    println(slen)


    //Not-null Assertion(!!)
    println(firstName?.length)


}