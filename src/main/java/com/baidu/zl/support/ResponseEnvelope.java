/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.zl.support;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseEnvelope {
    private static final Object emptyJson = new Object[0];

    public static interface ResponseJson {
        ResponseJson add(String key, Object value);

        Object end();
    }

    public static interface DoEndTask {
        Object doEnd(Map<String, Object> map);
    }

    private ResponseEnvelope() {
    }

    public static ResponseJson ofOk() {
        return createResponseJson(new DoEndTask() {

            public Object doEnd(Map<String, Object> map) {
                return map;
            }

        });
    }

    public static ResponseJson ofInternalError() {
        return createResponseJson(createResponseEntityDoEndTask(HttpStatus.INTERNAL_SERVER_ERROR));
    }

    public static ResponseJson ofParamError() {
        return createResponseJson(createResponseEntityDoEndTask(HttpStatus.CONFLICT));
    }

    public static Object emptyJson() {
        return ResponseEnvelope.emptyJson;
    }

    // public static ResponseJson of(HttpStatus httpStatus) {
    // return createResponseJson(createResponseEntityDoEndTask(httpStatus));
    // }

    private static DoEndTask createResponseEntityDoEndTask(
            final HttpStatus httpStatus) {
        return new DoEndTask() {

            public Object doEnd(Map<String, Object> map) {
                return new ResponseEntity<Map<String, Object>>(map, httpStatus);
            }

        };
    }

    private static ResponseJson createResponseJson(final DoEndTask endTask) {
        final Map<String, Object> map = new LinkedHashMap<String, Object>();
        ;
        return new ResponseJson() {

            public ResponseJson add(String key, Object value) {
                map.put(key, value);
                return this;
            }

            public Object end() {
                return endTask.doEnd(map);
            }
        };
    }
}
