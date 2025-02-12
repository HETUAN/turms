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

package im.turms.server.common.property.env.gateway;

import com.fasterxml.jackson.annotation.JsonView;
import im.turms.server.common.property.env.common.AddressProperties;
import im.turms.server.common.property.env.gateway.clientapi.ClientApiProperties;
import im.turms.server.common.property.env.gateway.redis.TurmsRedisProperties;
import im.turms.server.common.property.metadata.view.MutablePropertiesView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * @author James Chen
 */
@AllArgsConstructor
@Builder(toBuilder = true)
@Data
@NoArgsConstructor
public class GatewayProperties {

    // API

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private AddressProperties metricsApiAddress = new AddressProperties();

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private ClientApiProperties clientApi = new ClientApiProperties();

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private NotificationLoggingProperties notificationLogging = new NotificationLoggingProperties();

    // Business Behavior

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private SessionProperties session = new SessionProperties();

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private SimultaneousLoginProperties simultaneousLogin = new SimultaneousLoginProperties();

    // Cluster

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private DiscoveryProperties serviceDiscovery = new DiscoveryProperties();

    // Data Store

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private MongoProperties mongo = new MongoProperties();

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private TurmsRedisProperties redis = new TurmsRedisProperties();

    // Faking

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private FakeProperties fake = new FakeProperties();

    // Network Access Layer

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private UdpProperties udp = new UdpProperties();

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private TcpProperties tcp = new TcpProperties();

    @JsonView(MutablePropertiesView.class)
    @NestedConfigurationProperty
    private WebSocketProperties websocket = new WebSocketProperties();

}
