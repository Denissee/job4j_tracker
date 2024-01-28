package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenTrueLots() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"1", "2", "3"}
        );
        ValidateInput input = new ValidateInput(output, in);

        int selectedfirst = input.askInt("Enter menu:");
        assertThat(selectedfirst).isEqualTo(1);

        int selectedsecond = input.askInt("Enter menu:");
        assertThat(selectedsecond).isEqualTo(2);

        int selectedthird = input.askInt("Enter menu:");
        assertThat(selectedthird).isEqualTo(3);
    }

    @Test
    void whenMinus() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"-1"}
        );
        ValidateInput input = new ValidateInput(output, in);

        int selectedfirst = input.askInt("Enter menu:");
        assertThat(selectedfirst).isEqualTo(-1);
    }
}