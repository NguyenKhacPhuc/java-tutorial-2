// package org.example.Exception.Ex7;


// import java.io.IOException;

// public class FileReadException extends Exception {
//     public FileReadException(String message) {
//         super(message);
//     }

//     public static String readFile(String path) throws FileReadException {
//         try {
//             readFile(path);
//         } catch (IOException e) {
//             throw new FileReadException("Error reading file " + path);
//         }
//         return null;
//     }
// }