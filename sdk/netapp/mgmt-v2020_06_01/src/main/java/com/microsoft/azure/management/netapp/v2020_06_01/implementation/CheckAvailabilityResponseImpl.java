/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_06_01.implementation;

import com.microsoft.azure.management.netapp.v2020_06_01.CheckAvailabilityResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.netapp.v2020_06_01.InAvailabilityReasonType;

class CheckAvailabilityResponseImpl extends WrapperImpl<CheckAvailabilityResponseInner> implements CheckAvailabilityResponse {
    private final NetAppManager manager;
    CheckAvailabilityResponseImpl(CheckAvailabilityResponseInner inner, NetAppManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetAppManager manager() {
        return this.manager;
    }

    @Override
    public Boolean isAvailable() {
        return this.inner().isAvailable();
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public InAvailabilityReasonType reason() {
        return this.inner().reason();
    }

}
