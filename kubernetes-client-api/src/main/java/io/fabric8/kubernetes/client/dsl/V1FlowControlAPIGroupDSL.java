/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.fabric8.kubernetes.client.dsl;

import io.fabric8.kubernetes.api.model.flowcontrol.v1.FlowSchema;
import io.fabric8.kubernetes.api.model.flowcontrol.v1.FlowSchemaList;
import io.fabric8.kubernetes.api.model.flowcontrol.v1.PriorityLevelConfiguration;
import io.fabric8.kubernetes.api.model.flowcontrol.v1.PriorityLevelConfigurationList;
import io.fabric8.kubernetes.client.Client;

public interface V1FlowControlAPIGroupDSL extends Client {
  /**
   * DSL entrypoint for flowcontrol.apiserver.k8s.io/v1 FlowSchema
   *
   * @return {@link NonNamespaceOperation} for FlowSchema resource
   */
  NonNamespaceOperation<FlowSchema, FlowSchemaList, Resource<FlowSchema>> flowSchema();

  /**
   * DSL entrypoint for flowcontrol.apiserver.k8s.io/v1 PriorityLevelConfiguration
   *
   * @return {@link NonNamespaceOperation} for PriorityLevelConfiguration resource
   */
  NonNamespaceOperation<PriorityLevelConfiguration, PriorityLevelConfigurationList, Resource<PriorityLevelConfiguration>> priorityLevelConfigurations();
}
