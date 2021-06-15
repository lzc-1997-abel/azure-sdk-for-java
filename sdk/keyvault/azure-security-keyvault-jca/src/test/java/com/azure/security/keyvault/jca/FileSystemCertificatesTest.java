// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.jca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileSystemCertificatesTest {

    FileSystemCertificates fileSystemCertificates;

    public static String getFilePath(String packageName) {
        String filepath = "\\src\\test\\resources\\" + packageName;
        return System.getProperty("user.dir") + filepath.replace("\\", System.getProperty("file.separator"));
    }

    @Test
    public void testSetCertificateEntry() {
        fileSystemCertificates = FileSystemCertificates.getFileSystemCertificates(getFilePath("custom\\"));
        fileSystemCertificates.loadCertificatesFromFileSystem();
        Assertions.assertTrue(fileSystemCertificates.getAliases().contains("sideload"));
    }
}
