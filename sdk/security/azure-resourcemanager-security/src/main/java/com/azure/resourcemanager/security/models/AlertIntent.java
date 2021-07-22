// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AlertIntent. */
public final class AlertIntent extends ExpandableStringEnum<AlertIntent> {
    /** Static value Unknown for AlertIntent. */
    public static final AlertIntent UNKNOWN = fromString("Unknown");

    /** Static value PreAttack for AlertIntent. */
    public static final AlertIntent PRE_ATTACK = fromString("PreAttack");

    /** Static value InitialAccess for AlertIntent. */
    public static final AlertIntent INITIAL_ACCESS = fromString("InitialAccess");

    /** Static value Persistence for AlertIntent. */
    public static final AlertIntent PERSISTENCE = fromString("Persistence");

    /** Static value PrivilegeEscalation for AlertIntent. */
    public static final AlertIntent PRIVILEGE_ESCALATION = fromString("PrivilegeEscalation");

    /** Static value DefenseEvasion for AlertIntent. */
    public static final AlertIntent DEFENSE_EVASION = fromString("DefenseEvasion");

    /** Static value CredentialAccess for AlertIntent. */
    public static final AlertIntent CREDENTIAL_ACCESS = fromString("CredentialAccess");

    /** Static value Discovery for AlertIntent. */
    public static final AlertIntent DISCOVERY = fromString("Discovery");

    /** Static value LateralMovement for AlertIntent. */
    public static final AlertIntent LATERAL_MOVEMENT = fromString("LateralMovement");

    /** Static value Execution for AlertIntent. */
    public static final AlertIntent EXECUTION = fromString("Execution");

    /** Static value Collection for AlertIntent. */
    public static final AlertIntent COLLECTION = fromString("Collection");

    /** Static value Exfiltration for AlertIntent. */
    public static final AlertIntent EXFILTRATION = fromString("Exfiltration");

    /** Static value CommandAndControl for AlertIntent. */
    public static final AlertIntent COMMAND_AND_CONTROL = fromString("CommandAndControl");

    /** Static value Impact for AlertIntent. */
    public static final AlertIntent IMPACT = fromString("Impact");

    /** Static value Probing for AlertIntent. */
    public static final AlertIntent PROBING = fromString("Probing");

    /** Static value Exploitation for AlertIntent. */
    public static final AlertIntent EXPLOITATION = fromString("Exploitation");

    /**
     * Creates or finds a AlertIntent from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AlertIntent.
     */
    @JsonCreator
    public static AlertIntent fromString(String name) {
        return fromString(name, AlertIntent.class);
    }

    /** @return known AlertIntent values. */
    public static Collection<AlertIntent> values() {
        return values(AlertIntent.class);
    }
}
