package classes

class Book(var name: String,diameter:Int) {//Parameters must have type annotations
// we can make it pub lic by adding the var or val modifier
    var books:Int
    init{
    println("inside the constructor $name")//called after the constructor value is set
        books=0

    }
    val radius:Int =diameter/2
    constructor(name:String,diameter:Int,gaseous:Boolean):this(name,diameter)//we should call primary constructor from this
//for boolean we don't mention as var or val
    //we can have n many constructors but we rather use default values
}
//call constructor like its a method
//all classes are final by default
//to inherit we use (open)
//any override method can call a base class
/*Abstract class:
open by default
implementation in derived class
 */

/*Interfaces
cannot store state
has a relation
save info to database and retrieve info from database
 */
/*Inline
lightweight
1. value
2. @JvmInline
 */