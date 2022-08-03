package com.hotel.service.util;

import java.util.function.Consumer;

public final class ProtoBufUtil {

    private ProtoBufUtil() {
    }

    public static <T> void safeSetProtoField(Consumer<T> setter, T value) {
        if (value != null) {
            setter.accept(value);
        }
    }
}
