fun main(){
    var t =Test()
    t.rating=4
    println(t.rating)
}
class Test
{
    var rating:Int=5
        get()
        {
            if(field<5)
            {
                println("This is a terrible book")
            }
            return field
        }
        set(value)
        {
            field=when{
                value>10->10
                value<0->0
                else->value
            }
        }
}