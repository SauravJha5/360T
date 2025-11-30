package com.sixtythreet0.player.core;

import com.sixtythreet0.player.model.Message;

public interface Player {
    void start() throws Exception;
    void shutdown() throws Exception;
    void send(Message msg) throws Exception;
}
