// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The X12 agreement envelope settings. */
@Fluent
public final class X12EnvelopeSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(X12EnvelopeSettings.class);

    /*
     * The controls standards id.
     */
    @JsonProperty(value = "controlStandardsId", required = true)
    private int controlStandardsId;

    /*
     * The value indicating whether to use control standards id as repetition
     * character.
     */
    @JsonProperty(value = "useControlStandardsIdAsRepetitionCharacter", required = true)
    private boolean useControlStandardsIdAsRepetitionCharacter;

    /*
     * The sender application id.
     */
    @JsonProperty(value = "senderApplicationId", required = true)
    private String senderApplicationId;

    /*
     * The receiver application id.
     */
    @JsonProperty(value = "receiverApplicationId", required = true)
    private String receiverApplicationId;

    /*
     * The control version number.
     */
    @JsonProperty(value = "controlVersionNumber", required = true)
    private String controlVersionNumber;

    /*
     * The interchange  control number lower bound.
     */
    @JsonProperty(value = "interchangeControlNumberLowerBound", required = true)
    private int interchangeControlNumberLowerBound;

    /*
     * The interchange  control number upper bound.
     */
    @JsonProperty(value = "interchangeControlNumberUpperBound", required = true)
    private int interchangeControlNumberUpperBound;

    /*
     * The value indicating whether to rollover interchange control number.
     */
    @JsonProperty(value = "rolloverInterchangeControlNumber", required = true)
    private boolean rolloverInterchangeControlNumber;

    /*
     * The value indicating whether to enable default group headers.
     */
    @JsonProperty(value = "enableDefaultGroupHeaders", required = true)
    private boolean enableDefaultGroupHeaders;

    /*
     * The functional group id.
     */
    @JsonProperty(value = "functionalGroupId")
    private String functionalGroupId;

    /*
     * The group control number lower bound.
     */
    @JsonProperty(value = "groupControlNumberLowerBound", required = true)
    private int groupControlNumberLowerBound;

    /*
     * The group control number upper bound.
     */
    @JsonProperty(value = "groupControlNumberUpperBound", required = true)
    private int groupControlNumberUpperBound;

    /*
     * The value indicating whether to rollover group control number.
     */
    @JsonProperty(value = "rolloverGroupControlNumber", required = true)
    private boolean rolloverGroupControlNumber;

    /*
     * The group header agency code.
     */
    @JsonProperty(value = "groupHeaderAgencyCode", required = true)
    private String groupHeaderAgencyCode;

    /*
     * The group header version.
     */
    @JsonProperty(value = "groupHeaderVersion", required = true)
    private String groupHeaderVersion;

    /*
     * The transaction set control number lower bound.
     */
    @JsonProperty(value = "transactionSetControlNumberLowerBound", required = true)
    private int transactionSetControlNumberLowerBound;

    /*
     * The transaction set control number upper bound.
     */
    @JsonProperty(value = "transactionSetControlNumberUpperBound", required = true)
    private int transactionSetControlNumberUpperBound;

    /*
     * The value indicating whether to rollover transaction set control number.
     */
    @JsonProperty(value = "rolloverTransactionSetControlNumber", required = true)
    private boolean rolloverTransactionSetControlNumber;

    /*
     * The transaction set control number prefix.
     */
    @JsonProperty(value = "transactionSetControlNumberPrefix")
    private String transactionSetControlNumberPrefix;

    /*
     * The transaction set control number suffix.
     */
    @JsonProperty(value = "transactionSetControlNumberSuffix")
    private String transactionSetControlNumberSuffix;

    /*
     * The value indicating whether to overwrite existing transaction set
     * control number.
     */
    @JsonProperty(value = "overwriteExistingTransactionSetControlNumber", required = true)
    private boolean overwriteExistingTransactionSetControlNumber;

    /*
     * The group header date format.
     */
    @JsonProperty(value = "groupHeaderDateFormat", required = true)
    private X12DateFormat groupHeaderDateFormat;

    /*
     * The group header time format.
     */
    @JsonProperty(value = "groupHeaderTimeFormat", required = true)
    private X12TimeFormat groupHeaderTimeFormat;

    /*
     * The usage indicator.
     */
    @JsonProperty(value = "usageIndicator", required = true)
    private UsageIndicator usageIndicator;

    /**
     * Get the controlStandardsId property: The controls standards id.
     *
     * @return the controlStandardsId value.
     */
    public int controlStandardsId() {
        return this.controlStandardsId;
    }

    /**
     * Set the controlStandardsId property: The controls standards id.
     *
     * @param controlStandardsId the controlStandardsId value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withControlStandardsId(int controlStandardsId) {
        this.controlStandardsId = controlStandardsId;
        return this;
    }

    /**
     * Get the useControlStandardsIdAsRepetitionCharacter property: The value indicating whether to use control
     * standards id as repetition character.
     *
     * @return the useControlStandardsIdAsRepetitionCharacter value.
     */
    public boolean useControlStandardsIdAsRepetitionCharacter() {
        return this.useControlStandardsIdAsRepetitionCharacter;
    }

    /**
     * Set the useControlStandardsIdAsRepetitionCharacter property: The value indicating whether to use control
     * standards id as repetition character.
     *
     * @param useControlStandardsIdAsRepetitionCharacter the useControlStandardsIdAsRepetitionCharacter value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withUseControlStandardsIdAsRepetitionCharacter(
        boolean useControlStandardsIdAsRepetitionCharacter) {
        this.useControlStandardsIdAsRepetitionCharacter = useControlStandardsIdAsRepetitionCharacter;
        return this;
    }

    /**
     * Get the senderApplicationId property: The sender application id.
     *
     * @return the senderApplicationId value.
     */
    public String senderApplicationId() {
        return this.senderApplicationId;
    }

    /**
     * Set the senderApplicationId property: The sender application id.
     *
     * @param senderApplicationId the senderApplicationId value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withSenderApplicationId(String senderApplicationId) {
        this.senderApplicationId = senderApplicationId;
        return this;
    }

    /**
     * Get the receiverApplicationId property: The receiver application id.
     *
     * @return the receiverApplicationId value.
     */
    public String receiverApplicationId() {
        return this.receiverApplicationId;
    }

    /**
     * Set the receiverApplicationId property: The receiver application id.
     *
     * @param receiverApplicationId the receiverApplicationId value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withReceiverApplicationId(String receiverApplicationId) {
        this.receiverApplicationId = receiverApplicationId;
        return this;
    }

    /**
     * Get the controlVersionNumber property: The control version number.
     *
     * @return the controlVersionNumber value.
     */
    public String controlVersionNumber() {
        return this.controlVersionNumber;
    }

    /**
     * Set the controlVersionNumber property: The control version number.
     *
     * @param controlVersionNumber the controlVersionNumber value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withControlVersionNumber(String controlVersionNumber) {
        this.controlVersionNumber = controlVersionNumber;
        return this;
    }

    /**
     * Get the interchangeControlNumberLowerBound property: The interchange control number lower bound.
     *
     * @return the interchangeControlNumberLowerBound value.
     */
    public int interchangeControlNumberLowerBound() {
        return this.interchangeControlNumberLowerBound;
    }

    /**
     * Set the interchangeControlNumberLowerBound property: The interchange control number lower bound.
     *
     * @param interchangeControlNumberLowerBound the interchangeControlNumberLowerBound value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withInterchangeControlNumberLowerBound(int interchangeControlNumberLowerBound) {
        this.interchangeControlNumberLowerBound = interchangeControlNumberLowerBound;
        return this;
    }

    /**
     * Get the interchangeControlNumberUpperBound property: The interchange control number upper bound.
     *
     * @return the interchangeControlNumberUpperBound value.
     */
    public int interchangeControlNumberUpperBound() {
        return this.interchangeControlNumberUpperBound;
    }

    /**
     * Set the interchangeControlNumberUpperBound property: The interchange control number upper bound.
     *
     * @param interchangeControlNumberUpperBound the interchangeControlNumberUpperBound value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withInterchangeControlNumberUpperBound(int interchangeControlNumberUpperBound) {
        this.interchangeControlNumberUpperBound = interchangeControlNumberUpperBound;
        return this;
    }

    /**
     * Get the rolloverInterchangeControlNumber property: The value indicating whether to rollover interchange control
     * number.
     *
     * @return the rolloverInterchangeControlNumber value.
     */
    public boolean rolloverInterchangeControlNumber() {
        return this.rolloverInterchangeControlNumber;
    }

    /**
     * Set the rolloverInterchangeControlNumber property: The value indicating whether to rollover interchange control
     * number.
     *
     * @param rolloverInterchangeControlNumber the rolloverInterchangeControlNumber value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withRolloverInterchangeControlNumber(boolean rolloverInterchangeControlNumber) {
        this.rolloverInterchangeControlNumber = rolloverInterchangeControlNumber;
        return this;
    }

    /**
     * Get the enableDefaultGroupHeaders property: The value indicating whether to enable default group headers.
     *
     * @return the enableDefaultGroupHeaders value.
     */
    public boolean enableDefaultGroupHeaders() {
        return this.enableDefaultGroupHeaders;
    }

    /**
     * Set the enableDefaultGroupHeaders property: The value indicating whether to enable default group headers.
     *
     * @param enableDefaultGroupHeaders the enableDefaultGroupHeaders value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withEnableDefaultGroupHeaders(boolean enableDefaultGroupHeaders) {
        this.enableDefaultGroupHeaders = enableDefaultGroupHeaders;
        return this;
    }

    /**
     * Get the functionalGroupId property: The functional group id.
     *
     * @return the functionalGroupId value.
     */
    public String functionalGroupId() {
        return this.functionalGroupId;
    }

    /**
     * Set the functionalGroupId property: The functional group id.
     *
     * @param functionalGroupId the functionalGroupId value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withFunctionalGroupId(String functionalGroupId) {
        this.functionalGroupId = functionalGroupId;
        return this;
    }

    /**
     * Get the groupControlNumberLowerBound property: The group control number lower bound.
     *
     * @return the groupControlNumberLowerBound value.
     */
    public int groupControlNumberLowerBound() {
        return this.groupControlNumberLowerBound;
    }

    /**
     * Set the groupControlNumberLowerBound property: The group control number lower bound.
     *
     * @param groupControlNumberLowerBound the groupControlNumberLowerBound value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withGroupControlNumberLowerBound(int groupControlNumberLowerBound) {
        this.groupControlNumberLowerBound = groupControlNumberLowerBound;
        return this;
    }

    /**
     * Get the groupControlNumberUpperBound property: The group control number upper bound.
     *
     * @return the groupControlNumberUpperBound value.
     */
    public int groupControlNumberUpperBound() {
        return this.groupControlNumberUpperBound;
    }

    /**
     * Set the groupControlNumberUpperBound property: The group control number upper bound.
     *
     * @param groupControlNumberUpperBound the groupControlNumberUpperBound value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withGroupControlNumberUpperBound(int groupControlNumberUpperBound) {
        this.groupControlNumberUpperBound = groupControlNumberUpperBound;
        return this;
    }

    /**
     * Get the rolloverGroupControlNumber property: The value indicating whether to rollover group control number.
     *
     * @return the rolloverGroupControlNumber value.
     */
    public boolean rolloverGroupControlNumber() {
        return this.rolloverGroupControlNumber;
    }

    /**
     * Set the rolloverGroupControlNumber property: The value indicating whether to rollover group control number.
     *
     * @param rolloverGroupControlNumber the rolloverGroupControlNumber value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withRolloverGroupControlNumber(boolean rolloverGroupControlNumber) {
        this.rolloverGroupControlNumber = rolloverGroupControlNumber;
        return this;
    }

    /**
     * Get the groupHeaderAgencyCode property: The group header agency code.
     *
     * @return the groupHeaderAgencyCode value.
     */
    public String groupHeaderAgencyCode() {
        return this.groupHeaderAgencyCode;
    }

    /**
     * Set the groupHeaderAgencyCode property: The group header agency code.
     *
     * @param groupHeaderAgencyCode the groupHeaderAgencyCode value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withGroupHeaderAgencyCode(String groupHeaderAgencyCode) {
        this.groupHeaderAgencyCode = groupHeaderAgencyCode;
        return this;
    }

    /**
     * Get the groupHeaderVersion property: The group header version.
     *
     * @return the groupHeaderVersion value.
     */
    public String groupHeaderVersion() {
        return this.groupHeaderVersion;
    }

    /**
     * Set the groupHeaderVersion property: The group header version.
     *
     * @param groupHeaderVersion the groupHeaderVersion value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withGroupHeaderVersion(String groupHeaderVersion) {
        this.groupHeaderVersion = groupHeaderVersion;
        return this;
    }

    /**
     * Get the transactionSetControlNumberLowerBound property: The transaction set control number lower bound.
     *
     * @return the transactionSetControlNumberLowerBound value.
     */
    public int transactionSetControlNumberLowerBound() {
        return this.transactionSetControlNumberLowerBound;
    }

    /**
     * Set the transactionSetControlNumberLowerBound property: The transaction set control number lower bound.
     *
     * @param transactionSetControlNumberLowerBound the transactionSetControlNumberLowerBound value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withTransactionSetControlNumberLowerBound(int transactionSetControlNumberLowerBound) {
        this.transactionSetControlNumberLowerBound = transactionSetControlNumberLowerBound;
        return this;
    }

    /**
     * Get the transactionSetControlNumberUpperBound property: The transaction set control number upper bound.
     *
     * @return the transactionSetControlNumberUpperBound value.
     */
    public int transactionSetControlNumberUpperBound() {
        return this.transactionSetControlNumberUpperBound;
    }

    /**
     * Set the transactionSetControlNumberUpperBound property: The transaction set control number upper bound.
     *
     * @param transactionSetControlNumberUpperBound the transactionSetControlNumberUpperBound value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withTransactionSetControlNumberUpperBound(int transactionSetControlNumberUpperBound) {
        this.transactionSetControlNumberUpperBound = transactionSetControlNumberUpperBound;
        return this;
    }

    /**
     * Get the rolloverTransactionSetControlNumber property: The value indicating whether to rollover transaction set
     * control number.
     *
     * @return the rolloverTransactionSetControlNumber value.
     */
    public boolean rolloverTransactionSetControlNumber() {
        return this.rolloverTransactionSetControlNumber;
    }

    /**
     * Set the rolloverTransactionSetControlNumber property: The value indicating whether to rollover transaction set
     * control number.
     *
     * @param rolloverTransactionSetControlNumber the rolloverTransactionSetControlNumber value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withRolloverTransactionSetControlNumber(boolean rolloverTransactionSetControlNumber) {
        this.rolloverTransactionSetControlNumber = rolloverTransactionSetControlNumber;
        return this;
    }

    /**
     * Get the transactionSetControlNumberPrefix property: The transaction set control number prefix.
     *
     * @return the transactionSetControlNumberPrefix value.
     */
    public String transactionSetControlNumberPrefix() {
        return this.transactionSetControlNumberPrefix;
    }

    /**
     * Set the transactionSetControlNumberPrefix property: The transaction set control number prefix.
     *
     * @param transactionSetControlNumberPrefix the transactionSetControlNumberPrefix value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withTransactionSetControlNumberPrefix(String transactionSetControlNumberPrefix) {
        this.transactionSetControlNumberPrefix = transactionSetControlNumberPrefix;
        return this;
    }

    /**
     * Get the transactionSetControlNumberSuffix property: The transaction set control number suffix.
     *
     * @return the transactionSetControlNumberSuffix value.
     */
    public String transactionSetControlNumberSuffix() {
        return this.transactionSetControlNumberSuffix;
    }

    /**
     * Set the transactionSetControlNumberSuffix property: The transaction set control number suffix.
     *
     * @param transactionSetControlNumberSuffix the transactionSetControlNumberSuffix value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withTransactionSetControlNumberSuffix(String transactionSetControlNumberSuffix) {
        this.transactionSetControlNumberSuffix = transactionSetControlNumberSuffix;
        return this;
    }

    /**
     * Get the overwriteExistingTransactionSetControlNumber property: The value indicating whether to overwrite existing
     * transaction set control number.
     *
     * @return the overwriteExistingTransactionSetControlNumber value.
     */
    public boolean overwriteExistingTransactionSetControlNumber() {
        return this.overwriteExistingTransactionSetControlNumber;
    }

    /**
     * Set the overwriteExistingTransactionSetControlNumber property: The value indicating whether to overwrite existing
     * transaction set control number.
     *
     * @param overwriteExistingTransactionSetControlNumber the overwriteExistingTransactionSetControlNumber value to
     *     set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withOverwriteExistingTransactionSetControlNumber(
        boolean overwriteExistingTransactionSetControlNumber) {
        this.overwriteExistingTransactionSetControlNumber = overwriteExistingTransactionSetControlNumber;
        return this;
    }

    /**
     * Get the groupHeaderDateFormat property: The group header date format.
     *
     * @return the groupHeaderDateFormat value.
     */
    public X12DateFormat groupHeaderDateFormat() {
        return this.groupHeaderDateFormat;
    }

    /**
     * Set the groupHeaderDateFormat property: The group header date format.
     *
     * @param groupHeaderDateFormat the groupHeaderDateFormat value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withGroupHeaderDateFormat(X12DateFormat groupHeaderDateFormat) {
        this.groupHeaderDateFormat = groupHeaderDateFormat;
        return this;
    }

    /**
     * Get the groupHeaderTimeFormat property: The group header time format.
     *
     * @return the groupHeaderTimeFormat value.
     */
    public X12TimeFormat groupHeaderTimeFormat() {
        return this.groupHeaderTimeFormat;
    }

    /**
     * Set the groupHeaderTimeFormat property: The group header time format.
     *
     * @param groupHeaderTimeFormat the groupHeaderTimeFormat value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withGroupHeaderTimeFormat(X12TimeFormat groupHeaderTimeFormat) {
        this.groupHeaderTimeFormat = groupHeaderTimeFormat;
        return this;
    }

    /**
     * Get the usageIndicator property: The usage indicator.
     *
     * @return the usageIndicator value.
     */
    public UsageIndicator usageIndicator() {
        return this.usageIndicator;
    }

    /**
     * Set the usageIndicator property: The usage indicator.
     *
     * @param usageIndicator the usageIndicator value to set.
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withUsageIndicator(UsageIndicator usageIndicator) {
        this.usageIndicator = usageIndicator;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (senderApplicationId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property senderApplicationId in model X12EnvelopeSettings"));
        }
        if (receiverApplicationId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property receiverApplicationId in model X12EnvelopeSettings"));
        }
        if (controlVersionNumber() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property controlVersionNumber in model X12EnvelopeSettings"));
        }
        if (groupHeaderAgencyCode() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property groupHeaderAgencyCode in model X12EnvelopeSettings"));
        }
        if (groupHeaderVersion() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property groupHeaderVersion in model X12EnvelopeSettings"));
        }
        if (groupHeaderDateFormat() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property groupHeaderDateFormat in model X12EnvelopeSettings"));
        }
        if (groupHeaderTimeFormat() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property groupHeaderTimeFormat in model X12EnvelopeSettings"));
        }
        if (usageIndicator() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property usageIndicator in model X12EnvelopeSettings"));
        }
    }
}
