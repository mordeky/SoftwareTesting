package Lab10.pbt;

import Lab10.domain.TaxIncome;
import net.jqwik.api.*;
import net.jqwik.api.constraints.DoubleRange;
import net.jqwik.api.constraints.Negative;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxIncomeTest {

    private TaxIncome taxIncome = new TaxIncome();

    @Property
    void tax22100max(@ForAll @DoubleRange(min = 0, max = 22100, maxIncluded = false) double income){
        assertEquals(taxIncome.calculate(income),0.15*income, Math.ulp(income));
    }

    @Property
    void tax53500max(@ForAll @DoubleRange(min = 22100, max = 53500, maxIncluded = false) double income){
        assertEquals(taxIncome.calculate(income),3315 + 0.28 * (income - 22100), Math.ulp(income));
    }

    @Property
    void tax115000max(@ForAll @DoubleRange(min = 53500, max = 115000, maxIncluded = false) double income){
        assertEquals(taxIncome.calculate(income),12107 + 0.31 * (income - 53500), Math.ulp(income));
    }

    @Property
    void tax250000max(@ForAll @DoubleRange(min = 115000, max = 250000, maxIncluded = false) double income){
        assertEquals(taxIncome.calculate(income),31172 + 0.36 * (income - 115000), Math.ulp(income));
    }

    @Property
    void tax250000min(@ForAll @DoubleRange(min = 250000) double income){
        assertEquals(taxIncome.calculate(income),79772 + 0.396 * (income - 250000), Math.ulp(income));
    }

    @Property
    void invalid(@ForAll @Negative double income){
        assertEquals(taxIncome.calculate(income), -1, Math.ulp(income));
    }

}