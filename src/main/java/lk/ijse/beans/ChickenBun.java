package lk.ijse.beans;

import lk.ijse.contract.BakeryItem;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Third")
public class ChickenBun implements BakeryItem {

}