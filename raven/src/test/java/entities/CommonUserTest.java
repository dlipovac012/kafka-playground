package entities;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SuiteDisplayName("CommonUserTest")
@SelectPackages("entities")
class CommonUserTest {

    @BeforeAll
    static void logFirstMessage() {
        System.out.println("Starting tests suite!");
    }

    @Test
    @DisplayName("1 + 1 = 2")
    void testCommonUser() {
        assertThat(2).isEqualTo(1 + 1);
    }
}
