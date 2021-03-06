package me.j360.jdk.application.remote;

/**
 * @author Robert HG (254963746@qq.com) on 11/3/15.
 */
public enum IdleState {
    /**
     * No data was received for a while.
     */
    READER_IDLE,
    /**
     * No data was sent for a while.
     */
    WRITER_IDLE,
    /**
     * No data was either received or sent for a while.
     */
    ALL_IDLE
}
