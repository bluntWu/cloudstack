// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package com.cloud.agent.api.routing;

import com.cloud.agent.api.Command;
import com.cloud.network.router.VirtualRouterAutoScale.AutoScaleMetrics;

import java.util.List;

public class GetAutoScaleMetricsCommand extends Command {

    private String privateIP;
    boolean forVpc = false;
    private String publicIP;
    private Integer port;
    private List<AutoScaleMetrics> metrics;

    public GetAutoScaleMetricsCommand(String privateIP, boolean forVpc, String publicIP, Integer port, List<AutoScaleMetrics> metrics) {
        this.privateIP = privateIP;
        this.forVpc = forVpc;
        this.publicIP = publicIP;
        this.port = port;
        this.metrics = metrics;
    }

    public String getPrivateIP() {
        return privateIP;
    }

    public boolean isForVpc() {
        return forVpc;
    }

    public String getPublicIP() {
        return publicIP;
    }

    public Integer getPort() {
        return port;
    }

    public List<AutoScaleMetrics> getMetrics() {
        return metrics;
    }

    @Override
    public boolean executeInSequence() {
        return false;
    }
}
