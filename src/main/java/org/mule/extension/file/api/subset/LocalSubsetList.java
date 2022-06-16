/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package org.mule.extension.file.api.subset;

import org.mule.extension.file.common.api.subset.SubsetList;
import org.mule.runtime.extension.api.annotation.dsl.xml.ParameterDsl;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.annotation.param.display.DisplayName;

public class LocalSubsetList implements SubsetList {

  @Parameter
  @Optional(defaultValue = "0")
  @DisplayName("Limit")
  @ParameterDsl(allowReferences = false)
  private Integer limit;

  @Parameter
  @Optional(defaultValue = "0")
  @DisplayName("Offset")
  @ParameterDsl(allowReferences = false)
  private Integer offset;

  @Parameter
  @Optional(defaultValue = "DATE_MODIFIED")
  @DisplayName("Criteria")
  @ParameterDsl(allowReferences = false)
  protected ListComparator criteria;

  @Parameter
  @Optional(defaultValue = "DESCENDING")
  @DisplayName("Order")
  @ParameterDsl(allowReferences = false)
  protected SortOrder order;

  public Integer getLimit() {
    return limit;
  }

  public Integer getOffset() {
    return offset;
  }

  public ListComparator getCriteria() {
    return criteria;
  }

  public SortOrder getOrder() {
    return order;
  }

}
