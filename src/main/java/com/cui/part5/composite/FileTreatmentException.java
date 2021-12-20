package com.cui.part5.composite;

/**
 * 表示向文件中增加 Entry 时发生的异常的类
 */
public class FileTreatmentException extends RuntimeException {

    public FileTreatmentException() {

    }

    public FileTreatmentException(String message) {
        super(message);
    }
}
