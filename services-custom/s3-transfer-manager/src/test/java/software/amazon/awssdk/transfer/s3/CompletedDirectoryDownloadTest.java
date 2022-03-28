/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package software.amazon.awssdk.transfer.s3;

import static org.assertj.core.api.Assertions.assertThat;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

class CompletedDirectoryDownloadTest {

    @Test
    void equalsHashcode() {
        EqualsVerifier.forClass(CompletedDirectoryDownload.class)
                      .withNonnullFields("failedTransfers")
                      .verify();
    }

    @Test
    void defaultBuilder() {
        assertThat(CompletedDirectoryDownload.builder().build().failedTransfers())
            .isEmpty();
    }
}
