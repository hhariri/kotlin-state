
@Experimental
annotation class AwesomeNewFeature

@Experimental
annotation class  SecondAwesomeFeature


@SecondAwesomeFeature
fun usingExperimentalFunction() {

}

@AwesomeNewFeature
class UsingExperimentalClass





// Propagating
@SecondAwesomeFeature
@AwesomeNewFeature
fun main(args: Array<String>) {
    val myClass = UsingExperimentalClass()
    usingExperimentalFunction()

}


// Not propagating
//@UseExperimental(AwesomeNewFeature::class, SecondAwesomeFeature::class)

