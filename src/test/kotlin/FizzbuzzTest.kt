import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeTypeOf

class FizzbuzzTest : StringSpec({

    "Fizzbuzz should return a string" {
        fizzbuzz(1).shouldBeTypeOf<String>()
    }

    listOf(3, 6, 9, 999).forEach {
        "$it - fizzbuzz should return fizz when divisible by 3" {
            fizzbuzz(it) shouldBe "fizz"
        }
    }

    listOf(5, 10, 995).forEach {
        "$it - fizzbuzz should return buzz when divisible by 5" {
            fizzbuzz(it) shouldBe "buzz"
        }
    }

    listOf(15, 30, 600).forEach {
        "$it - fizzbuzz should return fizzbuzz when divisible by 3 and 5" {
            fizzbuzz(it) shouldBe "fizzbuzz"
        }
    }
})

fun fizzbuzz(i: Int): String {
    return when {
        ((i % 3) == 0 && (i % 5) == 0) -> "fizzbuzz"
        (i % 3) == 0 -> "fizz"
        (i % 5) == 0 -> "buzz"
        else -> i.toString()
    }
}
