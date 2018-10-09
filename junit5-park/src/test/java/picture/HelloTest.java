import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloTest {

    @Test
    void assertj_validate_tests_example() {

        String method_call_return_value = "method_call_return_value";
        String expected_return_value = "method_call_return_value";
        assertThat(method_call_return_value).isEqualTo(expected_return_value);
    }
}