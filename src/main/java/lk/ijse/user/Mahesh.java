package lk.ijse.user;

import lk.ijse.contract.BakeryItem;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Third")
public class Mahesh {

    private BakeryItem bakeryItem;

    public void lovesFood(BakeryItem bakeryItem) {
        this.bakeryItem = bakeryItem;
    }
}
