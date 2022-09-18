/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.hop.execution;

import org.apache.hop.core.gui.plugin.ITypeMetadata;
import org.apache.hop.execution.profiling.ExecutionDataProfile;
import org.apache.hop.metadata.api.HopMetadata;
import org.apache.hop.metadata.api.HopMetadataBase;
import org.apache.hop.metadata.api.HopMetadataProperty;
import org.apache.hop.metadata.api.IHopMetadata;

@HopMetadata(
    key = "execution-info-location",
    name = "Execution Information Location",
    description = "Describes where Hop can send execution information to",
    image = "ui/images/location.svg",
    documentationUrl = "/metadata-types/execution-info-location.html")
public class ExecutionInfoLocation extends HopMetadataBase implements IHopMetadata, Cloneable {
  public static final String GUI_PLUGIN_ELEMENT_PARENT_ID =
      "ExecutionInfoLocation-PluginSpecific-Options";

  @HopMetadataProperty private String description;

  @HopMetadataProperty protected String dataLoggingDelay;

  @HopMetadataProperty protected String dataLoggingInterval;

  @HopMetadataProperty protected String dataLoggingSize;

  @HopMetadataProperty private IExecutionInfoLocation executionInfoLocation;

  public ExecutionInfoLocation() {
    dataLoggingDelay = "2000";
    dataLoggingInterval = "5000";
    dataLoggingSize = "1000";
  }

  public ExecutionInfoLocation(
      String name,
      String description,
      String dataLoggingDelay,
      String dataLoggingInterval,
      String dataLoggingSize,
      ExecutionDataProfile executionDataProfile,
      IExecutionInfoLocation executionInfoLocation) {
    super(name);
    this.description = description;
    this.dataLoggingDelay = dataLoggingDelay;
    this.dataLoggingInterval = dataLoggingInterval;
    this.dataLoggingSize = dataLoggingSize;
    this.executionInfoLocation = executionInfoLocation;
  }

  public ExecutionInfoLocation(ExecutionInfoLocation location) {
    this();
    this.name = location.name;
    this.description = location.description;
    this.dataLoggingDelay = location.dataLoggingDelay;
    this.dataLoggingInterval = location.dataLoggingInterval;
    this.dataLoggingSize = location.dataLoggingSize;

    if (location.executionInfoLocation != null) {
      this.executionInfoLocation = location.executionInfoLocation.clone();
    }
  }

  /**
   * Gets description
   *
   * @return value of description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets description
   *
   * @param description value of description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Gets dataLoggingDelay
   *
   * @return value of dataLoggingDelay
   */
  public String getDataLoggingDelay() {
    return dataLoggingDelay;
  }

  /**
   * Sets dataLoggingDelay
   *
   * @param dataLoggingDelay value of dataLoggingDelay
   */
  public void setDataLoggingDelay(String dataLoggingDelay) {
    this.dataLoggingDelay = dataLoggingDelay;
  }

  /**
   * Gets dataLoggingInterval
   *
   * @return value of dataLoggingInterval
   */
  public String getDataLoggingInterval() {
    return dataLoggingInterval;
  }

  /**
   * Sets dataLoggingInterval
   *
   * @param dataLoggingInterval value of dataLoggingInterval
   */
  public void setDataLoggingInterval(String dataLoggingInterval) {
    this.dataLoggingInterval = dataLoggingInterval;
  }

  /**
   * Gets dataLoggingSize
   *
   * @return value of dataLoggingSize
   */
  public String getDataLoggingSize() {
    return dataLoggingSize;
  }

  /**
   * Sets dataLoggingSize
   *
   * @param dataLoggingSize value of dataLoggingSize
   */
  public void setDataLoggingSize(String dataLoggingSize) {
    this.dataLoggingSize = dataLoggingSize;
  }

  /**
   * Gets executionInfoLocation
   *
   * @return value of executionInfoLocation
   */
  public IExecutionInfoLocation getExecutionInfoLocation() {
    return executionInfoLocation;
  }

  /**
   * Sets executionInfoLocation
   *
   * @param executionInfoLocation value of executionInfoLocation
   */
  public void setExecutionInfoLocation(IExecutionInfoLocation executionInfoLocation) {
    this.executionInfoLocation = executionInfoLocation;
  }
}