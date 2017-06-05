/*
 *  Copyright (c) 2017 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.wso2.extension.siddhi.io.http.util;

/**
 * {@code HttpConstant }Http Sink Constants.
 */
public class HttpConstants {
    private HttpConstants() {
    }

    //util values
    public static final String HEADERSPLITER = "#";
    public static final String HEADERNAMEVALUESPLITER = ":";
    public static final String HTTP_SINK_ID = "http sink";
    public static final String TRUE = "TRUE";

    //Http siddhi sink properties
    public static final String METHOD = "method";
    public static final String PUBLISHER_URL = "publisher.url";
    public static final String HEADERS = "headers";
    public static final String IS_AUTHENTICATION_REQUIRED = "basic.auth.enabled";
    public static final String RECEIVER_USERNAME = "basic.auth.username";
    public static final String RECEIVER_PASSWORD = "basic.auth.password";
    public static final String CLIENT_TRUSTSTORE_PATH = "client.truststore.path";
    public static final String CLIENT_TRUSTSTORE_PASS = "client.truststore.pass";
    public static final String MAP_TEXT = "text";
    public static final String MAP_JSON = "json";
    public static final String MAP_XML = "xml";
    public static final String MAP_WSO2EVENT = "wso2event";

    //Headers
    public static final String HTTP_CONTENT_TYPE = "Content-Type";
    public static final String TEXT_PLAIN = "text/plain";
    public static final String APPLICATION_XML = "application/xml";
    public static final String APPLICATION_JSON = "application/json";

    // protocol parameter
    public static final String METHOD_DEFAULT = "POST";
    public static final String IS_AUTHENTICATION_REQUIRED_DEFAULT = "false";
    public static final String PROTOCOL = "PROTOCOL";
    public static final String PORT = "PORT";
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String AUTHORIZATION_METHOD = "Basic ";

    public static final String LATENCY_METRICS = "latency.metrics.enabled";
    public static final String LATENCY_METRICS_VALUE = "true";
    public static final String SERVER_BOOTSTRAP_SOCKET_TIMEOUT = "server.bootstrap.socket.timeout";
    public static final String SERVER_BOOTSTRAP_SOCKET_TIMEOUT_VALUE = "15";
    public static final String CLIENT_BOOTSTRAP_SOCKET_TIMEOUT = "client.bootstrap.socket.timeout";
    public static final String CLIENT_BOOTSTRAP_SOCKET_TIMEOUT_VALUE = "15";

    public static final String KEYSTORE_FILE = "https.keyStoreFile";
    public static final String KEYSTORE_FILE_VALUE = "${carbon.home}/conf/security/wso2carbon.jks";
    public static final String KEYSTORE_PASS = "https.keyStorePass";
    public static final String KEYSTORE_PASS_VALUE = "wso2carbon";
    public static final String CERT_PASS = "https.certPass";
    public static final String CERT_PASS_VALUE = "wso2carbon";
    public static final String CARBONMESSAGE_HOST = "Host";
    public static final String DEFAULT_PORT = "default.port";
    public static final String DEFAULT_HOST = "default.host";
    public static final String DEFAULT_PROTOCOL = "default.protocol";

    //configuration Constants
    public static final String TRUSTSTORE_FILE = "https.trustStoreFile";
    public static final String TRUSTSTORE_FILE_VALUE = "${carbon.home}/conf/security/client-truststore.jks";
    public static final String TRUSTSTORE_PASS = "https.trustStorePass";
    public static final String TRUSTSTORE_PASS_VALUE = "wso2carbon";
    public static final String RECEIVER_URL = "receiver.url";
    public static final String ISAUTH = "is.basic.auth.enabled";
    public static final String EMPTY_ISAUTH = "false";
    public static final String CHANNEL_ID = "CHANNEL_ID";
    public static final String HOST = "HOST";
    public static final String HTTP_ADDRESS_COMPONENT = "://";
    public static final String EMPTY_STRING = "";
    public static final String LISTENER_INTERFACE_ID = "LISTENER_INTERFACE_ID";

    // Callback related parameters
    public static final String PROTOCOL_HTTP = "http";
    public static final String PROTOCOL_HTTPS = "https";
    public static final String HTTP_METHOD = "HTTP_METHOD";
    public static final String TO = "TO";
    public static final String HTTP_METHOD_POST = "POST";
    public static final String DEFAULT_PORT_VALUE = "9763";
    public static final String DEFAULT_HOST_VALUE = "0.0.0.0";
    public static final String DEFAULT_PROTOCOL_VALUE = "http";
    public static final String PROTOCOL_HOST_SEPERATOR = "://";
    public static final String PORT_HOST_SEPERATOR = ":";
    public static final String PORT_CONTEXT_SEPERATOR = "/";
}