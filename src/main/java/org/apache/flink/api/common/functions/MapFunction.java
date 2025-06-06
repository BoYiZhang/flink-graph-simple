package org.apache.flink.api.common.functions;

import java.io.Serializable;

public interface MapFunction<T,O> extends Function, Serializable {
    O map(T value) throws Exception;
}
