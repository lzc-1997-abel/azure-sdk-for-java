// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.ai.metricsadvisor.implementation.util.MetricEnrichedSeriesDataHelper;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

/**
 * Enriched time series data which includes additional service computed
 * values for the time series data points.
 */
public final class MetricEnrichedSeriesData {
    private DimensionKey seriesKey;
    private List<OffsetDateTime> timestamps;
    private List<Double> metricValues;
    private List<Boolean> isAnomaly;
    private List<Integer> periods;
    private List<Double> expectedMetricValues;
    private List<Double> lowerBoundaryValues;
    private List<Double> upperBoundaryValues;

    static {
        MetricEnrichedSeriesDataHelper
            .setAccessor(new MetricEnrichedSeriesDataHelper.MetricEnrichedSeriesDataAccessor() {
                @Override
                public void setSeriesKey(MetricEnrichedSeriesData seriesData, DimensionKey seriesKey) {
                    seriesData.setSeriesKey(seriesKey);
                }

                @Override
                public void setTimestamps(MetricEnrichedSeriesData seriesData, List<OffsetDateTime> timestamps) {
                    seriesData.setTimestampList(timestamps);
                }

                @Override
                public void setMetricValues(MetricEnrichedSeriesData seriesData, List<Double> metricValues) {
                    seriesData.setValueList(metricValues);
                }

                @Override
                public void setIsAnomalyList(MetricEnrichedSeriesData seriesData, List<Boolean> isAnomaly) {
                    seriesData.setIsAnomalyList(isAnomaly);
                }

                @Override
                public void setPeriods(MetricEnrichedSeriesData seriesData, List<Integer> periods) {
                    seriesData.setPeriodList(periods);
                }

                @Override
                public void setExpectedMetricValues(MetricEnrichedSeriesData seriesData,
                    List<Double> expectedMetricValues) {
                    seriesData.setExpectedValueList(expectedMetricValues);
                }

                @Override
                public void setLowerBoundaryValues(MetricEnrichedSeriesData seriesData,
                    List<Double> lowerBoundaryValues) {
                    seriesData.setLowerBoundaryList(lowerBoundaryValues);
                }

                @Override
                public void setUpperBoundaryValues(MetricEnrichedSeriesData seriesData,
                    List<Double> upperBoundaryValues) {
                    seriesData.setUpperBoundaryList(upperBoundaryValues);
                }
            });
    }

    /**
     * Gets the key of the time series.
     *
     * @return The time series key.
     */
    public DimensionKey getSeriesKey() {
        return seriesKey;
    }

    /**
     * Gets the timestamps of the data points in the time series.
     *
     * @return The timestamps.
     */
    public List<OffsetDateTime> getTimestamps() {
        return Collections.unmodifiableList(this.timestamps);
    }

    /**
     * Gets the values of the data points in the time series.
     *
     * @return The values.
     */
    public List<Double> getMetricValues() {
        return Collections.unmodifiableList(this.metricValues);
    }

    /**
     * Gets the anomaly status of the data points in the time series.
     *
     * @return The anomaly statuses.
     */
    public List<Boolean> isAnomaly() {
        return Collections.unmodifiableList(this.isAnomaly);
    }

    /**
     * Gets the periods calculated for the data points in the time series.
     *
     * @return The periods.
     */
    public List<Integer> getPeriods() {
        return Collections.unmodifiableList(this.periods);
    }

    /**
     * Gets the expected values of the data points calculated by the smart detector.
     *
     * @return The expected values.
     */
    public List<Double> getExpectedMetricValues() {
        return Collections.unmodifiableList(this.expectedMetricValues);
    }

    /**
     * Gets the lower boundary values of the data points calculated by smart detector.
     *
     * @return The lower bound values.
     */
    public List<Double> getLowerBoundaryValues() {
        return Collections.unmodifiableList(this.lowerBoundaryValues);
    }

    /**
     * Gets the upper boundary values of the data points calculated by smart detector.
     *
     * @return The upper bound values.
     */
    public List<Double> getUpperBoundaryValues() {
        return Collections.unmodifiableList(this.upperBoundaryValues);
    }

    void setSeriesKey(DimensionKey seriesKey) {
        this.seriesKey = seriesKey;
    }

    void setTimestampList(List<OffsetDateTime> timestamps) {
        this.timestamps = timestamps;
    }

    void setValueList(List<Double> metricValues) {
        this.metricValues = metricValues;
    }

    void setIsAnomalyList(List<Boolean> isAnomaly) {
        this.isAnomaly = isAnomaly;
    }

    void setPeriodList(List<Integer> periods) {
        this.periods = periods;
    }

    void setExpectedValueList(List<Double> expectedMetricValues) {
        this.expectedMetricValues = expectedMetricValues;
    }

    void setLowerBoundaryList(List<Double> lowerBoundaryValues) {
        this.lowerBoundaryValues = lowerBoundaryValues;
    }

    void setUpperBoundaryList(List<Double> upperBoundaryValues) {
        this.upperBoundaryValues = upperBoundaryValues;
    }
}
