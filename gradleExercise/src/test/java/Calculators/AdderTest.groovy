package Calculators

import spock.lang.Specification

/**
 * Created by syono on 2016-10-08.
 */
class AdderTest extends Specification {
    def "Add"() {
        given: "adder class created"
        def adder = new Adder()

        when: "1 + 1"
        def ret = adder.add(1, 2)

        then: "3"
        ret == 3
    }

    def "add where test"() {
        expect: "add"
        a + b == c
        where: "adds"
        a << [1, 2, 3]
        b << [2, 3, 4]
        c << [3, 5, 7]
    }
}
