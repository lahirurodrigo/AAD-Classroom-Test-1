package lk.ijse.user;

import lk.ijse.contract.BakeryItem;
import lk.ijse.customannotation.Latest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Mahesh {

    private BakeryItem bakeryItem;

    @Qualifier("Third")
    @Latest
    public void lovesFood(BakeryItem bakeryItem) {
        this.bakeryItem = bakeryItem;
    }
}
