package eu.victorlopez.learninggithubactions

import org.junit.jupiter.api.Test

class HelloWorldTest {

    @Test
    fun `Hello test`() {
        assert(true)
    }

    @Test
    fun `testAddition`() {
        assert(1 + 1 == 2)
    }
}
