package composite;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Component {

    List<Component> components = new ArrayList<>();

    public void addProduct(Component component) {
        components.add(component);
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
