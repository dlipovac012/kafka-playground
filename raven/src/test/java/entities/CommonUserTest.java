package entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CommonUserTest {

    @Test
    @DisplayName("1 + 1 = 2")
    void testCommonUser() {
        assertThat(2).isEqualTo(1 + 1);
    }
}
