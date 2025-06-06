package org.apache.flink.api.common.functions;

import java.io.Serializable;

public interface KeySelector <IN, KEY> extends Function, Serializable {
    KEY getKey(IN value) throws Exception;
}
