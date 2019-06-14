package software.amazon.awssdk.metrics.meter;

/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

import software.amazon.awssdk.annotations.SdkPublicApi;

/**
 * A NoOp implementation of the {@link Counter} metric
 */
@SdkPublicApi
public final class NoOpCounter implements Counter<Number> {

    private NoOpCounter() {
    }

    public static NoOpCounter create() {
        return new NoOpCounter();
    }

    @Override
    public void increment() {

    }

    @Override
    public void increment(Number value) {

    }

    @Override
    public void decrement() {

    }

    @Override
    public void decrement(Number value) {

    }

    @Override
    public Number count() {
        return 0;
    }
}
