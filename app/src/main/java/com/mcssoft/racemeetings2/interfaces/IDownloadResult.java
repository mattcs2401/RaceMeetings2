package com.mcssoft.racemeetings2.interfaces;

/**
 * Used to provide an interface between the async task of DownloadData and the MainActivity.
 */
public interface IDownloadResult {
    /**
     * XML downloadResult results as a string
     * @param table Results relate to this table.
     * @param results Results of the operation.
     */
    void downloadResult(String table, String results);
}