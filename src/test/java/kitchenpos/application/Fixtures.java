package kitchenpos.application;

import java.util.Arrays;
import java.util.Collections;

import kitchenpos.dto.*;

public class Fixtures {

    public static MenuProductRequest makeMenuProduct() {
        return new MenuProductRequest(1L, 1L);
    }

    public static ProductRequest makeProduct() {
        return new ProductRequest("당수육", 8000);
    }

    public static MenuRequest makeMenu() {
        return new MenuRequest("잠봉", 16000.00, 1L, Collections.singletonList(makeMenuProduct()));
    }

    public static OrderLineItemRequest makeOrderLineItem() {
        return new OrderLineItemRequest(1L, 1L);
    }

    public static OrderRequest makeOrder() {
        return new OrderRequest(1L, Collections.singletonList(makeOrderLineItem()));
    }

    public static OrderTableRequest makeOrderTable(boolean empty) {
        return new OrderTableRequest(1, empty);
    }

    public static TableGroupRequest makeTableGroup() {
        return new TableGroupRequest(Arrays.asList(2L, 3L));
    }
}