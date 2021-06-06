package autoConfig;

import org.springframework.stereotype.Component;

@Component
public class AutoTest {
    private String name="test";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
