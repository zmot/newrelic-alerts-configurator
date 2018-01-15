package com.ocadotechnology.newrelic.apiclient.internal.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ocadotechnology.newrelic.apiclient.model.conditions.nrql.AlertsNrqlCondition;
import lombok.Value;

@Value
public class AlertsNrqlConditionWrapper {
    @JsonProperty("nrql_condition")
    AlertsNrqlCondition nrqlCondition;
}
