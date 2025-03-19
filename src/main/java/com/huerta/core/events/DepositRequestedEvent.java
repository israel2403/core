package com.huerta.core.events;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepositRequestedEvent {

    private String senderId;
    private String recepientId;
    private BigDecimal amount;
}
