/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author Gopi
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class ZipFiles {
    public static void main(String[] paths) {

        String zipFile = "D:/pcs/ZipFiles/"+paths[0]+".zip";
        String[] srcFiles = {paths[1],paths[2]};
        try {
            // create byte buffer
            byte[] buffer = new byte[1024];
            FileOutputStream fos = new FileOutputStream(zipFile);
            ZipOutputStream zos = new ZipOutputStream(fos);
            for (int i=0; i < srcFiles.length; i++) {
                File srcFile = new File(srcFiles[i]);
                FileInputStream fis = new FileInputStream(srcFile);
                // begin writing a new ZIP entry, positions the stream to the start of the entry data
                zos.putNextEntry(new ZipEntry(srcFile.getName()));
                int length;
                while ((length = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, length);
                }
                zos.closeEntry();
                // close the InputStream
                fis.close();
            }
            // close the ZipOutputStream
            zos.close();
        }
        catch (IOException ioe) {
            System.out.println("Error creating zip file: " + ioe);
        }
    }
}

 
