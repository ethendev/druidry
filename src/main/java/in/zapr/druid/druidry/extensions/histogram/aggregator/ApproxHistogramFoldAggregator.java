/*
 * Copyright 2018-present Red Brick Lane Marketing Solutions Pvt. Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package in.zapr.druid.druidry.extensions.histogram.aggregator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import in.zapr.druid.druidry.aggregator.DruidAggregator;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApproxHistogramFoldAggregator extends DruidAggregator {

    private static final String APPROX_HISTOGRAM_AGGREGATOR_TYPE = "approxHistogramFold";
    private String fieldName;
    private Integer resolution;
    private Float lowerLimit;
    private Float upperLimit;
    @JsonProperty("numBuckets")
    private Integer numberOfBuckets;

    @Builder
    private ApproxHistogramFoldAggregator(@NonNull String name, @NonNull String fieldName,
                                          Integer resolution, Float lowerLimit, Float upperLimit, Integer numberOfBuckets) {
        this.type = APPROX_HISTOGRAM_AGGREGATOR_TYPE;
        this.name = name;
        this.fieldName = fieldName;
        this.resolution = resolution;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
        this.numberOfBuckets = numberOfBuckets;
    }
}