/*
 * Copyright (C) 2019 The Turms Project
 * https://github.com/turms-im/turms
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.turms.gateway.logging;

import im.turms.common.constant.DeviceType;
import im.turms.common.model.dto.notification.TurmsNotification;
import im.turms.common.model.dto.request.TurmsRequest;
import im.turms.server.common.util.ByteBufUtil;
import im.turms.server.common.util.DateUtil;
import im.turms.server.common.util.Formatter;
import im.turms.server.common.util.StringUtil;
import io.netty.buffer.ByteBuf;

import javax.annotation.Nullable;

import static im.turms.server.common.logging.CommonLogger.CLIENT_API_LOGGER;
import static im.turms.server.common.logging.CommonLogger.LOG_FIELD_DELIMITER;

/**
 * @author James Chen
 */
public final class ClientApiLogging {

    private ClientApiLogging() {
    }

    /**
     * @implNote 1. We don't accept an object like ClientApiLoggingMessage
     * to collect all data to avoid creating unnecessary intermediate objects.
     * 2. We use the common log pattern (including the trace ID) so that our
     * users don't need to write different parsers for them.
     */
    public static void log(@Nullable Integer sessionId,
                           @Nullable Long userId,
                           @Nullable DeviceType deviceType,
                           @Nullable Integer version,
                           String ip,
                           long requestId,
                           TurmsRequest.KindCase requestType,
                           int requestSize,
                           long requestTime,
                           TurmsNotification response,
                           long processingTime) {
        ByteBuf buffer = ByteBufUtil.join(64, LOG_FIELD_DELIMITER,
                // session information
                sessionId,
                userId,
                StringUtil.toString(deviceType),
                version,
                ip,
                // request information
                Formatter.toCharBytes(requestId),
                requestType.name(),
                Formatter.toCharBytes(requestSize),
                DateUtil.toBytes(requestTime),
                // response information
                Formatter.toCharBytes(response.getCode()),
                response.hasData() ? response.getData().getKindCase().name() : null,
                Formatter.toCharBytes(response.getSerializedSize()),
                Formatter.toCharBytes(processingTime));
        CLIENT_API_LOGGER.info(buffer);
    }

    public static void log(@Nullable Integer sessionId,
                           @Nullable Long userId,
                           @Nullable DeviceType deviceType,
                           @Nullable Integer version,
                           String ip,
                           long requestId,
                           TurmsRequest.KindCase requestType,
                           int requestSize,
                           long requestTime,
                           int responseCode,
                           long processingTime) {
        ByteBuf buffer = ByteBufUtil.join(64, LOG_FIELD_DELIMITER,
                // session information
                sessionId,
                userId,
                StringUtil.toString(deviceType),
                version,
                ip,
                // request information
                Formatter.toCharBytes(requestId),
                requestType.name(),
                Formatter.toCharBytes(requestSize),
                DateUtil.toBytes(requestTime),
                // response information
                Formatter.toCharBytes(responseCode),
                null, // Response data type
                '0', // Response serialized size
                Formatter.toCharBytes(processingTime));
        CLIENT_API_LOGGER.info(buffer);
    }

    public static void log(@Nullable Integer sessionId,
                           @Nullable Long userId,
                           @Nullable DeviceType deviceType,
                           @Nullable Integer version,
                           String ip,
                           long requestId,
                           String requestType,
                           int requestSize,
                           long requestTime,
                           int responseCode,
                           @Nullable String responseDataType,
                           int responseSize,
                           long processingTime) {
        ByteBuf buffer = ByteBufUtil.join(64, LOG_FIELD_DELIMITER,
                // session information
                sessionId,
                userId,
                StringUtil.toString(deviceType),
                version,
                ip,
                // request information
                Formatter.toCharBytes(requestId),
                requestType,
                Formatter.toCharBytes(requestSize),
                DateUtil.toBytes(requestTime),
                // response information
                Formatter.toCharBytes(responseCode),
                responseDataType,
                Formatter.toCharBytes(responseSize),
                Formatter.toCharBytes(processingTime));
        CLIENT_API_LOGGER.info(buffer);
    }

}