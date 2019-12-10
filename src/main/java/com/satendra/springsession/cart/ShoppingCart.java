package com.satendra.springsession.cart;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SessionScope
@Component
@Data
public class ShoppingCart implements Serializable {

    private List<String> itemName = new ArrayList<>();

}
